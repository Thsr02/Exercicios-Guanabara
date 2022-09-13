package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex015HorasTrabalhada {

	public static void main(String[] args) {
		 
//		15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
//		salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
//		por hora trabalhada.
			
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias você Trabalhou este mês"));
		double salario = dias * (8 * 25);
			JOptionPane.showMessageDialog(null, "Salário a receber neste mês é: " + salario);
		
}}
