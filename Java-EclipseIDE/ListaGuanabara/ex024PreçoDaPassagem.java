package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex024Pre�oDaPassagem {

	public static void main(String[] args) {
//		24) Fa�a um algoritmo que pergunte a dist�ncia que um passageiro deseja
//	percorrer em Km. Calcule o pre�o da passagem, cobrando R$0.50 por Km para
//	viagens at� 200Km e R$0.45 para viagens mais longas.
			
		double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos KM tem sua Viagem"));
		double valor = 0;	
				
				if(distancia <= 200) {
					valor = distancia * 0.50;
				}else {
					valor = distancia * 0.45;
				}
					JOptionPane.showMessageDialog(null, "Valor da passagem para esta distancia fica em: " + valor + "$");
}}
