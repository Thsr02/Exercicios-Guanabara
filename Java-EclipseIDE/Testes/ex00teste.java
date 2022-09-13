package Testes;

import javax.swing.JOptionPane;

public class ex00teste {
		public static void main(String[] args){
			
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite primeiro numero"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo numero"));
			int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite terceiro numero"));
			int maior = 0;
			int meio = 0;
			int menor = 0;
			
			if(num1 > num2 && num1 > num3) {
				 maior = num1;
			 }else if (num1 < num2 && num1 < num3) {
				menor = num1;
			 }else {
				meio = num1;
			}
			 
			 if(num2 > num1 && num2 > num3) {
				 maior = num2;
			 }else if (num2 < num1 && num2 < num3) {
				menor = num2;
			 }else {
				meio = num2;
			}
			 
			 if(num3 > num1 && num3 > num2) {
				 maior = num3;
			 }else if (num3 < num1 && num3 < num2) {
				menor = num3;
			 }else {
				meio = num3;
			}
			JOptionPane.showMessageDialog(null, "  " + menor + "  " + meio + "  " + maior);
			
}}
