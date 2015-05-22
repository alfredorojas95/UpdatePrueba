/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteEntidadRelacionPruebaPrograData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Mensualidad lormMensualidad = orm.MensualidadDAO.loadMensualidadByQuery(null, null);
			// Delete the persistent object
			orm.MensualidadDAO.delete(lormMensualidad);
			orm.Secretaria lormSecretaria = orm.SecretariaDAO.loadSecretariaByQuery(null, null);
			// Delete the persistent object
			orm.SecretariaDAO.delete(lormSecretaria);
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Delete the persistent object
			orm.PersonaDAO.delete(lormPersona);
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(null, null);
			// Delete the persistent object
			orm.EstudianteDAO.delete(lormEstudiante);
			orm.Curso lormCurso = orm.CursoDAO.loadCursoByQuery(null, null);
			// Delete the persistent object
			orm.CursoDAO.delete(lormCurso);
			orm.Director lormDirector = orm.DirectorDAO.loadDirectorByQuery(null, null);
			// Delete the persistent object
			orm.DirectorDAO.delete(lormDirector);
			orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(null, null);
			// Delete the persistent object
			orm.ProfesorDAO.delete(lormProfesor);
			orm.Matricula lormMatricula = orm.MatriculaDAO.loadMatriculaByQuery(null, null);
			// Delete the persistent object
			orm.MatriculaDAO.delete(lormMatricula);
			orm.Jefeadministracion lormJefeadministracion = orm.JefeadministracionDAO.loadJefeadministracionByQuery(null, null);
			// Delete the persistent object
			orm.JefeadministracionDAO.delete(lormJefeadministracion);
			orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.loadEstudiante_cursoByQuery(null, null);
			// Delete the persistent object
			orm.Estudiante_cursoDAO.delete(lormEstudiante_curso);
			orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.loadCurso_profesorByQuery(null, null);
			// Delete the persistent object
			orm.Curso_profesorDAO.delete(lormCurso_profesor);
			orm.Sueldo lormSueldo = orm.SueldoDAO.loadSueldoByQuery(null, null);
			// Delete the persistent object
			orm.SueldoDAO.delete(lormSueldo);
			orm.Sueldo_profesor lormSueldo_profesor = orm.Sueldo_profesorDAO.loadSueldo_profesorByQuery(null, null);
			// Delete the persistent object
			orm.Sueldo_profesorDAO.delete(lormSueldo_profesor);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteEntidadRelacionPruebaPrograData deleteEntidadRelacionPruebaPrograData = new DeleteEntidadRelacionPruebaPrograData();
			try {
				deleteEntidadRelacionPruebaPrograData.deleteTestData();
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
