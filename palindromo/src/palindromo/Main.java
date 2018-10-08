package palindromo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce una cadena:");
		String cadena = scanner.nextLine();
		
		if (Palindromo.validar(cadena)) {
			System.out.println(cadena + " es palíndromo");;
		}
		else
			System.out.println(cadena + "no es palíndromo");
	}

}
