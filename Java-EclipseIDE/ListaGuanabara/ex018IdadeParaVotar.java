package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex018IdadeParaVotar {

	public static void main(String[] args) {
//		18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
//	dela e depois mostre se ela pode ou não votar.
			
		int nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que você nasceu"));
		int idade = 2022 - nascimento;
			if(idade >= 16) {
				JOptionPane.showMessageDialog(null, "Parabéns Você ja tem 16 ou mais e já pode Votar");
			}else {
				JOptionPane.showMessageDialog(null, "Você ainda tem menos de 16 anos de idade e por isso não pode Votar");
			}
		
}}
