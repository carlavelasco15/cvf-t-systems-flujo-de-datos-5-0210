package ejercicio8;

import java.util.Iterator;

public class Ejercicio8 {

	public static void main(String[] args) {

		for (int i = 1; i < 101; i++) {
			if (i != 100) {
				System.out.print(i + ", ");
				continue;
			}
			System.out.print(i + ".");
		}		
	}

}
