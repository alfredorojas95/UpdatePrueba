package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Persona.Persona;
import Diagramarefinado.StaffAdministracion.JefeAdm;
/**
 * 
 * @author Alfredo
 *
 */
public class JefeAdmTest {

	@Test
	public void testAgregarNuevoJefeAdm() {
		/*
		 * prueba para agregar un Jefe de Administraci�n a la base de datos
		 */	
		String resultado="";
		resultado =JefeAdm.agregarNuevoJefeAdm(new Persona("Adolfo","Gatica","115749802"));
		assertTrue(resultado=="se ingres� el jede de administraci�n");
		
//		
//		/*
//		 * prueba para mensaje de error (rut repetido en la base de datos)
//		 */	
//		String resultado2="";
//		resultado2 =JefeAdm.agregarNuevoJefeAdm(new Persona("Felipe","Arias","186548454"));
//		assertTrue(resultado2=="el rut del jefe de administracion ya exist�a");
	}

}
