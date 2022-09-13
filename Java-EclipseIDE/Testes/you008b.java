package Testes;

import javax.swing.JOptionPane;

public class you008b {
	public static void main(String[] args) {

		int turma = Integer.parseInt(JOptionPane.showInputDialog("Quantos Alunos tem a turma"));
		int cont = 1;
		String aluno = "";
		double nota = 0;
		String melhorA = "";
		double melhorN = 0;
		
			while(cont <= turma) {
					cont++;
				
					aluno = JOptionPane.showInputDialog("Digite o Nome do aluno ");
					nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota do Aluno "));
					
				if(nota > melhorN) {
					melhorA = aluno;
					melhorN = nota;
				}
						
			}
				
			
		
		JOptionPane.showMessageDialog(null, "O melhor aluno é " + melhorA + " Com a Nota " + melhorN );
}}
