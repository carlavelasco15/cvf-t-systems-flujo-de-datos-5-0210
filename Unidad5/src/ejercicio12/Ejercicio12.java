package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String contrasena = "password123";
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Introduce la contraseña: ");
            String entrada = scanner.nextLine();

            if (entrada.equals(contrasena)) {
                System.out.println("¡Enhorabuena! Contraseña correcta.");
                break;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Contraseña incorrecta. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Has agotado tus intentos. Contraseña incorrecta.");
                }
            }
        }
        scanner.close();


	}

}
