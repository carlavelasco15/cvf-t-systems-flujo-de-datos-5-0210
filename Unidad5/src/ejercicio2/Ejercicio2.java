package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
				
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu nombre aquí: ");
		
		String name = sc.nextLine();
		sc.close();
		
		System.out.println("Bienvenido/a, " + name);
	}

}
