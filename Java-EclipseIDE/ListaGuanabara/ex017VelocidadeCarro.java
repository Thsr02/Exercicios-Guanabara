package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex017VelocidadeCarro {

	public static void main(String[] args) {
//		17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
//	80Km/h, exiba uma mensagem dizendo que o usu�rio foi multado. Nesse caso, exiba
//	o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

			int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Qual a velocidade do veic�lo"));
			int multa = 0;
				if(velocidade > 80) {
					multa = (velocidade - 80) * 5;
					JOptionPane.showMessageDialog(null, "Voc� Foi Multado" + 
														"\nValor da Multa " + multa + "$");
				}
			
		
}}
