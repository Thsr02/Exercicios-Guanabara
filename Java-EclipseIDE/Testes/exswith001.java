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
																				"\n1 - Funcion�rio" +
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
									JOptionPane.showMessageDialog(null, "Op��o Invalida");
							}
								

						}while(op2 != 0);
					break;	
					
					case 2: 
						JOptionPane.showMessageDialog(null, "Op��o Editar");
					break;
					
					case 3:
						JOptionPane.showMessageDialog(null, "Op��o Salvar");
					break;
					
					case 0:
						// Op��o Sim = 0 Op��o N�o = 1
						op1 = JOptionPane.showConfirmDialog(null, "Deseja Fechar o Programa?", "ENCERRAR", JOptionPane.YES_NO_OPTION);
					break;
					
					default:
						JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
					break;
		}			
		
		
		}while(op1 != 0);
		
	
	
}}
