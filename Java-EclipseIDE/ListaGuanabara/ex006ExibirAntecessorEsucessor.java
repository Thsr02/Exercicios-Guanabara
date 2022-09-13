package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex006ExibirAntecessorEsucessor {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digita o primeiro numero"));
		
		int antecessor = n1 - 1;
		int sucessor = n1 + 1;
			JOptionPane.showMessageDialog(null, "O Antecessor de " + n1 + " é " + antecessor +
												"\nO Sucessor de " + n1 + " é " + sucessor);
}}
