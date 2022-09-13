package exerciciosSwitch;

import javax.swing.JOptionPane;

public class switchex004 {
	public static void main(String[] args) {

		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do mês"));
		
			switch(dia) {
				case 1: case 8: case 15: case 22: case 29:
					JOptionPane.showMessageDialog(null, "DOMINGO");
				break;
				
				case 2: case 9: case 16: case 23: case 30:
					JOptionPane.showMessageDialog(null, "SEGUNDA-FEIRA");
				break;
				
				case 3: case 10: case 17: case 24: 
					JOptionPane.showMessageDialog(null, "TERÇA-FEIRA");
				break;
				
				case 4: case 11: case 18: case 25:
					JOptionPane.showMessageDialog(null, "QUARTA-FEIRA");
				break;
				
				case 5: case 12: case 19: case 26: 
					JOptionPane.showMessageDialog(null, "QUINTA-FEIRA");
				break;
				
				case 6: case 13: case 20: case 27:
					JOptionPane.showMessageDialog(null, "SEXTA-FEIRA");
				break;
				
				case 7: case 14: case 21: case 28:
					JOptionPane.showMessageDialog(null, "SABADO");
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA");
			}
		
		
	}}
