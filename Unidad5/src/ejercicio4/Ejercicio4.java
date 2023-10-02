package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		final double PI = 3.14159;
		double radioParseado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu numero aquí: ");
		
		String radio = sc.nextLine();
		sc.close();
		
		try {
			radioParseado = Double.parseDouble(radio);			
			if (radioParseado < 0) {
				System.out.println("El numero tiene que ser positivo o 0.");
				return;
			}
			
			System.out.println("El resultado es: " + (PI*Math.pow(radioParseado, 2)));
			
		} catch(Exception e) {
			System.out.println("Error en el input del programa, valor no válido.");
		}
		

	}

}
