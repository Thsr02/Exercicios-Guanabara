package Testes;

import javax.swing.JOptionPane;

public class ex006 {
	
	public static void main(String[] args) {
	
//		Ler 2 notas de um aluno, o seu número de faltas e a quantidade de
//		aulas dadas. Calcule a porcentagem de freqüência e a média das 
//		notas. Retorne a sua situação conforme a tabela abaixo:
//
//			Média                     Frequencia                Situação
//		De 0 a 4,9        Ou          Abaixo de 75%              Reprovado
//		De 5,0 a 6,9      E           75% ou maior              Recuperação
//		De 7,0 acima      E          75% ou maior                Aprovado 
	
		
		
		String aluno = JOptionPane.showInputDialog("Digite o Nome do Aluno");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		double media = (nota1 + nota2) / 2;
		double aulas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de aulas dadas"));
		double faltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de faltas do aluno"));
		double frequencia = (aulas - faltas) / aulas * 100;
		String situacao = "";
		
		
		if(media < 4.9 || frequencia < 75) {
			situacao = "Reprovado ";
		}else if(media <= 6.9) {
			situacao = "Em Recuperação ";
		}else {
			situacao = "Aprovado ";
		}
	
		JOptionPane.showMessageDialog(null, aluno + 
											"\n " + situacao + 
											"\n Media " + media +  
											"\n Frequencia " + frequencia );
		
		
		
		
	}}



 



