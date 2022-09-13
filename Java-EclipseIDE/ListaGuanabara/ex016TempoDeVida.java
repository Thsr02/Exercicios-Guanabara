package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex016TempoDeVida {

	public static void main(String[] args) {
	

//16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
//fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
//já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
//quantos dias de vida um fumante perderá e exiba o total em dias.
				
//				reducao
//				qtdCigarros
//				anosFumante
//				cada cigarro = 10 min de vida
				
				int qtdCigarrosDiario = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos cigarros você fuma por dia!"));
				int anosFumante = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantos anos você é fumante!"));
				int anosEmDias = anosFumante * 365;
					System.out.println(anosEmDias);
				int totalCigarros = anosEmDias * qtdCigarrosDiario;
					System.out.println(totalCigarros);
				int reducao = totalCigarros / 144;
					JOptionPane.showMessageDialog(null, "Você Perdeu " + reducao + "  dias de vida");
		
}}
