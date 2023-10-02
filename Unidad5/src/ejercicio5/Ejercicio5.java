package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu numero aquí: ");
		
		String valor = sc.nextLine();
		sc.close();
		
		try {
			num = Integer.parseInt(valor);			
			if (num % 2 == 0) {
				System.out.println("El resultado es divisible por 2");
				return;
			}
			
			System.out.println("El resultado NO es divisible por 2");
			
		} catch(Exception e) {
			System.out.println("Error en el input del programa, valor no válido.");
		}

	}

}
