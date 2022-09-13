package Testes;

import javax.swing.JOptionPane;

public class you016extraAnalisadorDeValores {
	public static void main(String[] args) {
		
		int valor = 0, totSoma =0, divisiveis = 0, nulo = 0, somaPar = 0, divisor = 5;
		double media = 0;
		for(int cont = 1; cont <= 5; cont++) {
			valor =	Integer.parseInt(JOptionPane.showInputDialog("Digite o " + cont + "º Valor"));
			
			totSoma += valor;
				
			media = totSoma /divisor;
				
					if(valor % 5 ==0) {
					 divisiveis = divisiveis +1;
					}
					if(valor <= 0) {
						nulo = nulo +1;
					}if(valor % 2 ==0) {
						somaPar += valor;
					}
		}
				System.out.println("Soma Total dos Valores: " + totSoma + 
									"\nMedia dos Valores: " + media +
									"\nNumeros Divisiveis por 5: " + divisiveis +
									"\nNumeros Nulos: " + nulo +
									"\nSoma dos números pares: " + somaPar);
}}

 
