package iniciales;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce una frase:");
		String frase = scanner.nextLine();
		scanner.close();
		
		String[] palabras = frase.split(" ");
		
		String fraseCap = "";
		for(String palabra : palabras) {
			fraseCap += palabra.substring(0,1).toUpperCase() + palabra.substring(1) + " ";
		}
		
		System.out.println(fraseCap);

	}

}
