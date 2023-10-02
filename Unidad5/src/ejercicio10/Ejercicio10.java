package ejercicio10;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		int ventas;
		double precio; 
		double total = 0;
		
		String input = JOptionPane.showInputDialog("Introduce el numero de ventas");
		
		try {
			ventas = Integer.parseInt(input);
			
			if (ventas <= 0)  {
				JOptionPane.showMessageDialog(null, "Numero no valido, tiene que ser un numero positivo");
				return;
			}
			
			for (int i = 0; i < ventas; i++) {
				precio = 0;
				input = JOptionPane.showInputDialog("Introduce el precio de la venta");
				precio = Double.parseDouble(input);
				while (precio <= 0)  {
					JOptionPane.showMessageDialog(null, "Numero no valido, tiene que ser un numero positivo");
					input = JOptionPane.showInputDialog("Introduce el precio de la venta");
					precio = Double.parseDouble(input);
				}
				
				total += precio;
			}
			
			JOptionPane.showMessageDialog(null, "Suma total de los productos: " + total);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error: input incorrcto");
		}

	}

}
