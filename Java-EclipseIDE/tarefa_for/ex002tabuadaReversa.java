package tarefa_for;

import javax.swing.JOptionPane;

public class ex002tabuadaReversa {
	
	public static void main(String [] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a Tabuada a Ser Exibida"));
		String caixaResposta = "";
		
		for(int cont = 10; cont >= 0; cont--) {
			int resposta = n * cont;
			caixaResposta += n + " x " + cont + " = " + resposta + "\n";
		}
		
		JOptionPane.showMessageDialog(null, "TABUADA REVERSA DO " + n + "\n" + caixaResposta);
		
}}
