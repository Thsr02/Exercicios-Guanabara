package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex014Pre�oApagarLocadoraCarro {

	public static void main(String[] args) {
//		14) A locadora de carros precisa da sua ajuda para cobrar seus servi�os. Escreva
//	um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
//	quantidade de dias pelos quais ele foi alugado. Calcule o pre�o total a pagar,
//	sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.

			double km = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos Quilometros voc� rodou com carro"));
			int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite Quantos dias ficou com carro"));
			double valorEmDias = dias * 90;
			double valorEmKm = km * 0.20;
			double valorTotal = valorEmDias + valorEmKm;
				JOptionPane.showMessageDialog(null, "Valor a pagar pelo aluguel do ve�culo �: " + valorTotal);

}}
