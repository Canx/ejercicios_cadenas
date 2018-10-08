package palindromo;

public class Palindromo {

	public static Boolean validar(String cadena)  {
		if (cadena.length() <= 1) {
			return true;
		}
		
		if (cadena.charAt(0) == cadena.charAt(cadena.length() - 1)) {
			return Palindromo.validar(cadena.substring(1, cadena.length() - 1));
		}
		else {
			return false;
		}
	}
}
