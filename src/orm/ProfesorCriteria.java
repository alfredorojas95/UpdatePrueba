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

public class ProfesorCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression cantCursos;
	public final CollectionExpression curso_profesor;
	public final CollectionExpression sueldo_profesor;
	
	public ProfesorCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
		cantCursos = new IntegerExpression("cantCursos", this);
		curso_profesor = new CollectionExpression("ORM_Curso_profesor", this);
		sueldo_profesor = new CollectionExpression("ORM_Sueldo_profesor", this);
	}
	
	public ProfesorCriteria(PersistentSession session) {
		this(session.createCriteria(Profesor.class));
	}
	
	public ProfesorCriteria() throws PersistentException {
		this(orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersonaCriteria() {
		return new PersonaCriteria(createCriteria("persona"));
	}
	
	public Curso_profesorCriteria createCurso_profesorCriteria() {
		return new Curso_profesorCriteria(createCriteria("ORM_Curso_profesor"));
	}
	
	public Sueldo_profesorCriteria createSueldo_profesorCriteria() {
		return new Sueldo_profesorCriteria(createCriteria("ORM_Sueldo_profesor"));
	}
	
	public Profesor uniqueProfesor() {
		return (Profesor) super.uniqueResult();
	}
	
	public Profesor[] listProfesor() {
		java.util.List list = super.list();
		return (Profesor[]) list.toArray(new Profesor[list.size()]);
	}
}

