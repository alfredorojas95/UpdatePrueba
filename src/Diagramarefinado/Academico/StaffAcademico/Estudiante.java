package Diagramarefinado.Academico.StaffAcademico;

import org.orm.PersistentException;

import Diagramarefinado.Persona.*;

public class Estudiante extends Persona {

	/**
	 * 
	 * @param nuevaPer
	 * @param rut
	 */
	public void agregarNuevoEstudiante(Persona nuevaPer, String rut) {
		// TODO - implement Estudiante.agregarNuevoEstudiante
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Este método permite agregar un nuevo estudiante a la base de datos
	 * 
	 * @param nuevaPer
	 * @return
	 */
	public static String inscribirAlumnos(Persona nuevaPer,String rutSecretaria) {
		// TODO Initialize the properties of the persistent object here, the
		// following properties must be initialized before saving : matricula,
		// estudiante_curso
		try {
			/*
			 * se busca en la base de datos que la persona que se quiere agregar
			 * no haya sido ingresada anteriormente, esto se hace a través de
			 * rut de la persona
			 */
			String rutEstudiante = "rut='" + nuevaPer.getRut() + "'";
			orm.Persona buscarPorRut = orm.PersonaDAO.loadPersonaByQuery(rutEstudiante, null);
			
			/*
			 * se busca si existe la secretaria con el atributo
			 * rutSecretaria, para vincularla con el registro de la
			 * matrícula a estado no pagada desde que se agrega el estudiante
			 */
			String strRutSecretaria = "persona.rut='" + rutSecretaria + "'";
			orm.Secretaria lormSecretaria = orm.SecretariaDAO.loadSecretariaByQuery(strRutSecretaria, null);
			/**
			 * si no se encontró el rut de la persona, es decir, la persona no
			 * existía, se crea una persona y se setean los atributos de la
			 * clase 'Persona'. Finlamente se guardan los datos.
			 */
			if ((buscarPorRut == null)&&(lormSecretaria!=null)) {
				orm.Persona lormPersona = orm.PersonaDAO.createPersona();
				lormPersona.setNombre(nuevaPer.getNombre());
				lormPersona.setApellido(nuevaPer.getApellido());
				lormPersona.setRut(nuevaPer.getRut());
				orm.PersonaDAO.save(lormPersona);
				/*
				 * una vez que se guadaron los datos en lormPersona, se
				 * instancia un lormEstudiante y se le pasa lormPersona
				 */
				orm.Estudiante lormEstudiante = orm.EstudianteDAO.createEstudiante();
				lormEstudiante.setPersona(lormPersona);
				orm.EstudianteDAO.save(lormEstudiante);

				/*
				 * se crea un lormMatricula para setiar el estado de la
				 * matrícula a 0, que representa el estado no pagada y cuando se
				 * matricula cambia a 1 que representa el estado matrícula
				 * pagada. También a lormMatricula se le setean sus valores para
				 * vincular los "id" de la secretaria y del estudiante, y asi
				 * vincularlos con sus claves primarias
				 */
				orm.Matricula lormMatricula = orm.MatriculaDAO.createMatricula();
				// TODO Initialize the properties of the persistent object here,
				// the
				// following properties must be initialized before saving :
				// estudiante
				lormMatricula.setEstudiante(lormEstudiante);
				lormMatricula.setSecretaria(lormSecretaria);
				lormMatricula.setEstadoMatricula(0);
				orm.MatriculaDAO.save(lormMatricula);
				return "se agregó exitosamente el estudiante";
			} else {
				return "no se pudo agregar el estudiante";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 
	 * @param rut
	 */
	public void buscarEstudiante(String rut) {
		// TODO - implement Estudiante.buscarEstudiante
		throw new UnsupportedOperationException();
	}

}