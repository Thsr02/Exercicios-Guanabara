package Testes;

import javax.swing.JOptionPane;

public class you002 {
	public static void main(String[] args) {
		
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço em Dolar: "));
		double imposto = (preco * 60) / 100;
		JOptionPane.showMessageDialog(null, "O Imposto a ser pago sera de R$: " +  imposto);
		
}}
