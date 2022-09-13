package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex005MediaNotaAluno {

	public static void main(String[] args) {
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		double media = (nota1 + nota2) / 2;
		
			JOptionPane.showMessageDialog(null, "Nota 1: " + nota1 +
												"\nNota 2: " + nota2 + 
												"\nMedia entre " + nota1 + " e " + nota2 + " é igual a " + media);
}}
