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

public class SueldoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression monto;
	public final CollectionExpression sueldo_profesor;
	
	public SueldoDetachedCriteria() {
		super(orm.Sueldo.class, orm.SueldoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		monto = new IntegerExpression("monto", this.getDetachedCriteria());
		sueldo_profesor = new CollectionExpression("ORM_Sueldo_profesor", this.getDetachedCriteria());
	}
	
	public SueldoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.SueldoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		monto = new IntegerExpression("monto", this.getDetachedCriteria());
		sueldo_profesor = new CollectionExpression("ORM_Sueldo_profesor", this.getDetachedCriteria());
	}
	
	public Sueldo_profesorDetachedCriteria createSueldo_profesorCriteria() {
		return new Sueldo_profesorDetachedCriteria(createCriteria("ORM_Sueldo_profesor"));
	}
	
	public Sueldo uniqueSueldo(PersistentSession session) {
		return (Sueldo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Sueldo[] listSueldo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Sueldo[]) list.toArray(new Sueldo[list.size()]);
	}
}

