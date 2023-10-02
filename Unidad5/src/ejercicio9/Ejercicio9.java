package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		int i = 1;
		
		while (i < 101) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
