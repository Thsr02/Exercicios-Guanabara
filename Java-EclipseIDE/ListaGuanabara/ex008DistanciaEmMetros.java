package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex008DistanciaEmMetros {

	public static void main(String[] args) {
		
//		8) Desenvolva um programa que leia uma distância em metros e mostre os valores
//	relativos em outras medidas.
//	Ex: 
//	Digite uma distância em metros: 185.72
//	A distância de 85.7m corresponde a:
//	0.18572Km
//	1.8572Hm
//	18.572Dam 
//	1857.2dm
//	18572.0cm
//	185720.0mm
				double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a Distância em Metros!"));
					double Km = distancia / 1000;
					double Hm = distancia / 100;
					double Dam = distancia / 10;
					double dm = distancia * 10;
					double cm = distancia * 100;
					double mm = distancia * 1000;
						JOptionPane.showMessageDialog(null, "A distância em Metros: " + distancia + "corresponde a: " + 
															"\n" + Km + " Quilometros" + 
															"\n" + Hm + " Hectômetro" + 
															"\n" + Dam + " Decâmetro" +
															"\n" + dm + " Decímetro" +
															"\n" + cm + " Centímetro" +
															"\n" + mm + " Milímetro ");
		
		
}}
