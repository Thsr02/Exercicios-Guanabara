package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex016TempoDeVida {

	public static void main(String[] args) {
	

//16) [DESAFIO] Escreva um programa para calcular a redu��o do tempo de vida de um
//fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
//j� fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
//quantos dias de vida um fumante perder� e exiba o total em dias.
				
//				reducao
//				qtdCigarros
//				anosFumante
//				cada cigarro = 10 min de vida
				
				int qtdCigarrosDiario = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos cigarros voc� fuma por dia!"));
				int anosFumante = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantos anos voc� � fumante!"));
				int anosEmDias = anosFumante * 365;
					System.out.println(anosEmDias);
				int totalCigarros = anosEmDias * qtdCigarrosDiario;
					System.out.println(totalCigarros);
				int reducao = totalCigarros / 144;
					JOptionPane.showMessageDialog(null, "Voc� Perdeu " + reducao + "  dias de vida");
		
}}
