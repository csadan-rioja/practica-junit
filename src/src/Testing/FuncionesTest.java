package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FuncionesTest {
	/* No consigo recoger la salida del input
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@BeforeEach
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@Test
	void testDeletrearCadena() {
		Funciones.deletrearCadena("Adios");
		assertEquals("A d i o s", outContent.toString());
	}
	*/
	@Test
	void testCaracteristicaCaracter() {
	
		
		assertEquals(1, Funciones.caracteristicaCaracter('1'));
		
		assertEquals(2, Funciones.caracteristicaCaracter('m'));
		assertEquals(3, Funciones.caracteristicaCaracter('M'));
		assertEquals(4, Funciones.caracteristicaCaracter(' '));
		assertEquals(5, Funciones.caracteristicaCaracter('?'));
		assertEquals(5, Funciones.caracteristicaCaracter('*'));
	}

	
	@Test
	void testConvertirCaracter() {
		assertEquals('M', Funciones.convertirCaracter('m'));
		assertEquals('m', Funciones.convertirCaracter('M'));
		assertEquals('?', Funciones.convertirCaracter('?'));
	}

	
	@Test
	void testMayorEntero() {
		assertEquals(4, Funciones.mayorEntero(2,4));
		assertEquals(5, Funciones.mayorEntero(5,4));
	}

	@Test
	void testCompararCadenas() {
		
		assertFalse(Funciones.compararCadenas("hola","Hola"));
		assertFalse(Funciones.compararCadenas("Hola","hola"));
		assertTrue(Funciones.compararCadenas("Hola","Hola"));
	}

	@Test
	void testConcatenar() {
		assertEquals("holaAdiosIgual", Funciones.concatenar("hola", "Adios", "Igual"));
		assertEquals("AdiosIgual", Funciones.concatenar("", "Adios", "Igual"));
		assertEquals("Igual", Funciones.concatenar("", "", "Igual"));
		assertEquals("", Funciones.concatenar("", "", ""));
	}

	

	@Test
	void testToCamelCaseString() {
		assertEquals("HolaPepe", Funciones.toCamelCase("Hola pepe"));
		assertEquals("HolaPepe", Funciones.toCamelCase("Hola  pepe"));
	}

	@Test
	void testToCamelCaseStringBoolean() {
		assertEquals("holaPepe", Funciones.toCamelCase("Hola pepe", true));
		assertEquals("HolaPepe", Funciones.toCamelCase("Hola pepe", false));
		assertEquals("HolaPepeJesus", Funciones.toCamelCase("Hola pepe Jesus", false));
		assertEquals("holaPepeJesus", Funciones.toCamelCase("Hola pepe Jesus", true));
		assertEquals("holaPepeJesus", Funciones.toCamelCase("Hola  pepe Jesus", true));
	}

	@Test
	void testSubcadena() {
		assertEquals("ios", Funciones.subcadena("AdiosJesus", 2, 5));
		assertEquals("i", Funciones.subcadena("AdiosJesus", 2, 3));
		assertEquals("A", Funciones.subcadena("AdiosJesus", 0, 1));
		/* Se espera que de falso*/
		assertEquals("a", Funciones.subcadena("AdiosJesus", 0, 1));
		
	}

	@Test
	void testEsMayor() {
		assertEquals("hola1", Funciones.esMayor("hola1", "hola"));
		assertEquals("hola1", Funciones.esMayor("hola", "hola1"));
		assertEquals("adios", Funciones.esMayor("adios", "adios"));
	}

	@Test
	void testContarEspacios() {
		assertEquals(1, Funciones.contarEspacios(" "));
		assertEquals(1, Funciones.contarEspacios("a "));
		assertEquals(1, Funciones.contarEspacios("a a"));
		assertEquals(1, Funciones.contarEspacios(" a"));
		assertEquals(0, Funciones.contarEspacios("a"));
		assertEquals(2, Funciones.contarEspacios("a  a"));
	}

	@Test
	void testContarCaracter() {
		assertEquals(1, Funciones.contarCaracter("adios", 'a'));
		assertEquals(0, Funciones.contarCaracter("dios", 'a'));
		assertEquals(4, Funciones.contarCaracter("aadaioas", 'a'));
		assertEquals(5, Funciones.contarCaracter("aadaioasa", 'a'));
	}

	@Test
	void testInvertirCadena() {
		assertEquals("ola", Funciones.invertirCadena("alo"));
		assertEquals("aaalaaa", Funciones.invertirCadena("aaalaaa"));
		assertEquals("aaa l aaa", Funciones.invertirCadena("aaa l aaa"));
	}

	@Test
	void testEsPalindromo() {
		assertTrue(Funciones.esPalindromo("ala"));
		assertTrue(Funciones.esPalindromo("a l a"));
		assertFalse(Funciones.esPalindromo("al a"));
		assertFalse(Funciones.esPalindromo(" ala"));
	}

	@Test
	void testPosicionLetra() {
		assertEquals(4, Funciones.posicionLetra("adios", 's'));
		assertEquals(-1, Funciones.posicionLetra("adios", 'x'));
		assertEquals(0, Funciones.posicionLetra("adios", 'a'));
		assertEquals(-1, Funciones.posicionLetra("adios", 'A'));
	}

	@Test
	void testContieneCadena() {
		assertTrue(Funciones.contieneCadena("Esto es un buen dia", " buen dia"));
		assertFalse(Funciones.contieneCadena("Esto es un buen dia", " buen dia "));
		assertFalse(Funciones.contieneCadena("Esto es un buen dia", " buena"));
	}

	@Test
	void testEliminarVocales() {
		assertEquals("s", Funciones.eliminarVocales("aeious"));
		assertEquals("sxs", Funciones.eliminarVocales("aseixous"));
	}

	@Test
	void testReemplazarVocales() {
		assertEquals("xxxxxs", Funciones.reemplazarVocales("aeious",'x'));
		assertEquals("xsxxsxxs", Funciones.reemplazarVocales("aseisous",'x'));
	}

	@Test
	void testMain() {
		fail("Not yet implemented");
	}

}
