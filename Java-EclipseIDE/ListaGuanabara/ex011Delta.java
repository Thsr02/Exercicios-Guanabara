package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex011Delta {

	public static void main(String[] args) {
	
//		11) Desenvolva uma l�gica que leia os valores de A, B e C de uma equa��o do
//			segundo grau e mostre o valor de Delta.
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
			
			double delta = (b * b) -( 4 * (a * c));
			
			JOptionPane.showMessageDialog(null, delta);
}}
