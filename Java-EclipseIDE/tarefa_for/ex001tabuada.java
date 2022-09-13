package tarefa_for;

import javax.swing.JOptionPane;

public class ex001tabuada {
	
	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a Tabuada que deseja Exibir"));
		String caixaResposta = "";
		for(int cont = 0; cont <= 10; cont++) {
			// System.out.print(cont);
			int resposta = n * cont;
			caixaResposta += n + " x " + " = " + resposta + "\n";
			
			
		}
		JOptionPane.showMessageDialog(null, "TABUADA DO  " + n + "\n" + caixaResposta);
		
		
}}
