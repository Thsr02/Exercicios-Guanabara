package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex021AnoBissexto {

	public static void main(String[] args) {
		
//		21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
//	BISSEXTO.
			
			int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que gostaria de saber, se o mesmo é Bissexto"));
				
				if(ano % 400 == 0  && ano % 100 == 0) {
					JOptionPane.showMessageDialog(null, ano + " É um ano Bissexto ");
				}else {
					JOptionPane.showMessageDialog(null, ano + " Não é um ano Bissexto");
				}

		

}}
