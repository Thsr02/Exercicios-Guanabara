package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex007DobroeTerçaParte {

	public static void main(String[] args) {
//		7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
//		sua terça parte.
//		Ex: 
//		Digite um número: 3.5
//		O dobro de 3.5 é 7.0
//		A terça parte de 3.5 é 1.16666

			double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
			double dobro = n1 * 2;
			double tercaParte = n1 / 3;
				JOptionPane.showMessageDialog(null, "O dobro de " + n1 + " é " + dobro +
													"\nA Terça parte de " + n1 + " é " + tercaParte );
	

}}
