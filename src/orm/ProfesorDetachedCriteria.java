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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProfesorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression cantCursos;
	public final CollectionExpression curso_profesor;
	public final CollectionExpression sueldo_profesor;
	
	public ProfesorDetachedCriteria() {
		super(orm.Profesor.class, orm.ProfesorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		cantCursos = new IntegerExpression("cantCursos", this.getDetachedCriteria());
		curso_profesor = new CollectionExpression("ORM_Curso_profesor", this.getDetachedCriteria());
		sueldo_profesor = new CollectionExpression("ORM_Sueldo_profesor", this.getDetachedCriteria());
	}
	
	public ProfesorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ProfesorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		cantCursos = new IntegerExpression("cantCursos", this.getDetachedCriteria());
		curso_profesor = new CollectionExpression("ORM_Curso_profesor", this.getDetachedCriteria());
		sueldo_profesor = new CollectionExpression("ORM_Sueldo_profesor", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona"));
	}
	
	public Curso_profesorDetachedCriteria createCurso_profesorCriteria() {
		return new Curso_profesorDetachedCriteria(createCriteria("ORM_Curso_profesor"));
	}
	
	public Sueldo_profesorDetachedCriteria createSueldo_profesorCriteria() {
		return new Sueldo_profesorDetachedCriteria(createCriteria("ORM_Sueldo_profesor"));
	}
	
	public Profesor uniqueProfesor(PersistentSession session) {
		return (Profesor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Profesor[] listProfesor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Profesor[]) list.toArray(new Profesor[list.size()]);
	}
}

