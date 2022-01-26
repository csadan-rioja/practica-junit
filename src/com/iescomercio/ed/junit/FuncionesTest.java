package com.iescomercio.ed.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FuncionesTest {

	@Test
	void testCaracteristicaCaracter() {
		assertEquals(1, Funciones.caracteristicaCaracter('1'));
		assertEquals(2, Funciones.caracteristicaCaracter('a'));
		assertEquals(3, Funciones.caracteristicaCaracter('C'));
		assertEquals(4, Funciones.caracteristicaCaracter(' '));
		assertEquals(5, Funciones.caracteristicaCaracter('_'));
	}

	@Test
	void testConvertirCaracter() {
		assertEquals('M', Funciones.convertirCaracter('m'));
		assertEquals('m', Funciones.convertirCaracter('M'));
		assertEquals(' ', Funciones.convertirCaracter(' '));
	}

	@Test
	void testAnteriorCaracter() {
		assertEquals('a', Funciones.anteriorCaracter('a', 'T'));
		assertEquals('a', Funciones.anteriorCaracter('a', 'a'));
		assertEquals('J', Funciones.anteriorCaracter('W', 'J'));
		assertEquals('W', Funciones.anteriorCaracter('W', 'Z'));
		assertEquals('1', Funciones.anteriorCaracter('Q', '1'));
	}

	@Test
	void testCaracter2Integer() {
		assertEquals('1', Funciones.caracter2Integer('1'));
		assertEquals('0', Funciones.caracter2Integer('0'));
		assertEquals('9', Funciones.caracter2Integer('9'));
	}

	@Test
	void testString2Integer() {
		assertEquals("0", Funciones.string2Integer("0"));
		assertEquals('1', Funciones.string2Integer("1"));
		assertEquals(1, Funciones.string2Integer("1"));
	}

	@Test
	void testMayorEntero() {
		assertEquals(5, Funciones.mayorEntero(3, 5));
		assertEquals(10, Funciones.mayorEntero(10, 1));
		assertEquals(1, Funciones.mayorEntero(1, 1));
	}

	@Test
	void testCompararCadenas() {
		assertTrue(Funciones.compararCadenas("Hola Pepe", "Hola Pepe"));
		assertTrue(Funciones.compararCadenas("MellamOjUan", "MellamOjUan"));
		assertFalse(Funciones.compararCadenas("Hola PePe", "Hola Pepe"));
		assertFalse(Funciones.compararCadenas("Hola Pepe ", "Hola Pepe"));
	}

	@Test
	void testConcatenar() {
		assertEquals("Has", Funciones.concatenar("H", "a", "s"));
		assertEquals("Has visto esto", Funciones.concatenar("Has", " visto ", "esto"));
		assertEquals("Hola Carlos que tal", Funciones.concatenar("Hola", " Carlos ", "que tal"));
	}
	
	@Test
	void testDeletrearCadena() {
		
	}
	
	@Test
	void testToCamelCaseString() {
		assertEquals("Holajuan", Funciones.toCamelCase("holajuan"));
		assertEquals("MeLlamoJavier", Funciones.toCamelCase("ME LLAMO JAVIER"));
	}

	@Test
	void testToCamelCaseStringBoolean() {
		assertEquals("HolaJuan", Funciones.toCamelCase("hola juan", false));
		assertEquals("MeLlamoCarlos", Funciones.toCamelCase("ME LLAMO CARLOS", false));
		assertEquals("holaJuan", Funciones.toCamelCase("hola juan", true));
		assertEquals("meLlamoCarlos", Funciones.toCamelCase("ME LLAMO CARLOS", true));
	}

	@Test
	void testSubcadena() {
	}

	@Test
	void testEsMayor() {
		assertEquals("Carlos", Funciones.esMayor("Carlos", "Hola"));
		assertEquals("Juan y PEDRO", Funciones.esMayor("Vaso rojo", "Juan y PEDRO"));
		assertEquals("      ", Funciones.esMayor("      ", "A"));
		assertEquals("Hola", Funciones.esMayor("HOLA", "Hola"));
	}

	@Test
	void testContarEspacios() {
		assertEquals(3, Funciones.contarEspacios("Tengo sueño es tarde"));
		assertEquals(6, Funciones.contarEspacios(" Tengo sueño es tarde  "));
		assertEquals(1, Funciones.contarEspacios(" "));
		assertEquals(0, Funciones.contarEspacios(""));
	}

	@Test
	void testContarCaracter() {
		assertEquals(2, Funciones.contarCaracter("Pedro Picapiedra", 'i'));
		//No contempla caracteres en mayuscula ni con tildes
		assertEquals(5, Funciones.contarCaracter("Antes Había más casas", 'a'));
		//No contempla el espacio como caracter
		assertEquals(3, Funciones.contarCaracter("Hola Juan", ' '));
	}

	@Test
	void testInvertirCadena() {
		fail("Not yet implemented");
	}

	@Test
	void testEsPalindromo() {
		assertTrue(Funciones.esPalindromo("reconocer"));
		assertTrue(Funciones.esPalindromo("ligaresseragil"));
		assertTrue(Funciones.esPalindromo("amoraroma"));
		assertFalse(Funciones.esPalindromo("pepe"));
		//No contempla los espacios
		assertFalse(Funciones.esPalindromo("ligar es ser agil"));
	}

	@Test
	void testPosicionLetra() {
		assertEquals(3, Funciones.posicionLetra("Hola", 'a'));
		assertEquals(4, Funciones.posicionLetra("Hola Juan", ' '));
		assertEquals(0, Funciones.posicionLetra("Hola", 'H'));
		assertEquals(-1, Funciones.posicionLetra("Hola", 'S'));
	}

	@Test
	void testContieneCadena() {
		assertEquals(true, Funciones.contieneCadena("Hola", "ola"));
		assertEquals(true, Funciones.contieneCadena("sabes pepe", "bes pep"));
		assertEquals(false, Funciones.contieneCadena("Hola", "uano"));
		assertEquals(false, Funciones.contieneCadena("Hola", "javier"));
	}

	@Test
	void testEliminarVocales() {
	}

	@Test
	void testReemplazarVocales() {
	}

	@Test
	void testMain() {
		fail("Not yet implemented");
	}

}

