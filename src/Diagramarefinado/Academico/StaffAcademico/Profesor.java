package Diagramarefinado.Academico.StaffAcademico;

import org.orm.PersistentException;

import Diagramarefinado.Persona.*;

public class Profesor extends Persona {

	/**
	 * este método permite agregar un nuevo profesor a la base de datos
	 * 
	 * @param nuevaPer
	 * @return
	 */
	public static String agregarNuevoProfesor(Persona nuevaPer) {
		// TODO Initialize the properties of the persistent object here, the
		// following properties must be initialized before saving :
		// curso_profesor
		try {
			/*
			 * se busca en la base de datos que la persona que se quiere agregar
			 * no haya sido ingresada anteriormente, esto se
			 * hace a través de rut de la persona
			 */
			String rutProfesor = "rut='" + nuevaPer.getRut() + "'";
			orm.Persona buscarPorRut = orm.PersonaDAO.loadPersonaByQuery(rutProfesor, null);
			/**
			 * si no se encontró el rut de la persona, es decir, la persona no
			 * existía, se crea una persona y se setean los atributos de la
			 * clase 'Persona'. Finlamente se guardan los datos.
			 */
			if (buscarPorRut == null) {
				orm.Persona lormPersona = orm.PersonaDAO.createPersona();
				lormPersona.setNombre(nuevaPer.getNombre());
				lormPersona.setApellido(nuevaPer.getApellido());
				lormPersona.setRut(nuevaPer.getRut());
				orm.PersonaDAO.save(lormPersona);
				/*
				 * una vez que se guadaron los datos en lormPersona, se
				 * instancia un lormProfesor y se le pasa lormPersona
				 */
				orm.Profesor lormProfesor = orm.ProfesorDAO.createProfesor();
				lormProfesor.setPersona(lormPersona);
				orm.ProfesorDAO.save(lormProfesor);
				return "se agregó el profesor";
			} else {
				return "no se puedo guardar, el rut del profesor ya existe";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void buscarProfesor() {
		// TODO - implement Profesor.buscarProfesor
		throw new UnsupportedOperationException();
	}

}