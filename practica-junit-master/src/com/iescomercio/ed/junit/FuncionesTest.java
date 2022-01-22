package com.iescomercio.ed.junit;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncionesTest {

	@Test
	void testCaracteristicaCaracter() {
		assertEquals(1, Funciones.caracteristicaCaracter('1'));
		assertEquals(2, Funciones.caracteristicaCaracter('a'));
		assertEquals(3, Funciones.caracteristicaCaracter('A'));
		assertEquals(4, Funciones.caracteristicaCaracter(' '));
		assertEquals(5, Funciones.caracteristicaCaracter('@'));
	}

	@Test
	void testConvertirCaracter() {
		assertEquals('a', Funciones.convertirCaracter('A'));
		assertEquals('A', Funciones.convertirCaracter('a'));
	}

	@Test
	void testAnteriorCaracter() {
		assertEquals('a', Funciones.anteriorCaracter('a', 'b'));
		assertEquals('A', Funciones.anteriorCaracter('A', 'b'));
		
		assertEquals('a', Funciones.anteriorCaracter('b', 'a'));
		assertEquals('A', Funciones.anteriorCaracter('b', 'A'));
	}

	@Test
	void testCaracter2Integer() {
		assertEquals(97, Funciones.caracter2Integer('a'));
		assertEquals(98, Funciones.caracter2Integer('b'));
		
	}

	@Test
	void testString2Integer() {
		assertEquals(12, Funciones.string2Integer("12"));
		assertEquals(1, Funciones.string2Integer("1"));
		assertEquals(20, Funciones.string2Integer("20"));
	}

	@Test
	void testMayorEntero() {
		assertEquals(2, Funciones.mayorEntero(1, 2));
		assertEquals(2, Funciones.mayorEntero(2, 1));
	}

	@Test
	void testCompararCadenas() {
		assertTrue(Funciones.compararCadenas("Hola", "Hola"));
		assertFalse(Funciones.compararCadenas("Hola", "HOLA"));
	}

	@Test
	void testConcatenar() {
		assertEquals("HolaSoyMarcos", Funciones.concatenar("Hola", "Soy", "Marcos"));
		assertEquals(" Probando  LA  FUNcion ", Funciones.concatenar(" Probando ", " LA ", " FUNcion "));
	}


	@Test
	void testToCamelCaseString() {
		assertEquals("HolaSoyMarcos", Funciones.toCamelCase("Hola Soy MARCOS"));
	}

	@Test
	void testToCamelCaseStringBoolean() {
		assertEquals("HolaSoyMarcos", Funciones.toCamelCase("Hola Soy MARCOS",false));
		assertEquals("holaSoyMarcos", Funciones.toCamelCase("Hola Soy MARCOS",true));
	}

	@Test
	void testSubcadena() {
		assertEquals("rcos Gue", Funciones.subcadena("Marcos Guerreros", 2, 10));
		assertEquals("s Guerrero", Funciones.subcadena("Marcos Guerreros", 5, 15));
	}

	@Test
	void testEsMayor() {
		assertEquals("Hola", Funciones.esMayor("Hola", "hol"));
		assertEquals("Hola", Funciones.esMayor("ola", "Hola"));
	}


	@Test
	void testEliminarVocales() {
		assertEquals(" Mrclg", Funciones.eliminarVocales("Murcielago"));
		assertEquals(" Mrcs", Funciones.eliminarVocales("Marcos"));
	}

	@Test
	void testReemplazarVocales() {
		assertEquals(" Mxrcxxlxgx", Funciones.reemplazarVocales("Murcielago", 'x'));
		assertEquals(" M@rc@s", Funciones.reemplazarVocales("Marcos", '@'));
	}

	
}
