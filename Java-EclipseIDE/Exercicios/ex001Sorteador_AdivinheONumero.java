package Exercicios;

import javax.swing.JOptionPane;

public class ex001Sorteador_AdivinheONumero {

	public static void main(String[] args) {
		
			int randowNumber = 0, attempt = 0, cont = 0, option = 0, points = 0, totPoints = 0, play = 0;
			
			   do {
				   	randowNumber = (int) (Math.random() * 100 + 1);
					     System.out.println(randowNumber);
					     cont =1; System.out.println(cont);
					     	play++;
						do {
							attempt = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1 e 100"));
								
									if(attempt < 1 || attempt > 100) {
										JOptionPane.showMessageDialog(null, "Número Inválido digite Apenas Entre 1 e 100");
									}
									else if(attempt < randowNumber) {
										JOptionPane.showMessageDialog(null, "Uma Dica Para Ajudar Você, o Número digita é MENOR que o Sorteado");
											cont++;
									}else if(attempt > randowNumber) {
										JOptionPane.showMessageDialog(null, "Uma Dica Para Ajudar Você, o Número digita é MAIOR que o Sorteado");
											cont++;
									}else {
										JOptionPane.showMessageDialog(null, "Parabéns Você Acertou na º" +cont+ " Tentativa");
									}
									if(cont > 7) {
										JOptionPane.showMessageDialog(null, "Que Pena você suas Chances Acabaram, Vamos tentar de novo?");
									}
												switch(cont) {
													case 1 : points = 100;
													break;
													case 2 : points = 80;
													break;
													case 3 : points = 60;
													break;
													case 4 : points = 40;
													break;
													case 5 : points = 20;
													break;
													case 6 : points = 10;
													break;
													case 7 : points = 5;
													break;
													default : points = 0;
													break;
												}
									
						}while(randowNumber != attempt && cont <= 7 );
							 JOptionPane.showMessageDialog(null, "Pontos feitos na Rodada: " + points);					
									totPoints += points;	
										
						
					option = JOptionPane.showConfirmDialog(null, "Deseja Continuar a Jogar","FECHAR PROGRAMA", JOptionPane.YES_NO_OPTION);
				}while(option != 1);
			   
			   				 JOptionPane.showMessageDialog(null, "Você vez o total de " + totPoints+ " Pontos" +
			   						 							 "\nEm " +play+ " Jogadas");	
}}
