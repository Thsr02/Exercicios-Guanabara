package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex010AreaASerPintada {

	public static void main(String[] args) {
	
//		10) Fa�a um algoritmo que leia a largura e altura de uma parede, calcule e
//	mostre a �rea a ser pintada e a quantidade de tinta necess�ria para o servi�o,
//	sabendo que cada litro de tinta pinta uma �rea de 2metros quadrados.
		
		double heigth = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura da Parede"));
		double width = Double.parseDouble(JOptionPane.showInputDialog("Digita a Largura da Parede"));
		double area = heigth * width;
		double tintaUsada = area / 2;
		
			JOptionPane.showMessageDialog(null, "Ser� usado " + tintaUsada + " Litros de Tinta para pintar a area de " + area + " mt� ");
		
}}
