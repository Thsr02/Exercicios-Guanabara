package tarefa_for;

import javax.swing.JOptionPane;

public class ex006decrescenteEM3 {
	public static void main(String[] args) {
	
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
			for(int cont = n; cont >=0; cont -=3) {
				System.out.print(cont + " | ");
			}
		
		
}}
