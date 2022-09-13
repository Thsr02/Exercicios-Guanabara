package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex026CompareOsNumeros {

	public static void main(String[] args) {
	
		
//		26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
//	na tela uma das mensagens abaixo:
//	   - O primeiro valor é o maior 
//	   - O segundo valor é o maior
//	   - Não existe valor maior, os dois são iguais

				int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
					
				if(n1 > n2) {
					JOptionPane.showMessageDialog(null, "O Primeiro numero é o maior");
				}else if(n1 == n2) {
					JOptionPane.showMessageDialog(null, "Os Números são iguais");
				}else {
					JOptionPane.showMessageDialog(null, "O Segundo Número é o Maior");
				}
}}
