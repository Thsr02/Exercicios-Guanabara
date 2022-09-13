package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex012Desconto5Pct {

	public static void main(String[] args) {
//		12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
//	PREÇO PROMOCIONAL, com 5% de desconto.

			double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Produto"));
			double valorDesconto = (preco * 5) / 100 ;
			double precoFinal = preco - valorDesconto;
				JOptionPane.showMessageDialog(null,"Preço Promocional 5% de desconto sai por R$ " + precoFinal);
}}
