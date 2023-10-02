package ejercicio13;

import javax.swing.JOptionPane;

public class Ejercicio13 {
		
	public static void main(String[] args) {
		try {
			String input1 = JOptionPane.showInputDialog("Ingrese el primer operando (entero):");
	        int operando1 = Integer.parseInt(input1);
	        
	        String operador = JOptionPane.showInputDialog("Ingrese el operador aritmético (+, -, *, /):");
	        
	        String input2 = JOptionPane.showInputDialog("Ingrese el segundo operando (entero):");
	        int operando2 = Integer.parseInt(input2);
			
	        int resultado = 0;
	
	        switch (operador) {
	            case "+":
	                resultado = operando1 + operando2;
	                break;
	            case "-":
	                resultado = operando1 - operando2;
	                break;
	            case "*":
	                resultado = operando1 * operando2;
	                break;
	            case "/":
	                if (operando2 != 0) {
	                    resultado = operando1 / operando2;
	                } else {
	                    JOptionPane.showMessageDialog(null, "Error: No se puede dividir por cero.");
	                    return;
	                }
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Operador aritmético no válido.");
	                return;
	        }
		        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Input no valido.");
			}
	}
}


