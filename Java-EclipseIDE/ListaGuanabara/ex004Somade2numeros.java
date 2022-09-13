package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex004Somade2numeros {

	public static void main(String[] args) {
	
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		int soma = n1 + n2;
			
			JOptionPane.showMessageDialog(null, "A soma entre " + n1 + " e " + n2 + " é : " + soma);
}}
