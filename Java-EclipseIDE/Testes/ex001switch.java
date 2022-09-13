package Testes;

import javax.swing.JOptionPane;

public class ex001switch {

	public static void main(String[] args) {
	
			int op1 = 0, op2 = 0;
	do {
			op1= Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL" +
															 "\n1 - Cadastrar" +
															 "\n2 - Editar" +
															 "\n3 - Salvar" +
															 "\n0 - Sair"));
			switch(op1) {
			case 1:
				do {
					op2 = Integer.parseInt(JOptionPane.showInputDialog("CADASTRAR" +
																	   "\n1 - Funcionário" +
																	   "\n2 - Fornecedor" +
																	   "\n3 - Cliente" +
																	   "\n0 - Voltar"));
					
					switch(op2) {
					case 1: 
						JOptionPane.showMessageDialog(null, "Cadastrar Funcionário");
					break;
					case 2:
						JOptionPane.showMessageDialog(null, "Cadastrar Fornecedor");
					break;
					case 3:
						JOptionPane.showMessageDialog(null, "Cadastrar Cliente");
					break;
					case 0:
						JOptionPane.showMessageDialog(null, "Voltar ao Menu Anterior");
					break;
					default:
						JOptionPane.showMessageDialog(null, "Opção Invalida " + op2);
					break;
					}
				}while(op2 !=0);
			break;	
			case 2:
				JOptionPane.showMessageDialog(null, "Editar");
			break;
			case 3:
				JOptionPane.showMessageDialog(null, "Salvar");
			break;
			case 0:
				op1 = JOptionPane.showConfirmDialog(null, "Deseja Encerrar o Programa", "ENCERRAR", JOptionPane.YES_NO_OPTION);
			break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida" + op1);
			}
	}while(op1 != 0);
	
}}
