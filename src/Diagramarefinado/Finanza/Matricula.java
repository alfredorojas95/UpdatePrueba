package Diagramarefinado.Finanza;

import org.orm.PersistentException;
/**
 * 
 * @author Alfredo
 *
 */
public class Matricula {

	private int estadoMatricula;
	private int monto;

	public void regPagoMatricula() {
		// TODO - implement Matricula.regPagoMatricula
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Este método sirve para pagar la matrícula 
	 * 
	 * @param rutEstudiante
	 * @param rutSecretaria
	 * @return
	 */
	public static String pagarMatricula(String rutEstudiante,String rutSecretaria) {

		// TODO Initialize the properties of the persistent object here, the
		// following properties must be initialized before saving : matricula,
		// estudiante_curso
		try {
			/*
			 * se buscan los objetos con el rut del estudiante y de la secretaria pasados por parámetros
			 * para verificar que estén en la base de datos
			 */
			String condicionEstudiante = "persona.rut='" + rutEstudiante + "'";
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(condicionEstudiante, null);
			
			String condicionSecretaria = "persona.rut='" + rutSecretaria + "'";
			orm.Secretaria lormSecretaria = orm.SecretariaDAO.loadSecretariaByQuery(condicionSecretaria, null);

			/**
			 * validar que el rut de la secretario y el del alumno existan para
			 * poder pagar la matrícula
			 */
			if ((lormEstudiante != null) && (lormSecretaria != null)) {
				/*
				 * se verifica que para el estudiante en cuestion, su matrícula esté en estado "0"
				 * que significa matricula no pagada
				 */
				String pagoRealizado = "secretaria=" + lormSecretaria + ""+ " and estudiante=" + lormEstudiante + "";
				orm.Matricula lormMatriculaExiste = orm.MatriculaDAO.loadMatriculaByQuery(pagoRealizado, null);
				//verificar estado no pagado
				if(lormMatriculaExiste.getEstadoMatricula()==0){
					/*
					 * se busca la matrícula especifica para ese estudiante específico con su id
					 * para setear su valor a 1 (equivalente a pagado)
					 */
					String condicionMatricula = "estudiante.id='"+ lormEstudiante.getId() + "'";
					orm.Matricula lormMatricula = orm.MatriculaDAO.loadMatriculaByQuery(condicionMatricula, null);

					lormMatricula.setSecretaria(lormSecretaria);
					lormMatricula.setEstadoMatricula(1);
					lormMatricula.setMonto(20000);
					orm.MatriculaDAO.save(lormMatricula);
					return "matrícula pagada";
				} else {
				 return "no se puedo pagar la matrícula";
			}
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * este método recorre toda la tabla de estudiantes y concatena los estudiantes que no hayan 
	 * pagado la matrícula, es decir, su estado sea igual a 0
	 * @return
	 */
	public static orm.Estudiante[] obtenerListMorososMatricula() {
		//ArrayList<Estudiante> estMorosos = new ArrayList<Estudiante>();
		orm.Estudiante[] ormEstudiantes = null;
		try {
			System.out.println("Listing Estudiante...");
			String condicionEstudiante = "matricula.estadoMatricula='" + 0 + "'";
			ormEstudiantes = orm.EstudianteDAO.listEstudianteByQuery(condicionEstudiante, null);

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ormEstudiantes;
	}

}