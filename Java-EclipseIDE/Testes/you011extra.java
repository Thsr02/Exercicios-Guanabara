package Testes;

import javax.swing.JOptionPane;

public class you011extra {
	
	public static void main(String[] args) {
	
	  int	menu = 0;	
	do {	
		 menu = Integer.parseInt(JOptionPane.showInputDialog("  Digite 1 Para contar de 1 a 10" +
															 "\nDigite 2 Para Contar de 10 a 1" +
    														 "\nDigite 3 Para Sair"));
	switch(menu) {
			
			case 1:
				 for(int cont = 1; cont <= 10; cont++) {
					 System.out.print(cont + " | ");
				 }
			break;
			
			case 2:
				for(int cont = 10; cont >= 1; cont--) {
					System.out.print(cont + " | ");
				}
			break;
			
			case 3:
				menu = JOptionPane.showConfirmDialog(null, "Deseja Fechar o Contador", "ENCERRAR", JOptionPane.YES_NO_OPTION);
			break;
		}
	}while(menu !=0);
}}
