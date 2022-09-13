package Testes;

import javax.swing.JOptionPane;

public class you007 {
	public static void main(String[] args) {

		
		double dolar = 4.939;
		double ValorEmReais = 0, ValorEmDolar = 0;
		double conversor = 0;	
		int moeda = 0;
		
							moeda = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A MOEDA QUE DESEJA CONVERTER" +
																				 "\n1 - Real Para Dolar " + 
																				 "\n2 - Dolar Para Real " + 
																				 "\n0 - Sair"));
			
	do {
			 
			
			switch(moeda) {
			case 1:
			
				
					ValorEmReais = Double.parseDouble(JOptionPane.showInputDialog("Digite Valor em Reais"));
					 conversor = ValorEmReais / dolar;
					
					JOptionPane.showMessageDialog(null, + ValorEmReais + " Reais Convertido Em Dolar Na Cotação " + dolar + 
																  "\n Total em Dolar: $ " + conversor);
					
							  moeda = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A MOEDA QUE DESEJA CONVERTER" +
																				   "\n1 - Real Para Dolar " + 
																				   "\n2 - Dolar Para Real " + 
																			       "\n0 - Sair"));
					
			break;	
				
		
			case 2:
			
				ValorEmDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite Valor em Dolar"));
				conversor = ValorEmDolar * dolar;
					
					JOptionPane.showMessageDialog(null, + ValorEmDolar + " Dolares Convertido Em Reais Na Cotação " + dolar + 
														  "\n Total em Reais: $" + conversor);
							   moeda = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A MOEDA QUE DESEJA CONVERTER" +
																     				"\n1 - Real Para Dolar " + 
																				    "\n2 - Dolar Para Real " + 
																				    "\n0 - Sair"));
				
			break;
			
			case 0:
					JOptionPane.showConfirmDialog(null, "Deseja Fechar o Programa", "ENCERRAR", JOptionPane.YES_NO_OPTION);
					moeda = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A MOEDA QUE DESEJA CONVERTER" +
							 "\n1 - Real Para Dolar " + 
							 "\n2 - Dolar Para Real " + 
							 "\n0 - Sair"));
			break;
			
			
			default:
					JOptionPane.showMessageDialog(null, "Opção Invalida");
								moeda = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A MOEDA QUE DESEJA CONVERTER" +
																					 "\n1 - Real Para Dolar " + 
																					 "\n2 - Dolar Para Real " + 
																					 "\n0 - Sair"));
			break;
		}
	}while(moeda != 0);


	
		
}}		
