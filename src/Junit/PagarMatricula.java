package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Finanza.Matricula;
/**
 * 
 * @author Alfredo
 *
 */
public class PagarMatricula {

	@Test
	public void testPagarMatricula() {
		/*
		 * prueba para pagar la matrícula de un estudiante 
		 */
		String resultado="";
		resultado =Matricula.pagarMatricula("237657658", "165643214");
		assertTrue(resultado=="matrícula pagada");
	
		/*
		 * prueba para pagar la matrícula de un estudiante 
		 */
//		String resultado2="";
//		resultado2 =Matricula.pagarMatricula("196457233", "765546543");
//		assertTrue(resultado2=="no se puedo pagar la matrícula");
	}

}
