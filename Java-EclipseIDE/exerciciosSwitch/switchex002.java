package exerciciosSwitch;

import javax.swing.JOptionPane;

public class switchex002 {
	public static void main(String[] args){
		
//		Fazer uma classe para ler o c�digo de um determinado produto e mostrar a sua classifica��o
//      Utilize a seguinte tabela como ref�rencia:
//		C�digo   							    Classifica��o
//        1									Alimento n�o-perecivel
//     2 ate 4								alimento perecivel
//	   5 ou 6									Vestu�rio
//	      7									Higiene Pessoal
//		8 at� 10						 Limpeza  e Utens�lios Dom�sticos
//	Qualquer outro c�digo 							Inv�lido
		
		
				int code = Integer.parseInt(JOptionPane.showInputDialog("Entre com C�digo do Produto"));
				
			switch(code) {
				case 1:
					JOptionPane.showMessageDialog(null, "Alimento N�o-Perec�vel");
				break;
				
				case 2: case 3: case 4:
					JOptionPane.showMessageDialog(null, "Alimento Perec�vel");
				break;
				
				case 5: case 6:
					JOptionPane.showMessageDialog(null, "Vestu�rio");
				break;
				
				case 7:
					JOptionPane.showMessageDialog(null, "Higiene Pessoal");
				break;
				
				case 8: case 9: case 10:
					JOptionPane.showMessageDialog(null, "Limpeza e Utens�lios Dom�sticos");
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Inv�lido");
				break;
			}
		
		
		
		
		
}}
