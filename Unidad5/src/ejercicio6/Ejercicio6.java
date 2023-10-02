package ejercicio6;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		final double IVA = 1.21;
		double precioPars;
		
		String precio = JOptionPane.showInputDialog("Introduce el precio del producto");
		
		try {
			precioPars = Double.parseDouble(precio);
			
			if (precioPars <= 0)  {
				JOptionPane.showMessageDialog(null, "Numero no valido, tiene que ser un numero positivo");
				return;
			}
			
			JOptionPane.showMessageDialog(null, "El precio final del producto es  " + (precioPars*IVA));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error: input incorrcto");
		}
	}
}
