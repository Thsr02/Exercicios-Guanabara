package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex013AumetoSalario15pct {

	public static void main(String[] args) {
//		13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
//	seu novo salário, com 15% de aumento.

		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario do Funcionario que ira Receber o Aumento"));
		double aumento = (salario * 15) / 100;
		double novoSalario = salario + aumento;
			JOptionPane.showMessageDialog(null, "O Novo Salário do Funcionario com aumento de 15% é " + novoSalario);
		
}}
