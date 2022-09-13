package exerciciosSwitch;

import javax.swing.JOptionPane;

public class switchex003 {
	public static void main(String[] args) {
		String funcionario = JOptionPane.showInputDialog("Digite o nome do Funcionario");
		String categoria = JOptionPane.showInputDialog("Leia a categoria em Numeros Romanos");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o  valor do salário"));
		double reajuste = 0;
		
			switch(categoria){
				case "I":
					reajuste = salario * 1.1;
				break;
				
				case "II":
					reajuste = salario * 1.15;
				break;
				
				case "III":
					reajuste = salario * 1.20;
				break;
				
				case "IV":
					reajuste = salario * 1.25;
				break;
				
				case "V":
					reajuste = salario * 1.30;
				break;
				
				default:
					reajuste = salario * 1.40;
				break;
			}
				JOptionPane.showMessageDialog(null, "Salário do " + funcionario + " Reajustado é " + reajuste);
		
	}}
