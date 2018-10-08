package ahorcado;

import java.util.ArrayList;

public class Ahorcado {
	String palabra;
	String oculta;
	ArrayList<Character> letrasIntentadas;
	int letrasQueFaltan;
	int intentos;
	
	
	public Ahorcado(String palabra, int intentos) {
		this.palabra = palabra;
		this.oculta = palabra.replaceAll(".", "_");
		this.letrasQueFaltan = palabra.length();
		this.intentos = intentos;
		this.letrasIntentadas = new ArrayList<Character>();
	}
	
	public boolean intentar(Character letra) {

		
		if (letrasIntentadas.contains(letra)) {
			System.out.println("Letra\"" + letra + "\" ya intentada!");
			this.intentos--;
			return true;
		}
		
		letrasIntentadas.add(letra);
		
		boolean acertada = false;
		for(int c=0; c< palabra.length(); c++) {
			if (palabra.charAt(c) == letra) {
				acertada = true;
				letrasQueFaltan--;
				this.oculta = this.oculta.substring(0, c) + letra + this.oculta.substring(c+1);
			}
		}
		
		if (!acertada) {
			this.intentos--;
			if (intentos == 0) {
				System.out.println("Te has quedado sin intentos. Has perdido...");
				return false;
			}
			
			System.out.println("No está.");
			
		}
		
		if (letrasQueFaltan == 0) {
			System.out.println("Has ganado!");
			return false;
		}
		
		return true;

	}
}
