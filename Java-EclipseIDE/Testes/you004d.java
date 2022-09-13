package Testes;

import javax.swing.JOptionPane;

public class you004d {
	public static void main(String[] args) {
   
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		double media = (nota1 + nota2 ) / 2;
		
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado" +
												"\nMedia " + media);	
		}else if(media >= 5){
			JOptionPane.showMessageDialog(null, "Aluno Em Recuperação" +
												"\nMedia " + media);
		}else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado" +
												"\nMedia " + media);
		}
		
		
}}
