package Testes;

import javax.swing.JOptionPane;

public class you004 {
	public static void main(String[] args) {

		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso em KG: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Altura: "));
		double IMC = peso / Math.pow(altura, 2);
			
			if(IMC >= 18.5 && IMC < 25) {
				JOptionPane.showMessageDialog(null, "IMC de " + IMC +
													"\nVocê Esta Dentro da Faixa de Peso Ideal");

			}else {
				JOptionPane.showMessageDialog(null, "IMC de " + IMC +
													"\nVocê Esta Fora da Faixa de Peso Ideal");
			}
		
}}
