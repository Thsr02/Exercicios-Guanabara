package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex022AlistamentoObrigatorio {

	public static void main(String[] args) {
//		22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
//	situação em relação ao alistamento militar.
//	   - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
//	alistamento.
//	   - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
//	alistamento.
			
			int nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que você nasceu"));
			int idade = 2022 - nascimento;
			int restante = 0;
				System.out.println(idade);
				if(idade >= 18) {
					restante = idade - 18;
						System.out.println(restante);
						JOptionPane.showMessageDialog(null, "Se Passaram " + restante + " ano do seu alistamento Obrigatorio ");
				}else {
					restante = 18 - idade;
					System.out.println(restante);
						JOptionPane.showMessageDialog(null, "Faltam " + restante + " Anos Para o seu Alistamento Obrigatorio");
				}
		
		
}}
