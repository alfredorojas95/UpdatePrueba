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

public class SueldoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression monto;
	public final CollectionExpression sueldo_profesor;
	
	public SueldoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		monto = new IntegerExpression("monto", this);
		sueldo_profesor = new CollectionExpression("ORM_Sueldo_profesor", this);
	}
	
	public SueldoCriteria(PersistentSession session) {
		this(session.createCriteria(Sueldo.class));
	}
	
	public SueldoCriteria() throws PersistentException {
		this(orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession());
	}
	
	public Sueldo_profesorCriteria createSueldo_profesorCriteria() {
		return new Sueldo_profesorCriteria(createCriteria("ORM_Sueldo_profesor"));
	}
	
	public Sueldo uniqueSueldo() {
		return (Sueldo) super.uniqueResult();
	}
	
	public Sueldo[] listSueldo() {
		java.util.List list = super.list();
		return (Sueldo[]) list.toArray(new Sueldo[list.size()]);
	}
}

