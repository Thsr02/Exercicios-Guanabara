package Testes;

import javax.swing.JOptionPane;

public class ex002 {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o Nome do Usuario");
		String sexo = JOptionPane.showInputDialog("Digite o Sexo do Usuario" +
												  "\n'M' para Masculino" +
												  "\n'F' para Feminino ");
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Usuario"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o Peso Do Usuario"));
		double pesoIdeal = 0;
		double diferenca = 0;
		
		if(sexo.equalsIgnoreCase("m")) {
			pesoIdeal = (72.7 * altura) - 58;
		}else{
			pesoIdeal = (62.1 * altura) - 44.7;
		}
			pesoIdeal = Math.floor(pesoIdeal);
			
		if(peso > pesoIdeal) {
			diferenca = peso - pesoIdeal;
				JOptionPane.showMessageDialog(null, nome + " Você está " + diferenca + "KG Acima do Peso Ideal " + pesoIdeal );
		}else if(peso < pesoIdeal) {
			diferenca = pesoIdeal - peso;
			JOptionPane.showMessageDialog(null, nome + " Você está " + diferenca + "KG Abaixo do Peso Ideal " + pesoIdeal);
		}else {
			JOptionPane.showMessageDialog(null, nome + " Você está no seu Peso Ideal " + pesoIdeal);
		}
		
		
		
	}}