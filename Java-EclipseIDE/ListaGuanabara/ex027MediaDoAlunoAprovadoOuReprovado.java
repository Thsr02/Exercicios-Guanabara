package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex027MediaDoAlunoAprovadoOuReprovado {

	public static void main(String[] args) {


//		27) Crie um programa que leia duas notas de um aluno e calcule a sua m�dia,
//	mostrando uma mensagem no final, de acordo com a m�dia atingida:
//	   - M�dia at� 4.9: REPROVADO
//	   - M�dia entre 5.0 e 6.9: RECUPERA��O
//	   - M�dia 7.0 ou superior: APROVADO

				double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
				double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda Nota"));
				double media = (nota1 + nota2) /2;
				System.out.println(media);
				
					if(media <= 4.9) {
						JOptionPane.showMessageDialog(null, "Aluno Reprovado");
					}else if(media <= 6.9) {
						JOptionPane.showMessageDialog(null, "Aluno em Recupera��o");	
					}else {
						JOptionPane.showMessageDialog(null, "Aluno Aprovado");
					}
		
		
		
}}
