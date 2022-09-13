package Testes;

import javax.swing.JOptionPane;

public class you010numeroprimo {
	
	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));
		int contadorDaDivisao = 0;
		
		for(int cont = 1; cont <= n; cont++) {
		//	 System.out.print(cont + " ");
			
			 if(n % cont == 0) {
				contadorDaDivisao++;
			 }
		}
			System.out.println("TOTAL DE NUMEROS DIVISIVEIS " + contadorDaDivisao);
			if(contadorDaDivisao == 2) {
				JOptionPane.showMessageDialog(null, n + " É um Numero Primo");
			}else {
				JOptionPane.showMessageDialog(null, n + " Não é um numero Primo");
			}
}}
