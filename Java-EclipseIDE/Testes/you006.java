package Testes;

import javax.swing.JOptionPane;

public class you006 {
	
	public static void main(String[] args) {
		
		int contador = 0;
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite ate o numero que deseja contar"));
		int salto = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do salto"));
		while(contador <= valor) {
			System.out.println(contador);
			contador = contador + salto;
		}
		
		
	
	}}
