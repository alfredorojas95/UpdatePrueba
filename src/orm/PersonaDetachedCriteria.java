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

public class PersonaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression rut;
	public final IntegerExpression secretariaId;
	public final AssociationExpression secretaria;
	public final IntegerExpression estudianteId;
	public final AssociationExpression estudiante;
	public final IntegerExpression directorId;
	public final AssociationExpression director;
	public final IntegerExpression profesorId;
	public final AssociationExpression profesor;
	public final IntegerExpression jefeadministracionId;
	public final AssociationExpression jefeadministracion;
	
	public PersonaDetachedCriteria() {
		super(orm.Persona.class, orm.PersonaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		secretariaId = new IntegerExpression("secretaria.id", this.getDetachedCriteria());
		secretaria = new AssociationExpression("secretaria", this.getDetachedCriteria());
		estudianteId = new IntegerExpression("estudiante.id", this.getDetachedCriteria());
		estudiante = new AssociationExpression("estudiante", this.getDetachedCriteria());
		directorId = new IntegerExpression("director.id", this.getDetachedCriteria());
		director = new AssociationExpression("director", this.getDetachedCriteria());
		profesorId = new IntegerExpression("profesor.id", this.getDetachedCriteria());
		profesor = new AssociationExpression("profesor", this.getDetachedCriteria());
		jefeadministracionId = new IntegerExpression("jefeadministracion.id", this.getDetachedCriteria());
		jefeadministracion = new AssociationExpression("jefeadministracion", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.PersonaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		secretariaId = new IntegerExpression("secretaria.id", this.getDetachedCriteria());
		secretaria = new AssociationExpression("secretaria", this.getDetachedCriteria());
		estudianteId = new IntegerExpression("estudiante.id", this.getDetachedCriteria());
		estudiante = new AssociationExpression("estudiante", this.getDetachedCriteria());
		directorId = new IntegerExpression("director.id", this.getDetachedCriteria());
		director = new AssociationExpression("director", this.getDetachedCriteria());
		profesorId = new IntegerExpression("profesor.id", this.getDetachedCriteria());
		profesor = new AssociationExpression("profesor", this.getDetachedCriteria());
		jefeadministracionId = new IntegerExpression("jefeadministracion.id", this.getDetachedCriteria());
		jefeadministracion = new AssociationExpression("jefeadministracion", this.getDetachedCriteria());
	}
	
	public SecretariaDetachedCriteria createSecretariaCriteria() {
		return new SecretariaDetachedCriteria(createCriteria("secretaria"));
	}
	
	public EstudianteDetachedCriteria createEstudianteCriteria() {
		return new EstudianteDetachedCriteria(createCriteria("estudiante"));
	}
	
	public DirectorDetachedCriteria createDirectorCriteria() {
		return new DirectorDetachedCriteria(createCriteria("director"));
	}
	
	public ProfesorDetachedCriteria createProfesorCriteria() {
		return new ProfesorDetachedCriteria(createCriteria("profesor"));
	}
	
	public JefeadministracionDetachedCriteria createJefeadministracionCriteria() {
		return new JefeadministracionDetachedCriteria(createCriteria("jefeadministracion"));
	}
	
	public Persona uniquePersona(PersistentSession session) {
		return (Persona) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Persona[] listPersona(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

