package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex009ReaisParaDolar {

	public static void main(String[] args) {
	
		double reais = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em reais que você possui"));
			double dolar = reais / 3.45;
			
			JOptionPane.showMessageDialog(null, "Você pode comprar "  + dolar + " em Dolares");
		
}}
