package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex009ReaisParaDolar {

	public static void main(String[] args) {
	
		double reais = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em reais que voc� possui"));
			double dolar = reais / 3.45;
			
			JOptionPane.showMessageDialog(null, "Voc� pode comprar "  + dolar + " em Dolares");
		
}}
