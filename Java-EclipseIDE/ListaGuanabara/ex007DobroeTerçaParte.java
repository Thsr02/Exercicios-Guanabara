package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex007DobroeTer�aParte {

	public static void main(String[] args) {
//		7) Crie um algoritmo que leia um n�mero real e mostre na tela o seu dobro e a
//		sua ter�a parte.
//		Ex: 
//		Digite um n�mero: 3.5
//		O dobro de 3.5 � 7.0
//		A ter�a parte de 3.5 � 1.16666

			double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
			double dobro = n1 * 2;
			double tercaParte = n1 / 3;
				JOptionPane.showMessageDialog(null, "O dobro de " + n1 + " � " + dobro +
													"\nA Ter�a parte de " + n1 + " � " + tercaParte );
	

}}
