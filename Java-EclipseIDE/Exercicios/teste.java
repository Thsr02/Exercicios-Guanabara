package Exercicios;

import javax.swing.JOptionPane;

public class teste {
	public static void main(String[] args) {
		
		int number = 0, cont = 0, op1 = 3, RandowNumber = 0;
	
	
		do {
				 RandowNumber =(int) (Math.random()  * 100 +1);
				System.out.println(RandowNumber);
				cont = 0;
			do {
				
				// falta exibir que ele eh maior ou menor q o randow
				number = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Numero de 0 a 100"));
				cont++;
				
				    if(number < 1 || number >= 101) {
				    	JOptionPane.showMessageDialog(null, "Número digitado invalido");
				    }else if(RandowNumber != number) {
						JOptionPane.showMessageDialog(null, "Errou Tente Novamente");
					}else if(RandowNumber > number) {
						JOptionPane.showMessageDialog(null, number +" O Número que digitou é MENOR, que o RandowNumber ");
					}else if(RandowNumber < number) {
						JOptionPane.showMessageDialog(null, number +" O Número que digitou é MAIOR, que o RandowNumber ");

					}else{
						JOptionPane.showMessageDialog(null, "Parabéns, você acertou" + " Na " + "º" + cont);
					}
			
			}while(RandowNumber != number);	    
		op1 = JOptionPane.showConfirmDialog(null, "Deseja Continuar","ENCERRAR", JOptionPane.YES_NO_OPTION);

			
		}while(op1 != 1);	
	
	




}}
