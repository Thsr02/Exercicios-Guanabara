package Testes;

import javax.swing.JOptionPane;

public class you004b {
	public static void main(String[] args) {
	
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite Seu Peso Em KG:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite Sua Altura"));
		double IMC = peso / Math.pow(altura, 2);
		
			if(IMC < 17 ) {
				JOptionPane.showMessageDialog(null, "Muito Abaixo do Peso" +
													"\nIMC de " + IMC );
			}else if(IMC <= 18.5) {
				JOptionPane.showMessageDialog(null, "Abaixo do Peso" +
													"\nIMC de " + IMC );
			}else if(IMC <= 25) {
				JOptionPane.showMessageDialog(null, "Peso Ideal" +
													"\nIMC de " + IMC );
			}else if(IMC <= 30) {
				JOptionPane.showMessageDialog(null, "Sobrepeso" +
													"\nIMC de " + IMC );
			}else if(IMC <= 35) {
				JOptionPane.showMessageDialog(null, "Obesidade" +
													"\nIMC de " + IMC );
			}else if(IMC <= 40) {
				JOptionPane.showMessageDialog(null, "Obesidade Severa" +
													"\nIMC de " + IMC );
			}else {
				JOptionPane.showMessageDialog(null, "Obesidade Morbida" +
													"\nIMC de " + IMC );
			}
		
		
}}
