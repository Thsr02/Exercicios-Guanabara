package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex018IdadeParaVotar {

	public static void main(String[] args) {
//		18) Fa�a um programa que leia o ano de nascimento de uma pessoa, calcule a idade
//	dela e depois mostre se ela pode ou n�o votar.
			
		int nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que voc� nasceu"));
		int idade = 2022 - nascimento;
			if(idade >= 16) {
				JOptionPane.showMessageDialog(null, "Parab�ns Voc� ja tem 16 ou mais e j� pode Votar");
			}else {
				JOptionPane.showMessageDialog(null, "Voc� ainda tem menos de 16 anos de idade e por isso n�o pode Votar");
			}
		
}}
