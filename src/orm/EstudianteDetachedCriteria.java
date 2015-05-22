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

public class EstudianteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final CollectionExpression mensualidad;
	public final IntegerExpression matriculaId;
	public final AssociationExpression matricula;
	public final CollectionExpression estudiante_curso;
	
	public EstudianteDetachedCriteria() {
		super(orm.Estudiante.class, orm.EstudianteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		mensualidad = new CollectionExpression("ORM_Mensualidad", this.getDetachedCriteria());
		matriculaId = new IntegerExpression("matricula.id", this.getDetachedCriteria());
		matricula = new AssociationExpression("matricula", this.getDetachedCriteria());
		estudiante_curso = new CollectionExpression("ORM_Estudiante_curso", this.getDetachedCriteria());
	}
	
	public EstudianteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.EstudianteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		mensualidad = new CollectionExpression("ORM_Mensualidad", this.getDetachedCriteria());
		matriculaId = new IntegerExpression("matricula.id", this.getDetachedCriteria());
		matricula = new AssociationExpression("matricula", this.getDetachedCriteria());
		estudiante_curso = new CollectionExpression("ORM_Estudiante_curso", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona"));
	}
	
	public MensualidadDetachedCriteria createMensualidadCriteria() {
		return new MensualidadDetachedCriteria(createCriteria("ORM_Mensualidad"));
	}
	
	public MatriculaDetachedCriteria createMatriculaCriteria() {
		return new MatriculaDetachedCriteria(createCriteria("matricula"));
	}
	
	public Estudiante_cursoDetachedCriteria createEstudiante_cursoCriteria() {
		return new Estudiante_cursoDetachedCriteria(createCriteria("ORM_Estudiante_curso"));
	}
	
	public Estudiante uniqueEstudiante(PersistentSession session) {
		return (Estudiante) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estudiante[] listEstudiante(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estudiante[]) list.toArray(new Estudiante[list.size()]);
	}
}

