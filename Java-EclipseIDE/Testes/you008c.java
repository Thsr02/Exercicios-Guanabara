package Testes;

import javax.swing.JOptionPane;

public class you008c {
			
		public static void main(String[] args) {
	
		int n = Integer.parseInt(JOptionPane.showInputDialog("Qual Tabuada deseja que seja exibida"));
		int cont = 0;
		int	resposta = 0;
			
			while(cont < 10){
				cont = cont +1;
				resposta = n * cont;
					JOptionPane.showMessageDialog(null, "TABUADA DO " + n +
														"\n" + n + " x " + cont + " = " + resposta);
			}
	
}}
