package ahorcado;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<String> listaPalabras = Arrays.asList("MURCIELAGO", "PATATA", "MARIPOSA");
		
		Random random = new Random();
		int index = random.nextInt(listaPalabras.size());
	
		Ahorcado ahorcado = new Ahorcado(listaPalabras.get(index), 10);
		
		
		Character letra = new Character(' ');
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Tienes " + ahorcado.intentos + " intentos");
			System.out.println(ahorcado.oculta);
			
			System.out.println("Escribe una letra:");
			
			String linea = scanner.nextLine();
			letra = new Character(linea.charAt(0));
		} while (ahorcado.intentar(letra));
		
		scanner.close();

	}

}
