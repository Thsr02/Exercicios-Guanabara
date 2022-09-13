package exerciciosSwitch;

import javax.swing.JOptionPane;

public class switchex005 {
	public static void main(String[] args) {
// Faça uma classe que leia o valor de um produto e calcule o seu novo
//		valor conforme a seu setor. Utilize o comando Escolha-Caso, 
//		Setor do Produto         Reajuste 
		
//		Roupas                      10%
//		Cozinha                     25% 
//		Eletrodomésticos            22%
//		Eletrônicos                 18%
//		Brinquedos                  32% 
//		Cama, mesa e banho          17%
//		Informática                 28% 
//		Higiene                     14%
//		Outros                      30% 
//		Exibir o setor do produto, o preço antigo e o preço novo. 
			
			
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Produto"));
			double reajuste = 0;
			String setor = JOptionPane.showInputDialog("Digite o produto que deseja reajustar o preço");
		
		switch(setor) {
				
			case "roupas":
				reajuste = valor * 1.10;
			break;
			
			case "cozinha":
				reajuste = valor * 1.25;
			break;
			
			case "eletrodomesticos":
				reajuste = valor * 1.22;
			break;
			
			case "eletronicos":
				reajuste = valor * 1.18;
			break;
			
			case "brinquedo":
				reajuste = valor * 1.32;
			break;
			
			case "cama": case "mesa": case "banho":
				reajuste = valor * 1.17;
			break;
			
			case "informatica":
				reajuste = valor * 1.28;
			break;
			
			case "higiene":
				reajuste = valor * 1.14;
			break;
			
			case "outros":
				reajuste = valor * 1.30;
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Setor " + setor + " INVALIDO" );
			break;
			
			
		}
		JOptionPane.showMessageDialog(null, "O produto do setor " + setor + " com o valor " + valor + ", foi reajustado. Novo valor é de : " + reajuste );
		
			
		
}}
