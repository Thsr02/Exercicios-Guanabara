package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex003SalarioFuncionario {

	public static void main(String[] args) {
	
		String nomeFunc = JOptionPane.showInputDialog("Digite o nome do Funcionario");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario do Funcionario"));
		
		JOptionPane.showMessageDialog(null, "Nome Do Funcionario " + nomeFunc + 
											"\nSalário " + salario + " em 17 de junho de 2022");
}}
