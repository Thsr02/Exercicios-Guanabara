package Testes;

import javax.swing.JOptionPane;

public class you006b {
	public static void main(String[] args) {
			
		int contador = 1;
		int soma = 0;
		int n = 0;
		int cont = 0, cont1 = 0;
		while(contador <= 5) {
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
				if(n > cont) {
				cont = n;
			}else if(cont1 == 0 || (n < cont1)) {
				cont1 = n;
			}
			contador = contador + 1;
		 soma = soma + n;
		 System.out.println(soma);
		}
		JOptionPane.showMessageDialog(null, "Total da soma dos numeros é " + soma +
											"\nMaior numero digitado foi " + cont +
											"\nMenor numero digitado foi " + cont1);
}}
