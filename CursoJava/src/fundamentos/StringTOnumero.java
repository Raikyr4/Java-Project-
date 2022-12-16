package fundamentos;

import javax.swing.JOptionPane; // class visual "telinha"

public class StringTOnumero {
		public static void main(String[] args) {
			
			String valor1 = JOptionPane.showInputDialog // modo de criar uma janelinha de dialogo par interagir com o cmd
					("Digita ai");
		    String valor2 = JOptionPane.showInputDialog
							("Digita ai");
		    System.out.println(valor1+valor2);
		    
		    double n = Double.parseDouble(valor2);
		    double nn = Double.parseDouble(valor1);
		    
		    System.out.println("A media eh " + (n+nn)/2);
		}
}
