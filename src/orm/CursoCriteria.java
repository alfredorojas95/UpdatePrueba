/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package orm;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CursoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombreCurso;
	public final IntegerExpression estadocurso;
	public final IntegerExpression directorId;
	public final AssociationExpression director;
	public final IntegerExpression cupos;
	public final CollectionExpression estudiante_curso;
	public final CollectionExpression curso_profesor;
	
	public CursoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombreCurso = new StringExpression("nombreCurso", this);
		estadocurso = new IntegerExpression("estadocurso", this);
		directorId = new IntegerExpression("director.id", this);
		director = new AssociationExpression("director", this);
		cupos = new IntegerExpression("cupos", this);
		estudiante_curso = new CollectionExpression("ORM_Estudiante_curso", this);
		curso_profesor = new CollectionExpression("ORM_Curso_profesor", this);
	}
	
	public CursoCriteria(PersistentSession session) {
		this(session.createCriteria(Curso.class));
	}
	
	public CursoCriteria() throws PersistentException {
		this(orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession());
	}
	
	public DirectorCriteria createDirectorCriteria() {
		return new DirectorCriteria(createCriteria("director"));
	}
	
	public Estudiante_cursoCriteria createEstudiante_cursoCriteria() {
		return new Estudiante_cursoCriteria(createCriteria("ORM_Estudiante_curso"));
	}
	
	public Curso_profesorCriteria createCurso_profesorCriteria() {
		return new Curso_profesorCriteria(createCriteria("ORM_Curso_profesor"));
	}
	
	public Curso uniqueCurso() {
		return (Curso) super.uniqueResult();
	}
	
	public Curso[] listCurso() {
		java.util.List list = super.list();
		return (Curso[]) list.toArray(new Curso[list.size()]);
	}
}

