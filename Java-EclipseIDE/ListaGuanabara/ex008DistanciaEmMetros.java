package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex008DistanciaEmMetros {

	public static void main(String[] args) {
		
//		8) Desenvolva um programa que leia uma dist�ncia em metros e mostre os valores
//	relativos em outras medidas.
//	Ex: 
//	Digite uma dist�ncia em metros: 185.72
//	A dist�ncia de 85.7m corresponde a:
//	0.18572Km
//	1.8572Hm
//	18.572Dam 
//	1857.2dm
//	18572.0cm
//	185720.0mm
				double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a Dist�ncia em Metros!"));
					double Km = distancia / 1000;
					double Hm = distancia / 100;
					double Dam = distancia / 10;
					double dm = distancia * 10;
					double cm = distancia * 100;
					double mm = distancia * 1000;
						JOptionPane.showMessageDialog(null, "A dist�ncia em Metros: " + distancia + "corresponde a: " + 
															"\n" + Km + " Quilometros" + 
															"\n" + Hm + " Hect�metro" + 
															"\n" + Dam + " Dec�metro" +
															"\n" + dm + " Dec�metro" +
															"\n" + cm + " Cent�metro" +
															"\n" + mm + " Mil�metro ");
		
		
}}
