package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex026CompareOsNumeros {

	public static void main(String[] args) {
	
		
//		26) Escreva um algoritmo que leia dois n�meros inteiros e compare-os, mostrando
//	na tela uma das mensagens abaixo:
//	   - O primeiro valor � o maior 
//	   - O segundo valor � o maior
//	   - N�o existe valor maior, os dois s�o iguais

				int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
					
				if(n1 > n2) {
					JOptionPane.showMessageDialog(null, "O Primeiro numero � o maior");
				}else if(n1 == n2) {
					JOptionPane.showMessageDialog(null, "Os N�meros s�o iguais");
				}else {
					JOptionPane.showMessageDialog(null, "O Segundo N�mero � o Maior");
				}
}}
