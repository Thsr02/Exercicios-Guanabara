package Testes;

import javax.swing.JOptionPane;

public class exswith001 {
	
	public static void main(String[] args) {
		int op1 = 0, op2 = 0;
		
		do {
	
				 op1 = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL" +
																	"\n1 Cadastro" + 
																	"\n2 Editar" + 
																	"\n3 Salvar" +
																	"\n0 Sair"));
		switch (op1) {
					
					case 1:
						do {
							op2 = Integer.parseInt(JOptionPane.showInputDialog("CADASTRAR" + 
																				"\n1 - Funcionário" +
																				"\n2 - Fornecedor" + 
																				"\n3 - Clientes" + 
																				"\n0 - Voltar"));
							switch(op2) {
								
								case 1:
									JOptionPane.showMessageDialog(null, "Cadastrar Funcionario");
								break;
								
								case 2:
									JOptionPane.showMessageDialog(null, "Cadastrar Fornecedor");
								break;
								
								case 3:
									JOptionPane.showMessageDialog(null, "Cadastrar Cliente");
								break;
								
								case 0:
									JOptionPane.showMessageDialog(null, "Menu Anterior");
								break;
								
								default:
									JOptionPane.showMessageDialog(null, "Opção Invalida");
							}
								

						}while(op2 != 0);
					break;	
					
					case 2: 
						JOptionPane.showMessageDialog(null, "Opção Editar");
					break;
					
					case 3:
						JOptionPane.showMessageDialog(null, "Opção Salvar");
					break;
					
					case 0:
						// Opção Sim = 0 Opção Não = 1
						op1 = JOptionPane.showConfirmDialog(null, "Deseja Fechar o Programa?", "ENCERRAR", JOptionPane.YES_NO_OPTION);
					break;
					
					default:
						JOptionPane.showMessageDialog(null, "Opção Inválida");
					break;
		}			
		
		
		}while(op1 != 0);
		
	
	
}}
