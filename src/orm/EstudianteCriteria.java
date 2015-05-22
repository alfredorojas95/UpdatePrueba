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

public class EstudianteCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final CollectionExpression mensualidad;
	public final IntegerExpression matriculaId;
	public final AssociationExpression matricula;
	public final CollectionExpression estudiante_curso;
	
	public EstudianteCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
		mensualidad = new CollectionExpression("ORM_Mensualidad", this);
		matriculaId = new IntegerExpression("matricula.id", this);
		matricula = new AssociationExpression("matricula", this);
		estudiante_curso = new CollectionExpression("ORM_Estudiante_curso", this);
	}
	
	public EstudianteCriteria(PersistentSession session) {
		this(session.createCriteria(Estudiante.class));
	}
	
	public EstudianteCriteria() throws PersistentException {
		this(orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersonaCriteria() {
		return new PersonaCriteria(createCriteria("persona"));
	}
	
	public MensualidadCriteria createMensualidadCriteria() {
		return new MensualidadCriteria(createCriteria("ORM_Mensualidad"));
	}
	
	public MatriculaCriteria createMatriculaCriteria() {
		return new MatriculaCriteria(createCriteria("matricula"));
	}
	
	public Estudiante_cursoCriteria createEstudiante_cursoCriteria() {
		return new Estudiante_cursoCriteria(createCriteria("ORM_Estudiante_curso"));
	}
	
	public Estudiante uniqueEstudiante() {
		return (Estudiante) super.uniqueResult();
	}
	
	public Estudiante[] listEstudiante() {
		java.util.List list = super.list();
		return (Estudiante[]) list.toArray(new Estudiante[list.size()]);
	}
}

