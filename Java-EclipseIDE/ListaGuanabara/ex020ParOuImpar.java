package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex020ParOuImpar {

	public static void main(String[] args) {

		//		20) Desenvolva um programa que leia um n�mero inteiro e mostre se ele � PAR ou
		//	�MPAR.
				
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Um n�mero"));
				
				if(n1 % 2 == 0) {
					JOptionPane.showMessageDialog(null, "N�mero digitado � par");
				}else {
					JOptionPane.showMessageDialog(null, "N�mero digitado � impar");
				}

		
		
		
}}
