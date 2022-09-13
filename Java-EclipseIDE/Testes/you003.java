package Testes;

import javax.swing.JOptionPane;

public class you003 {
	public static void main(String[] args) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor que deseja emprestar"));
		double valorpago = (valor * 20) / 100;
		double valortotal = valorpago + valor;
		double parcela = Double.parseDouble(JOptionPane.showInputDialog("Digite em quantas parcelas quer pagar"));
		double valorparcela = valortotal / parcela;
		
			JOptionPane.showMessageDialog(null, "Valor do Emprestimo : " + valor +
												"\nValor à pagar com juros de 20% " + valortotal +
												"\nParcelado em " + parcela + " vezes" +
												"\nValor das Parcelas " + valorparcela );		
		
		
}}
