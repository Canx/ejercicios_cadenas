package cesar;

public class Cesar {

	int desplazamiento;
	int letraInicial = 65;
	int letraFinal = 90;
	int totalLetras = letraFinal - letraInicial;
	
	public Cesar(int desplazamiento) {
		if (desplazamiento % totalLetras > 0) {
			this.desplazamiento = desplazamiento % totalLetras;
		}
		else {
			this.desplazamiento = desplazamiento;
		}
	}
	
	public String cifrar(String frase, int desplazamiento) {
		char[] cifrado = new char[frase.length()];
		
		int cifra;
		for(int c=0; c<frase.length(); c++) {
			cifra = ((int)frase.charAt(c) + desplazamiento);
			if (cifra > letraFinal) {
				cifra = cifra - (letraFinal - letraInicial) - 1;
			}
			if (cifra < letraInicial) {
				cifra = cifra + (letraFinal - letraInicial) + 1;
			}
			cifrado[c] = (char) cifra;
		}
		return new String(cifrado);
		
	}
	
	public String cifrar(String frase) {
		return this.cifrar(frase, this.desplazamiento);
	}
	
	public String descifrar(String frase) {
		return this.cifrar(frase, -this.desplazamiento);
	}
}
