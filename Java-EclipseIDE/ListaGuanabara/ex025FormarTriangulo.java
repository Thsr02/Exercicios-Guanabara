package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex025FormarTriangulo {

	public static void main(String[] args) {
	
		
//		25) [DESAFIO] Crie um programa que leia o tamanho de tr�s segmentos de reta.
//	Analise seus comprimentos e diga se � poss�vel formar um tri�ngulo com essas
//	retas. Matematicamente, para tr�s segmentos formarem um tri�ngulo, o comprimento
//	de cada lado deve ser menor que a soma dos outros dois.
				
		int maiorlado = 0;
		int somamenor = 0;
		String triangulo = "";
		
			int part1 = Integer.parseInt(JOptionPane.showInputDialog("Entre Com o Primeiro Lado do triangulo"));
			int part2 = Integer.parseInt(JOptionPane.showInputDialog("Entre Com o segundo Lado do triangulo"));
			int part3 = Integer.parseInt(JOptionPane.showInputDialog("Entre Com o terceiro Lado do triangulo"));
					
			if(part1 > part2 && part1 > part3) {
				maiorlado = part1;
				somamenor = part2 + part3;
			}else if(part2 > part1 && part2 > part3) {
				maiorlado = part2;
				somamenor = part1 + part3;
			}else {
				maiorlado = part3;
				somamenor = part1 + part2;	
			}	
				if(somamenor > maiorlado) {
					triangulo = "As medidas digitadas PODEM sim Formar um Triangulo";
				}else {
					triangulo = "As Medidgas digitadas N�O PODEM formar um Triangulo";
				}
		
		JOptionPane.showMessageDialog(null,triangulo);
}}
