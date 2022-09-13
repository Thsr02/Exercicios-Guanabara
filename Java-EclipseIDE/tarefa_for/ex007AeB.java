package tarefa_for;

import javax.swing.JOptionPane;

public class ex007AeB {
	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digita valor de A"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
		
			for(int cont= a; cont < b; cont++) {
				if(cont > a)
				System.out.print(cont + " | ");
					
				
			}
		
		
		
}}
