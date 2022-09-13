package Testes;

import javax.swing.JOptionPane;

public class you005 {
	public static void main(String[] args) {
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite A Primeira Nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Segunda Nota "));
		double media = (nota1 + nota2) /2;
		
			if(media >= 9) {
				JOptionPane.showMessageDialog(null, "APROVEITAMENTO A " +
													"\nMedia " + media);
			}else if(media >= 8) {
				JOptionPane.showMessageDialog(null, "APROVEITAMENTO B " + 
													"\nMedia " + media);
			}else if(media >= 7) {
				JOptionPane.showMessageDialog(null, "APROVEITAMENTO C " + 
													"\nMedia " + media);
			}else if(media >= 6) {
				JOptionPane.showMessageDialog(null, "APROVEITAMENTO D " + 
													"\nMedia " + media);
			}else if(media >= 5) {
				JOptionPane.showMessageDialog(null, "APROVEITAMENTO E " + 
													"\nMedia " + media);
			}else {
				JOptionPane.showMessageDialog(null, "APROVEITAMENTO F " + 
													"\nMedia " + media);
			}
}}
