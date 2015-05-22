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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class JefeadministracionDAO {
	public static Jefeadministracion loadJefeadministracionByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession();
			return loadJefeadministracionByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion getJefeadministracionByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession();
			return getJefeadministracionByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion loadJefeadministracionByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession();
			return loadJefeadministracionByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion getJefeadministracionByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession();
			return getJefeadministracionByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion loadJefeadministracionByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Jefeadministracion) session.load(orm.Jefeadministracion.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion getJefeadministracionByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Jefeadministracion) session.get(orm.Jefeadministracion.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion loadJefeadministracionByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Jefeadministracion) session.load(orm.Jefeadministracion.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion getJefeadministracionByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Jefeadministracion) session.get(orm.Jefeadministracion.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJefeadministracion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession();
			return queryJefeadministracion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJefeadministracion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession();
			return queryJefeadministracion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion[] listJefeadministracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession();
			return listJefeadministracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion[] listJefeadministracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession();
			return listJefeadministracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJefeadministracion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Jefeadministracion as Jefeadministracion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJefeadministracion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Jefeadministracion as Jefeadministracion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Jefeadministracion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion[] listJefeadministracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryJefeadministracion(session, condition, orderBy);
			return (Jefeadministracion[]) list.toArray(new Jefeadministracion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion[] listJefeadministracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryJefeadministracion(session, condition, orderBy, lockMode);
			return (Jefeadministracion[]) list.toArray(new Jefeadministracion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion loadJefeadministracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession();
			return loadJefeadministracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion loadJefeadministracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession();
			return loadJefeadministracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion loadJefeadministracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Jefeadministracion[] jefeadministracions = listJefeadministracionByQuery(session, condition, orderBy);
		if (jefeadministracions != null && jefeadministracions.length > 0)
			return jefeadministracions[0];
		else
			return null;
	}
	
	public static Jefeadministracion loadJefeadministracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Jefeadministracion[] jefeadministracions = listJefeadministracionByQuery(session, condition, orderBy, lockMode);
		if (jefeadministracions != null && jefeadministracions.length > 0)
			return jefeadministracions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateJefeadministracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession();
			return iterateJefeadministracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJefeadministracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession();
			return iterateJefeadministracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJefeadministracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Jefeadministracion as Jefeadministracion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJefeadministracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Jefeadministracion as Jefeadministracion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Jefeadministracion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion createJefeadministracion() {
		return new orm.Jefeadministracion();
	}
	
	public static boolean save(orm.Jefeadministracion jefeadministracion) throws PersistentException {
		try {
			orm.EntidadRelacionPruebaPrograPersistentManager.instance().saveObject(jefeadministracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Jefeadministracion jefeadministracion) throws PersistentException {
		try {
			orm.EntidadRelacionPruebaPrograPersistentManager.instance().deleteObject(jefeadministracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Jefeadministracion jefeadministracion)throws PersistentException {
		try {
			if(jefeadministracion.getPersona() != null) {
				jefeadministracion.getPersona().setJefeadministracion(null);
			}
			
			orm.Sueldo_profesor[] lSueldo_profesors = jefeadministracion.sueldo_profesor.toArray();
			for(int i = 0; i < lSueldo_profesors.length; i++) {
				lSueldo_profesors[i].setJefeadministracion(null);
			}
			return delete(jefeadministracion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Jefeadministracion jefeadministracion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(jefeadministracion.getPersona() != null) {
				jefeadministracion.getPersona().setJefeadministracion(null);
			}
			
			orm.Sueldo_profesor[] lSueldo_profesors = jefeadministracion.sueldo_profesor.toArray();
			for(int i = 0; i < lSueldo_profesors.length; i++) {
				lSueldo_profesors[i].setJefeadministracion(null);
			}
			try {
				session.delete(jefeadministracion);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Jefeadministracion jefeadministracion) throws PersistentException {
		try {
			orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession().refresh(jefeadministracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Jefeadministracion jefeadministracion) throws PersistentException {
		try {
			orm.EntidadRelacionPruebaPrograPersistentManager.instance().getSession().evict(jefeadministracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jefeadministracion loadJefeadministracionByCriteria(JefeadministracionCriteria jefeadministracionCriteria) {
		Jefeadministracion[] jefeadministracions = listJefeadministracionByCriteria(jefeadministracionCriteria);
		if(jefeadministracions == null || jefeadministracions.length == 0) {
			return null;
		}
		return jefeadministracions[0];
	}
	
	public static Jefeadministracion[] listJefeadministracionByCriteria(JefeadministracionCriteria jefeadministracionCriteria) {
		return jefeadministracionCriteria.listJefeadministracion();
	}
}
