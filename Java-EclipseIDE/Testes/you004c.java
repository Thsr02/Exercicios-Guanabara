package Testes;

import javax.swing.JOptionPane;

public class you004c {
	public static void main(String[] args) {
		
		int anoatual = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano em que Estamos"));
		int anonascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de Nascimento"));
		int idade = anoatual - anonascimento;
		
		if(idade < 18) {
			JOptionPane.showMessageDialog(null, "N�o Esta Apto a tirar Habilita��o" +
												"\nIdade " + idade);
		}else {
			JOptionPane.showMessageDialog(null, "APTO a tirar Habilita��o" +
												"\nIdade " + idade);	
		}
		
}}
