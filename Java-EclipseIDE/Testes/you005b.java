package Testes;

import javax.swing.JOptionPane;

public class you005b {
	public static void main(String[] args) {
		
		String time1 = JOptionPane.showInputDialog("Digite o nome do Primeiro Time");
		String time2 = JOptionPane.showInputDialog("Digite o nome do Segundo Time");
		int gols1 = Integer.parseInt(JOptionPane.showInputDialog("Numero de Gols Marcado Pelo " + time1 ));
		int gols2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de Gols Marcados pelo " + time2));
		int diferenca = 0;
		
		if(gols1 > gols2) {
			 diferenca = gols1 - gols2;
		}else {
			diferenca = gols2 - gols1;	
		}
		
		if(diferenca == 0) {
			JOptionPane.showMessageDialog(null, "EMPATE");
		}else if(diferenca <= 3) {
			JOptionPane.showMessageDialog(null, "NORMAL");
		}else {
			JOptionPane.showMessageDialog(null, "GOLEADA");
		}
}}
