package Testes;

import javax.swing.JOptionPane;

public class you008 {

	public static void main(String[] args){
		
//		CONTADOR INTELIGENTE
		
		int inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o N�mero que ir� iniciar o contador"));
		int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o N�mero Final do contador"));
		
		
		
		if(inicio < fim) {
			while(inicio <= fim){
				System.out.println(inicio);
				inicio = inicio + 1;
			}
		}else{
			while(inicio >= fim) {
				System.out.println(inicio);
				inicio = inicio - 1;
			}
		}
		
}}
