package ahorcado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Ahorcado ahorcado = new Ahorcado("MURCIELAGO", 10);
		System.out.println("Tienes 10 intentos");
		Character letra = new Character(' ');
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println(ahorcado.oculta);
			
			System.out.println("Escribe una letra:");
			
			String linea = scanner.nextLine();
			letra = new Character(linea.charAt(0));
		} while (ahorcado.intentar(letra));
		
		scanner.close();

	}

}
