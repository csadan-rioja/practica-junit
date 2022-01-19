package ejerciciostema1;

import java.util.Scanner;

public class T1Ej1 {

	/*
	 * � Crea una funci�n llamada caracteristicaCaracter que dado un car�cter por
	 * par�metro devuelva: o 1 si es un d�gito. o 2 si es una letra min�scula. o 3
	 * si es una letra may�scula. o 4 si es un espacio en blanco. o 5 si es un
	 * car�cter que no es alfanum�rico.
	 */

	public static int caracteristicaCaracter(char s) {
		if (Character.isDigit(s)) {
			return 1;
		} else if (Character.isLowerCase(s)) {
			return 2;
		} else if (Character.isUpperCase(s)) {
			return 3;
		} else if (Character.isWhitespace(s)) {

			return 4;

		} else if (!Character.isDigit(s) && !Character.isLetter(s)) {
			return 5;
		}
		return s;
	}

	/*
	 * � Crea una funci�n llamada convertirCaracter que dado un car�cter de tipo
	 * letra lo convierta en may�scula si es min�scula y en min�scula si es
	 * may�scula
	 */
	public static char convertirCaracter(char m) {
		if (Character.isUpperCase(m) == true) {
			return Character.toLowerCase(m);

		} else if (Character.isLowerCase(m) == true) {
			return Character.toUpperCase(m);
		}
		return m;

	}
	/*
	 * � Crea una funci�n llamada anteriorCaracter que dados dos caracteres
	 * cualesquiera, devuelva cu�l es el menor independientemente de si es may�scula
	 * o min�scula.
	 */

	public static char anteriorCaracter(char a, char k) {

		if (Character.valueOf(Character.toLowerCase(a)) < Character.valueOf(Character.toLowerCase(k))) {
			return a;

		} else if (Character.valueOf(Character.toLowerCase(k)) <= Character.valueOf(Character.toLowerCase(a))) {
			return k;
		} else
			return a;
	}
	/*
	 * � Crea una funci�n llamada caracter2Integer que dado un entero como
	 * Character, devuelva el mismo entero de tipo Integer.
	 */

	public static int caracter2Integer(char c) {
		return Integer.valueOf(c);

	}
//Integer
//�	Crea una funci�n string2Integer que dado un entero como String, devolver� un entero de tipo Integer. 

	public static int string2Integer(String s) {

		return Integer.valueOf(s);

	}

	/*
	 * � Crea una funci�n mayorEntero que pasando como arguments dos enteros,
	 * devolver� el mayor de los dos (utiliza la funci�n correspondiente de
	 * Integer).
	 */
	public static int mayorEntero(int num1, int num2) {

		return Integer.max(num1, num2);
	}

	// String
	/*
	 * � Crea la funci�n compararCadenas que dadas dos cadenas por par�metro,
	 * devolver� verdadero en caso de que sean iguales o falso en caso contrario.
	 */
	public static boolean compararCadenas(String cadena1, String cadena2) {
		if (cadena1.contentEquals(cadena2) == true) {
			return true;
		} else
			return false;

	}
	// � Crea una funci�n llamada concatenar que dadas tres cadenas, devuelva su
	// concatenaci�n.

	public static String concatenar(String cadena1, String cadena2, String cadena3) {
		String cadena4 = cadena1.concat(cadena2);
		return cadena4.concat(cadena3);

	}

	/*
	 * � Crea la funci�n deletrearCadena que pasando una cadena por par�metro,
	 * muestre cada uno de sus caracteres por consola en una misma l�nea y separados
	 * por espacio.
	 */
	public static void deletrearCadena(String cadena) {

		for (int i = 0; i <= cadena.length() - 1; i++) {
			System.out.print(cadena.charAt(i) + " ");

		}

	}

	/*
	 * � Crea la funci�n toCamelCase que pasando una cadena por par�metro, devuelva
	 * la misma cadena en formato CamelCase comenzando con min�scula.
	 */

	public static String toCamelCase(String cadena) {

		String camelCase = " ";

		for (int i = 0; i < cadena.length(); i++) {
			if (i == 0) {
				camelCase = (String.valueOf(cadena.charAt(i))).toUpperCase();
				i++;
			}
			if (cadena.charAt(i) == ' ') {

				camelCase = camelCase + (String.valueOf(cadena.charAt(i + 1))).toUpperCase();
				i = i + 2;
			}

			camelCase = camelCase + (String.valueOf(cadena.charAt(i))).toLowerCase();

		}

		return camelCase;

	}

	/*
	 * � Crea la funci�n toCamelCase que reciba dos par�metros, el primer car�cter
	 * ser� la cadena que transformaremos a camel case y el segundo par�metro ser�
	 * un Boolean que si es verdadero har� que la funci�n devuelva la cadena en
	 * camel case comenzando en min�scula, y si es falso comenzando en may�scula
	 */
	public static String toCamelCase(String cadena, boolean minuMayu) {
		String camelCaseMinMayu = " ";

		for (int i = 0; i < cadena.length(); i++) {
			if (i == 0 && minuMayu == false) {
				camelCaseMinMayu = (String.valueOf(cadena.charAt(i))).toUpperCase();
				i++;
			} else if (i == 0 && minuMayu == true) {
				camelCaseMinMayu = (String.valueOf(cadena.charAt(i))).toLowerCase();
				i++;
			}
			if (cadena.charAt(i) == ' ') {

				camelCaseMinMayu = camelCaseMinMayu + (String.valueOf(cadena.charAt(i + 1))).toUpperCase();
				i = i + 2;
			}

			camelCaseMinMayu = camelCaseMinMayu + (String.valueOf(cadena.charAt(i))).toLowerCase();

		}

		return camelCaseMinMayu;

	}

	/*
	 * � Crea la funci�n subcadena que reciba tres par�metros. Primero, la cadena de
	 * la que vamos a obtener la subcadena. Segundo, el �ndice de inicio (comenzando
	 * por 1) desde donde voy a tomar la subcadena. Tercero, el �ndice del final
	 * donde voy a cortar la subcadena. Debe devolver la subcadena que vaya de la
	 * posici�n inicial a la final que indican los par�metros.
	 */

	public static String subcadena(String cadena, int indice1, int indice2) {

		return cadena.substring(indice1, indice2);

	}
	/*
	 * � Crea una funci�n llamada esMayor que reciba por par�metro dos cadenas, y
	 * devuelva aquella que tiene m�s caracteres.
	 */

	public static String esMayor(String cadena1, String cadena2) {
		if (cadena1.length() > cadena2.length()) {
			return cadena1;
		} else
			return cadena2;

	}
	/*
	 * � Crea una funci�n llamada contarEspacios que reciba por par�metro una cadena
	 * y devuelva el n�mero de espacios que contiene.
	 */

	public static int contarEspacios(String cadena) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ' ') {
				contador = contador + 1;

			}
		}
		return contador;
	}

	/*
	 * � Crea una funci�n llamada contarCaracter que reciba dos par�metros de
	 * entrada. El primer par�metro ser� un String y el segundo un Character. La
	 * funci�n tendr� que devolver el n�mero de apariciones del Character dentro del
	 * String.
	 */

	public static int contarCaracter(String cadena, char character) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == character) {
				contador = contador + 1;

			}
		}
		return contador;
	}

	/*
	 * � Crea una funci�n llamada invertirCadena que reciba un String como par�metro
	 * y devuelva el mismo String invertido.
	 */
	public static String invertirCadena(String cadena) {
		String invertir = " ";
		for (int i = cadena.length() - 1; i >= 0; i--) {

			invertir = invertir + String.valueOf(cadena.charAt(i));

		}
		return invertir;
	}

	/*
	 * � Crea la funci�n de nombre esPalindromo que recibe un String como par�metro
	 * y devuelva true en caso de que sea un pal�ndromo y falso en caso contrario.
	 */
	public static boolean esPalindromo(String cadena) {

		int contador = cadena.length();
		String A = " ";

		String B = " ";

		for (int i = 0; i <= (cadena.length()) / 2; i++) {
			A = A + String.valueOf(cadena.charAt(i));
			B = B + String.valueOf(cadena.charAt(contador - 1));
			contador--;
		}
		if (A.equals(B)) {
			return true;

		} else
			return false;

	}
	/*
	 * � Crea la funci�n posicionLetra que dada una String como par�metro y un
	 * Character. Devuelva la posici�n de la primera vez que aparece dicho car�cter.
	 * Si no aparece devolver� -1.
	 */

	public static int posicionLetra(String cadena, char character) {
		return cadena.indexOf(character);

	}
	/*
	 * � Crea la funci�n contieneCadena que recibir� dos par�metros de entrada. El
	 * primero ser� la cadena donde se buscar�, el segundo ser� el par�metro que se
	 * buscar�. La funci�n devolver� verdadero en caso de que est� contenida, y
	 * falso en caso contrario.
	 */

	public static boolean contieneCadena(String cadena1, String cadena2) {
		return cadena1.contains(cadena2);
	}

	/*
	 * � Crea una funci�n eliminarVocales que reciba como par�metro de entrada un
	 * String la devuelva sin ninguna vocal.
	 */

	public static String eliminarVocales(String cadena) {
		String constante = " ";
		String vocal = " ";
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'
					|| cadena.charAt(i) == 'i') {

				vocal = vocal + String.valueOf(cadena.charAt(i));

			} else {
				constante = constante + String.valueOf(cadena.charAt(i));
			}

		}
		return constante;
	}
	/*
	 * � Crea una funci�n reemplazarVocales que reciba como par�metro de entrada un
	 * String y un Character que sea vocal. La funci�n deber� devolver la misma
	 * cadena sustituyendo cada vocal por la vocal que se pasa como par�metro.
	 */

	public static String reemplazarVocales(String cadena, char character) {
		String reemplazar = " ";
		for (int i = 0; i < cadena.length(); i++) {

			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'
					|| cadena.charAt(i) == 'i') {

				reemplazar = reemplazar + String.valueOf(character);

			} else {
				reemplazar = reemplazar + String.valueOf(cadena.charAt(i));
			}

		}
		return reemplazar;
	}

	public static void main(String[] args) {

		System.out.println(esPalindromo("dabale arroz a la zorra el abad"));

	}
}
