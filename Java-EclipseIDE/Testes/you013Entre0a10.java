package Testes;

import javax.swing.JOptionPane;

public class you013Entre0a10 {
	
	public static void main(String[] args) {

		int totalEntre10 = 0, somaDosImpar =0;	
			
			for(int cont = 1; cont <= 6; cont++) {
		
				int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor"));
				
					if(n > 0 && n <= 10) {
						totalEntre10++;
					
					if(n % 2 == 1) 
						somaDosImpar = somaDosImpar + n;
					}
			}		
			JOptionPane.showMessageDialog(null, "Total de N�mero Digitas que est�o Entre 0 e 10 �: " + totalEntre10 +
												"\nA Soma dos n�meros impares digitados �: " + somaDosImpar);
}}
