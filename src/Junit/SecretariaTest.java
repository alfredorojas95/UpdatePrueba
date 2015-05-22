package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Persona.Persona;
import Diagramarefinado.StaffAdministracion.Secretaria;
/**
 * 
 * @author Alfredo
 *
 */
public class SecretariaTest {

	@Test
	public void testAgregarNuevaSecretaria() {
		/*
		 * prueba en donde se ingresa exitosamente una nueva secretaria a la base de datos
		 */
		String resultado="";
		resultado =Secretaria.agregarNuevaSecretaria(new Persona("Denis","Lopez","165643214"));
		assertTrue(resultado=="se ingresó la secretaria con exito");
		
		/*
		 * prueba en donde se ingrea el rut de una persona ingresada anteriormente
		 */
//		String resultado2="";
//		resultado2 =Secretaria.agregarSecretaria(new Persona("Maria","Lopez","675446543"));
//		assertTrue(resultado2=="no se puedo ingresar a la secretaria");
	}

}
