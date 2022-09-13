package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex020ParOuImpar {

	public static void main(String[] args) {

		//		20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
		//	ÍMPAR.
				
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Um número"));
				
				if(n1 % 2 == 0) {
					JOptionPane.showMessageDialog(null, "Número digitado é par");
				}else {
					JOptionPane.showMessageDialog(null, "Número digitado é impar");
				}

		
		
		
}}
