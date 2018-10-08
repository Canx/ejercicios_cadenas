package contador;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce una frase:");
		String frase = scanner.nextLine();
		scanner.close();
		
		String[] palabras = frase.split(" ");
		
		System.out.println("La frase \"" + frase + "\" tiene " + palabras.length + " palabras.");

	}

}
