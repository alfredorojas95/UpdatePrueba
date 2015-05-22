package Diagramarefinado.StaffAdministracion;

import org.orm.PersistentException;

import Diagramarefinado.Persona.*;
/**
 * 
 * @author Alfredo
 *
 */
public class JefeAdm extends Persona {

	public JefeAdm(String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
		// TODO Auto-generated constructor stub
	}

	public void ingresarPagoSueldo() {
		// TODO - implement JefeAdm.ingresarPagoSueldo
		throw new UnsupportedOperationException();
	}

	/**
	 * este m�todo permite agregar un nuevo Jefe de administraci�n a la base dedatos
	 * @param nuevaPer
	 * @return
	 */
	public static String agregarNuevoJefeAdm(Persona nuevaPer) {
		// Initialize the properties of the persistent object here
		try {
			/*
			 * se busca en la base de datos que la persona que se quiere agregar no
			 * haya sido ingresada anteriormente, esto se hace a trav�s
			 * de rut de la persona
			 */
			String rutJefeAd = "rut='"+nuevaPer.getRut()+"'";
			orm.Persona buscarRut = orm.PersonaDAO.loadPersonaByQuery(rutJefeAd, null);
			/**
			 * si no se encontr� el rut de la persona, es decir, la persona no exist�a,
			 * se crea una persona y se setean los atributos de la clase 'Persona'. 
			 * Finlamente se guardan los datos.
			 */
			if(buscarRut==null){
				orm.Persona lormPersona = orm.PersonaDAO.createPersona();
				lormPersona.setNombre(nuevaPer.getNombre());
				lormPersona.setApellido(nuevaPer.getApellido());
				lormPersona.setRut(nuevaPer.getRut());
				orm.PersonaDAO.save(lormPersona);
				/*
				 * una vez que se guadaron los datos en lormPersona,
				 * se instancia un lormJefeAdministraci�n y se le pasa lormPersona
				 */
				orm.Jefeadministracion lormJefeadministracion = orm.JefeadministracionDAO.createJefeadministracion();
				lormJefeadministracion.setPersona(lormPersona);
				orm.JefeadministracionDAO.save(lormJefeadministracion);
				return "se ingres� el jede de administraci�n";
			}else {
				return "el rut del jefe de administracion ya exist�a";
			}
		
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}