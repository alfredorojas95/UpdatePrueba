package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Finanza.Matricula;
/**
 * 
 * @author Alfredo
 *
 */
public class ObtenerMorososMatricula {

	@Test
	public void testObtenerListMorososMatricula() {
		String resultado="", cadena="";
		orm.Estudiante []mor = null;
		mor = Matricula.obtenerListMorososMatricula();
		for (int i=0; i<mor.length; i++){
			cadena += mor[i].getPersona().getNombre()+"   "+mor[i].getPersona().getApellido()+"    "+mor[i].getPersona().getRut()+"\n";
		}
		System.out.println(cadena);
		assertTrue(mor!=null);
	}

}
