/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateEntidadRelacionPruebaPrograData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Mensualidad lormMensualidad = orm.MensualidadDAO.createMensualidad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : monto, mes, estudiante, secretaria
			orm.MensualidadDAO.save(lormMensualidad);
			orm.Secretaria lormSecretaria = orm.SecretariaDAO.createSecretaria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mensualidad, persona
			orm.SecretariaDAO.save(lormSecretaria);
			orm.Persona lormPersona = orm.PersonaDAO.createPersona();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : jefeadministracion, profesor, director, estudiante, secretaria, rut, apellido, nombre
			orm.PersonaDAO.save(lormPersona);
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.createEstudiante();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estudiante_curso, matricula, mensualidad, persona
			orm.EstudianteDAO.save(lormEstudiante);
			orm.Curso lormCurso = orm.CursoDAO.createCurso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : curso_profesor, estudiante_curso, director, nombreCurso
			orm.CursoDAO.save(lormCurso);
			orm.Director lormDirector = orm.DirectorDAO.createDirector();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : curso, persona
			orm.DirectorDAO.save(lormDirector);
			orm.Profesor lormProfesor = orm.ProfesorDAO.createProfesor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sueldo_profesor, curso_profesor, persona
			orm.ProfesorDAO.save(lormProfesor);
			orm.Matricula lormMatricula = orm.MatriculaDAO.createMatricula();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estudiante
			orm.MatriculaDAO.save(lormMatricula);
			orm.Jefeadministracion lormJefeadministracion = orm.JefeadministracionDAO.createJefeadministracion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sueldo_profesor, persona
			orm.JefeadministracionDAO.save(lormJefeadministracion);
			orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.createEstudiante_curso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : curso, estudiante
			orm.Estudiante_cursoDAO.save(lormEstudiante_curso);
			orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.createCurso_profesor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : profesor, curso
			orm.Curso_profesorDAO.save(lormCurso_profesor);
			orm.Sueldo lormSueldo = orm.SueldoDAO.createSueldo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sueldo_profesor, monto
			orm.SueldoDAO.save(lormSueldo);
			orm.Sueldo_profesor lormSueldo_profesor = orm.Sueldo_profesorDAO.createSueldo_profesor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mes, jefeadministracion
			orm.Sueldo_profesorDAO.save(lormSueldo_profesor);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateEntidadRelacionPruebaPrograData createEntidadRelacionPruebaPrograData = new CreateEntidadRelacionPruebaPrograData();
			try {
				createEntidadRelacionPruebaPrograData.createTestData();
			}
			finally {
				orm.EntidadRelacionPruebaPrograPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
