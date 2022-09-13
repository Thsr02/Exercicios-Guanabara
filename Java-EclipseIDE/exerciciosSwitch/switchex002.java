package exerciciosSwitch;

import javax.swing.JOptionPane;

public class switchex002 {
	public static void main(String[] args){
		
//		Fazer uma classe para ler o código de um determinado produto e mostrar a sua classificação
//      Utilize a seguinte tabela como refêrencia:
//		Código   							    Classificação
//        1									Alimento não-perecivel
//     2 ate 4								alimento perecivel
//	   5 ou 6									Vestuário
//	      7									Higiene Pessoal
//		8 até 10						 Limpeza  e Utensílios Domésticos
//	Qualquer outro código 							Inválido
		
		
				int code = Integer.parseInt(JOptionPane.showInputDialog("Entre com Código do Produto"));
				
			switch(code) {
				case 1:
					JOptionPane.showMessageDialog(null, "Alimento Não-Perecível");
				break;
				
				case 2: case 3: case 4:
					JOptionPane.showMessageDialog(null, "Alimento Perecível");
				break;
				
				case 5: case 6:
					JOptionPane.showMessageDialog(null, "Vestuário");
				break;
				
				case 7:
					JOptionPane.showMessageDialog(null, "Higiene Pessoal");
				break;
				
				case 8: case 9: case 10:
					JOptionPane.showMessageDialog(null, "Limpeza e Utensílios Domésticos");
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Inválido");
				break;
			}
		
		
		
		
		
}}
