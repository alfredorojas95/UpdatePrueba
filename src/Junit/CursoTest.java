package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Academico.StaffAcademico.Curso;
/**
 * 
 * @author Alfredo
 *
 */
public class CursoTest {

	@Test
	public void testCrearCurso() {
		/*
		 * prueba en la que se crea un curso exitosamente
		 */
		String resultado="";
		resultado =Curso.crearCurso(new Curso("Matemática"),"148769874");
		assertTrue(resultado=="se creó el curso exitosamente");
	}

}
