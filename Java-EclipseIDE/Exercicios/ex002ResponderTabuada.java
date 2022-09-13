package Exercicios;

import javax.swing.JOptionPane;

public class ex002ResponderTabuada {

	public static void main(String[] args) {

		int number1 = 0, number2 = 0, answer = 0, question = 0, option1 = 0, option2 = 0, porcentCorrect = 0, porcentWrong = 0, correct = 0, wrong = 0, play = 0;
		String showMult = "";
		do {		
		
			number1 = (int)(Math.random() * 8 + 2);
			number2 = (int) (Math.random() * 8 + 2);
				answer = number1 * number2;
				showMult = "";
				play++;
					System.out.println(answer);
			question = Integer.parseInt(JOptionPane.showInputDialog( number1 + " x " + number2 + " =  ?"));
				
				if(question == answer) {
						correct++;
					JOptionPane.showMessageDialog(null, "Parabéns Você acertou");
				}else {
						wrong++;
					JOptionPane.showMessageDialog(null, "Oops você errou");
					option2 =Integer.parseInt(JOptionPane.showInputDialog(null, "Gostaria de Exibir a Tabuada?" +
															"\n1 - Para Tabuada do " + number1 +
															"\n2 -  Para Tabuada do " + number2 + 
															"\n0 - Sair"));
							if(option2 == 1) {
									for(int cont = 1; cont <= 10; cont++) {
										int multAnswer = number1 * cont;
									showMult += number1 + " x " + cont + " = " + multAnswer + "\n" ;
										
									}
								JOptionPane.showMessageDialog(null, "Tabuada do " + number1 + "\n" + showMult);
																	
							}else if(option2 == 2){
								for(int cont = 1; cont <= 10; cont++) {
									int multAnswer = number2 * cont;
								showMult += number2 + " x " + cont + " = " + multAnswer + "\n" ;
									
								}
								JOptionPane.showMessageDialog(null, "Tabuada do " + number2 + "\n" + showMult);
							}
				}
				
			option1 = JOptionPane.showConfirmDialog(null, "Deseja Continuar?","FECHAR PROGRAMA", JOptionPane.YES_NO_OPTION);
		}while(option1 != 1);
			porcentCorrect = (correct * 100) / play;
			porcentWrong = (wrong * 100) / play;
			JOptionPane.showMessageDialog(null, "Você jogou " + play + " vezes" +
												"\nAcertou " + correct + " respostas " + porcentCorrect + "%" +
												"\nErrou " + wrong + " respostas " + porcentWrong + "%");
												

}}
