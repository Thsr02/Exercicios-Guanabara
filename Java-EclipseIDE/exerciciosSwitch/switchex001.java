package exerciciosSwitch;

import javax.swing.JOptionPane;

public class switchex001 {
	public static void main(String[] args) {

//		1- Elabore um programa que leia a idade de um nadador e classifique-o em uma das seguintes categorias
//		- não permitido = abaixo de 5 anos
//		- Infantil A = 5 a 7 anos
//		- Infantil B = 8 a 11 anos
//		-Juvenil A = 12 a 13 anos
//		Juvenil B = 14 a 17  anos
//		- Adultos = Maiores de 18 anos
		
		
			String nadador = JOptionPane.showInputDialog("Digite o Nome do Nadador");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Entre Com a Idade Para Descobrir a Classificação do Nadador"));
			
				switch(idade) {
				case 0: case 1: case 2: case 3: case 4:
					JOptionPane.showMessageDialog(null, "Classificação Não Permitida ABAIXO DOS 5 ANOS");
				break;
				
				case 5: case 6: case 7:
					JOptionPane.showMessageDialog(null, "Classificação do Nadador " + nadador + " INFANTIL A");
				break;
				
				case 8: case 9: case 10: case 11:
					JOptionPane.showMessageDialog(null, "Classificação do Nadador " + nadador + " INFANTIL B");
				break;
				
				case 12: case 13:
					JOptionPane.showMessageDialog(null, "Classificação do Nadador " + nadador + " JUVENIL A");
				break;
				
				case 14: case 15: case 16: case 17:
					JOptionPane.showMessageDialog(null, "Classificação do Nadador " + nadador + " JUVENIL B");
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Classificação do Nadador " + nadador + " ADULTO");
				break;
				}
			
			
			
			
			
	}}
