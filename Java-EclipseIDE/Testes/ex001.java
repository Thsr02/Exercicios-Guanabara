package Testes;

import javax.swing.JOptionPane;

public class ex001 {
	public static void main(String[] args) {

//		Leia:Tipo(Tipo de Pagamento) Valor(Valor da Compra)    Juros(Juros) um valor em %
//		Verificando  o  tipo  de  pagamento  e  utilizando a  lógica  conforme  
//		a tabela  abaixo, calcule  o  valor  da  1ª  parcela  (Parc1)  e  o valor  
//		da 2ª parcela (Parc2). 
//		TIPO DE PAGAMENTO      FORMA DE PAGAMENTO                       PARC1                              PARC2                  
//		       1                  À Vista                          VC (valor da compra)                   0 (zero)        
//             2                  À prazo                              50% do VC                 (valor da compra(50% do VC)
//																										+ J (juros)
//		     Outro				  Invalido							    0 (zero)				   		 0 (zero)	
//				
		//Exibir: Forma de Pagamento, Parc1 e Parc2.
				
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("FORMA DE PAGAMENTO" +
																"\n1- À vista" +
																"\n2- À Prazo"));
		double valor = 0, parc1 = 0, parc2 = 0, juros = 0;
		String forma = "";
		
		if(tipo != 1 && tipo != 2) {
			forma = "Forma De Pagamento Inválida";
		}else if(tipo == 1) {
			forma = "Pagamento À Vista";
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor Da Compra"));
			parc1 = valor;
		}else if(tipo == 2) {
			forma = "Pagamento À Prazo";
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor Da Compra"));
			juros = Double.parseDouble(JOptionPane.showInputDialog("Digite O Valor do Juros a Ser Cobrado"));
			parc1 = valor / 2;
			parc2 = parc1 * ( 1 + juros / 100); 
		}
		
			JOptionPane.showMessageDialog(null, "Forma de Pagamento " + forma +
												"\nPrimeira Parcela " + parc1 +
												"\nSegunda Parcela " + parc2 );
		
}}
