package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex015HorasTrabalhada {

	public static void main(String[] args) {
		 
//		15) Crie um programa que leia o n�mero de dias trabalhados em um m�s e mostre o
//		sal�rio de um funcion�rio, sabendo que ele trabalha 8 horas por dia e ganha R$25
//		por hora trabalhada.
			
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias voc� Trabalhou este m�s"));
		double salario = dias * (8 * 25);
			JOptionPane.showMessageDialog(null, "Sal�rio a receber neste m�s �: " + salario);
		
}}
