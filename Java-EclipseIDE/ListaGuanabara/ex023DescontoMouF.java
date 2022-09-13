package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex023DescontoMouF {

	public static void main(String[] args) {
	
//		23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
//	para todos, mas especialmente para mulheres. Faça um programa que leia nome,
//	sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
//	que:
//	   - Homens ganham 5% de desconto
//	   - Mulheres ganham 13% de desconto
			double desconto = 0, TotalApagar = 0;	
			String nome = JOptionPane.showInputDialog("Digite Seu nome");
			String sexo = JOptionPane.showInputDialog("Digite seu sexo sendo \nM - Homen \n F - Mulher");
			double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Qual valor da suas Compras"));
			
				switch(sexo){
				case "M":
					desconto = (valorCompra * 5) / 100;
					TotalApagar = valorCompra - desconto;
				break;
				case "F":
					desconto = (valorCompra * 13) / 100;
					TotalApagar = valorCompra - desconto;
				break;
				}
				
					JOptionPane.showMessageDialog(null,nome +" Valor total à pagar com desconto é " + TotalApagar);
}}
