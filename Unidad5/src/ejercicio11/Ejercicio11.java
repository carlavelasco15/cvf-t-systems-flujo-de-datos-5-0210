package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe el dia de la semana (en minúsculas): ");
		String diaSemana = sc.nextLine();
		sc.close();
		
		String mensaje;

        switch (diaSemana) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "jueves":
            case "viernes":
                mensaje = "Es un día laboral.";
                break;
            case "sábado":
            case "domingo":
                mensaje = "No es un día laboral.";
                break;
            default:
                mensaje = "Día no válido.";
        }

        System.out.println(mensaje);
		
		
	}

}
