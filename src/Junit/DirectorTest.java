package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Academico.StaffAcademico.Profesor;
import Diagramarefinado.Persona.Persona;
import Diagramarefinado.StaffAdministracion.Director;
/**
 * 
 * @author Alfredo
 *
 */
public class DirectorTest {

	@Test
	public void testAgregarNuevoDirector() {
		String resultado="";
		resultado =Director.agregarNuevoDirector(new Persona("Jaime","Caama�o","148769874"));
		assertTrue(resultado=="se ingres� el director");
	}

}
