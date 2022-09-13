package Testes;

import javax.swing.JOptionPane;

public class you008d {
	
	public static void main(String [] args) {
		
		int	totalImpar = 0, negativo = 0;
		
		for(int cont = 0; cont < 5; cont++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Numero"));
			System.out.print(n + " ");
			if(n % 2 != 0) {
				totalImpar++;
			}if(n < 0) {
				negativo++;
			}
		}
		
		System.out.println();
		System.out.println("TOTAL DE NUMEROS IMPARES: " + totalImpar);
		System.out.print("FORAM DIGITADOS " + negativo + " NUMEROS NEGATIVOS");
}}
