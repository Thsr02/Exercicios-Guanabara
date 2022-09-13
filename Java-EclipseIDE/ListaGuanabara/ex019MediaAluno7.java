package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex019MediaAluno7 {

	public static void main(String[] args) {
	
//		19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
//	média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
//	não um bom aproveitamento (se ficou acima da média 7.0).

			String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno");
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primera nota do Aluno  " + nomeAluno));
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do Aluno " + nomeAluno));
			double media = (nota1 + nota2) / 2;
				
				if(media > 7) {
					JOptionPane.showMessageDialog(null, "Media do Aluno " + nomeAluno + " = " + media + "\nFicou acima da Media" );
				}else {
					JOptionPane.showMessageDialog(null, "Media do Aluno " + nomeAluno + " = " + media + "\nFicou Abaixo da Media");
				}
}}
