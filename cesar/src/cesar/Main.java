package cesar;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Cesar cesar = new Cesar(3);
		String palabra;
		
		System.out.println("Palabra a cifrar:");
		Scanner scanner = new Scanner(System.in);
		palabra = scanner.nextLine();
		System.out.println(cesar.cifrar(palabra));
		
		System.out.println("Palabra a descifrar:");
		palabra = scanner.nextLine();
		System.out.println(cesar.descifrar(palabra));
		
		scanner.close();
	}
}
