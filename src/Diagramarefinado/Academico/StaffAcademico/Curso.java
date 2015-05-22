package Diagramarefinado.Academico.StaffAcademico;

import org.orm.PersistentException;

public class Curso {

	private String nombreCurso;

	public Curso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	
	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}


	public void desactivarCurso() {
		// TODO - implement Curso.desactivarCurso
		throw new UnsupportedOperationException();
	}
	/**
	 * método que crea el curso en la base de datos en este método no hay
	 * validaciones de nombre, ya que pueden existir cursos con el mismo nombre
	 * pero que se imparten para carreras distintas, en el caso del código del
	 * curso, automáticamente al crearlo se le asigna su clave primaria que va
	 * aumentando de uno en uno, por lo no se tendrán cursos con el mismo código
	 */
	public static String  crearCurso(Curso nuevoCurso, String rutDirector) {
		// TODO Initialize the properties of the persistent object here, the
		// following properties must be initialized before saving :
		// curso_profesor, estudiante_curso
		try {
			String estadoProfesor = "rut='" + rutDirector + "'";
			orm.Director lormDirector = orm.DirectorDAO.loadDirectorByQuery(estadoProfesor, null);
			/*
			 * se crea el curso y se le setea el nombre, posteriormente se
			 * guarda en la base de datos
			 */
			if (lormDirector!=null){
				orm.Curso lormCurso = orm.CursoDAO.createCurso();
				lormCurso.setNombreCurso(nuevoCurso.getNombreCurso());
				lormCurso.setDirector(lormDirector);
				lormCurso.setEstadocurso(1);
				orm.CursoDAO.save(lormCurso);
				return "se creó el curso exitosamente";
			} else {
				return "no se pudo crear el curso";
			}
		
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	/**
	 * método que permite asignarle un profesor al curso creado, la condicion
	 * para esto es que el código del curso (id) exista y que el profesor exista
	 */
	public static String asignarProfesor(int id, String nombreCurso,String rutProfe) {
		// TODO Initialize the properties of the persistent object here, the
		// following properties must be initialized before saving : sueldo,
		// profesor, curso
		try {
			//obtener el nombre del curso con el "id"
			String condicionCurso = "id='" + id + "'";
			orm.Curso lormCurso = orm.CursoDAO.loadCursoByQuery(condicionCurso,	null);
			String nom = lormCurso.getNombreCurso();

			//verificar que el profesor exista
			String rutProfesor = "persona.rut='" + rutProfe + "'";
			orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(rutProfesor, null);
			
			/*
			 * verificar que el mismo curso no se le asigne a dos profesores
			 * si no se encuentra el curso en la tabla curso_Profesor quiere decir que no se le ha asignado
			 * nada hasta el momento es decir es nulo y se le puede asignar un profesor
			 */
			String conCur_Prof = "curso.id='" + id + "'";
			orm.Curso_profesor lormCurso_profesor2 = orm.Curso_profesorDAO.loadCurso_profesorByQuery(conCur_Prof, null);

			/*
			 * si el nombre que se pasó con por parámetros conside con el nombre obtenido 
			 * a treavés del id, el nombre del curso existe y el profesor existe
			 * se crea un objeto lormCurso y se le setean el curso y el profesor.
			 * Finalmente se guarda y retorna el valor
			 */
			if ((nom.equals(nombreCurso))&& (lormProfesor != null)&&(lormCurso_profesor2==null)) {
				orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.createCurso_profesor();
				lormCurso_profesor.setCurso(lormCurso);
				lormCurso_profesor.setProfesor(lormProfesor);
				orm.Curso_profesorDAO.save(lormCurso_profesor);
				return "profesor asignado";
			} else {
				return "no se pudo asignar el profesor";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}