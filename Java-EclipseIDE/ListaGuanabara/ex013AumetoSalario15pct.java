package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex013AumetoSalario15pct {

	public static void main(String[] args) {
//		13) Fa�a um algoritmo que leia o sal�rio de um funcion�rio, calcule e mostre o
//	seu novo sal�rio, com 15% de aumento.

		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario do Funcionario que ira Receber o Aumento"));
		double aumento = (salario * 15) / 100;
		double novoSalario = salario + aumento;
			JOptionPane.showMessageDialog(null, "O Novo Sal�rio do Funcionario com aumento de 15% � " + novoSalario);
		
}}
