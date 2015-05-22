package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Academico.StaffAcademico.Profesor;
import Diagramarefinado.Persona.Persona;
/**
 * 
 * @author Alfredo
 *
 */
public class ProfesorTest {

	@Test
	public void testAgregarNuevoProfesor() {
//		resultado =Profesor.agregarProfesor(new Persona("Alex","Sepúlveda","125342513"));
//		resultado =Profesor.agregarProfesor(new Persona("Juan","Herrera","115436782"));
//		resultado =Profesor.agregarProfesor(new Persona("Raul","Figueroa","105332782"));
//		resultado =Profesor.agregarProfesor(new Persona("Ana","Calfiqueo","137658763"));
//		resultado =Profesor.agregarProfesor(new Persona("Claudia","Romero","122136782"));
//		resultado =Profesor.agregarProfesor(new Persona("Esteban","Quiroz","146528705"));
//		resultado =Profesor.agregarProfesor(new Persona("Paola","Mendez","137654694"));
//		resultado =Profesor.agregarProfesor(new Persona("Esteban","Quiroz","146528705"));
//		resultado =Profesor.agregarProfesor(new Persona("Eduardo","Muñoz","987644581"));
//		resultado =Profesor.agregarProfesor(new Persona("Luis","Benitez","106598734"));
		
		/*
		 * prueba unitaria con rut nuevo
		 */
		String resultado="";
		resultado =Profesor.agregarNuevoProfesor(new Persona("Claudio","Valderrama","165457684"));
		assertTrue(resultado=="se agregó el profesor");
		
		/*
		 * prueba unitaria para rut existente
		 */
//		String resultado2="";
//		resultado2 =Profesor.agregarProfesor(new Persona("Juan","Rojas","187659086"));
//		assertTrue(resultado2=="no se puedo guardar, el rut del profesor ya existe");
	}

}
