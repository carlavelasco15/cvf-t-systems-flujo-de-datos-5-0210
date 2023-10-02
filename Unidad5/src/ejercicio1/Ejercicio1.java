package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		int A = 3;
		int B = 5;
		
		if (A > B)
			System.out.println(A + " es mayor que " + B);
		else if (A < B)
			System.out.println(B + " es mayor que " + A);
		else if (A == B)
			System.out.println("A y B son iguales");
		else
			System.out.println("Error: No se ha podido comparar los numeros");
		
	}

}
