package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex021AnoBissexto {

	public static void main(String[] args) {
		
//		21) Fa�a um algoritmo que leia um determinado ano e mostre se ele � ou n�o
//	BISSEXTO.
			
			int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que gostaria de saber, se o mesmo � Bissexto"));
				
				if(ano % 400 == 0  && ano % 100 == 0) {
					JOptionPane.showMessageDialog(null, ano + " � um ano Bissexto ");
				}else {
					JOptionPane.showMessageDialog(null, ano + " N�o � um ano Bissexto");
				}

		

}}
