package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex012Desconto5Pct {

	public static void main(String[] args) {
//		12) Crie um programa que leia o pre�o de um produto, calcule e mostre o seu
//	PRE�O PROMOCIONAL, com 5% de desconto.

			double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Produto"));
			double valorDesconto = (preco * 5) / 100 ;
			double precoFinal = preco - valorDesconto;
				JOptionPane.showMessageDialog(null,"Pre�o Promocional 5% de desconto sai por R$ " + precoFinal);
}}
