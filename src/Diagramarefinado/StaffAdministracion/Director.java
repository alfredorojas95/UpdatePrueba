package Diagramarefinado.StaffAdministracion;

import org.orm.PersistentException;

import Diagramarefinado.Persona.*;
/**
 * 
 * @author Alfredo
 *
 */
public class Director extends Persona {

	public Director(String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param NuevaPer
	 */
	public static String agregarNuevoDirector(Persona nuevaPer) {
		// Initialize the properties of the persistent object here
		try {
			/*
			 * se busca en la base de datos que la persona que se quiere agregar no
			 * haya sido ingresada anteriormente, esto se hace a través
			 * de rut de la persona
			 */
			String rutDirector = "rut='"+nuevaPer.getRut()+"'";
			orm.Persona buscarRut = orm.PersonaDAO.loadPersonaByQuery(rutDirector, null);
			/**
			 * si no se encontró el rut de la persona, es decir, la persona no existía,
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
				 * se instancia un lormJefeAdministración y se le pasa lormPersona
				 */
				orm.Director lormDirector = orm.DirectorDAO.createDirector();
				lormDirector.setPersona(lormPersona);
				orm.DirectorDAO.save(lormDirector);
				return "se ingresó el director";
			}else {
				return "no se pudo ingresar al director";
			}
		
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}