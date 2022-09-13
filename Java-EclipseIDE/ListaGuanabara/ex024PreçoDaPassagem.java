package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex024PreçoDaPassagem {

	public static void main(String[] args) {
//		24) Faça um algoritmo que pergunte a distância que um passageiro deseja
//	percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
//	viagens até 200Km e R$0.45 para viagens mais longas.
			
		double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos KM tem sua Viagem"));
		double valor = 0;	
				
				if(distancia <= 200) {
					valor = distancia * 0.50;
				}else {
					valor = distancia * 0.45;
				}
					JOptionPane.showMessageDialog(null, "Valor da passagem para esta distancia fica em: " + valor + "$");
}}
