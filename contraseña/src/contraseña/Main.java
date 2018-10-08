package contraseña;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PasswordValidator validator = new PasswordValidator();

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Introduce una contraseña:");
			String pass = scanner.nextLine();
			
			validator.validate(pass);
		} catch (PasswordException e) {
			System.out.println("ERROR:" + e.getMessage());
		}
	}

}
