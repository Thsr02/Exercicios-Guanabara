package Testes;

import javax.swing.JOptionPane;

public class you009fatorial {
	
	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));
		int fatorial = 1;
		
				for(int cont = n; cont >= 1; cont--) {
	// exibi o contador	==> //	System.out.print(cont + " ");
					fatorial = fatorial * cont;
					System.out.println("O Fatorial de "+ n + " é: " + fatorial);
				}
		
				
				
}}
