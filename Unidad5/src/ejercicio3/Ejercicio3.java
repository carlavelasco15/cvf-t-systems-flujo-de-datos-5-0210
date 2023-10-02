package ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		
		String nombre = JOptionPane.showInputDialog("Introduce el nombre");
		
		JOptionPane.showMessageDialog(null, "Bienvenido/a, " + nombre);
	}

}
