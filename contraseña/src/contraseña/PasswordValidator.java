package contraseña;

public class PasswordValidator {
	
	public void validate(String pass) throws PasswordException {
		// comprobamos que tiene al menos 8 caracteres
		if (pass.length() < 8) {
			throw new PasswordException("La contraseña tiene que tener 8 o más caracteres");
		};
		
		// comprobamos que tiene al menos una minúscula
		if (! pass.matches(".*[a-z].*")) {
			throw new PasswordException("La contraseña tiene que tener al menos una minúscula");
		}
		
		// comprobamos que al menos tiene una mayúscula
		if (! pass.matches(".*[A-Z].*")) {
			throw new PasswordException("La contraseña tiene que tener al menos una mayúscula");
		}
		
		// comprobamos que al menos tiene un número
		if (! pass.matches(".*[0-9].*")) {
			throw new PasswordException("La contraseña tiene que tener al menos un número");
		}
		
		if (! pass.matches(".*[-_$].*")) {
			throw new PasswordException("La contraseña tiene que tener al menos un caracter -,_ o $");
		}
	}
}
