package Testes;

import javax.swing.JOptionPane;

public class you001 {
	public static void main(String[] args) {

		
	double F =  Double.parseDouble(JOptionPane.showInputDialog("Digita em fahrenheit"));
	double C = (F - 32) / 1.8;
		JOptionPane.showMessageDialog(null, "Temperatura Convertida de fahrenheit para Celcius é de : " + C);
	
		
}}
