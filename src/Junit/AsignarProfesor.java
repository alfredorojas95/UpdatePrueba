package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Academico.StaffAcademico.Curso;
/**
 * 
 * @author Alfredo
 *
 */
public class AsignarProfesor {

	@Test
	public void testAsignarProfesor() {
		/*
		 * prueba en donde se le asigna un profesor a un curso
		 * 
		 */
		String resultado="";
		resultado =Curso.asignarProfesor(1,"Matem�tica","165457684");
		assertTrue(resultado=="profesor asignado");
	}

}
