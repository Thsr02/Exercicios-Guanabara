package Testes;

import javax.swing.JOptionPane;

public class you012extraSeletorPessoas {
	
	public static void main(String[] args) {
	
		int menu = 0, contadorM = 0, contadorF = 0;
		
 do {		
			
			String sexo = JOptionPane.showInputDialog("Digite o Sexo [M/F]");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
			int corCabelo = Integer.parseInt(JOptionPane.showInputDialog("Cor Do Cabelo" +
																		"\n[1] - Preto" +
																		"\n[2] - Castanho" +
																		"\n[3] - Loiro" +
																		"\n[4] - Ruivo"));
			
	//	switch(sexo) {
	//	case "M":
			if(sexo.equalsIgnoreCase("M") && idade > 18 && corCabelo == 2)
				contadorM++;
			
	//	break;
	//	case "F":
			if(sexo.equalsIgnoreCase("F") && idade >= 25 && idade <= 30 && corCabelo == 4)
			contadorF++;
			
	//	}	
			
			System.out.println(contadorF + " |mulheres| " + " |homens| " + contadorM);
			
			menu = JOptionPane.showConfirmDialog(null, "Deseja Continuar","ENCERRAR", JOptionPane.YES_NO_OPTION);
			
			
 }while(menu != 1);		
 			
 				JOptionPane.showMessageDialog(null, "Total de Homens Maiores que 18 e Cabelos Castanho: " + contadorM +
 													"\nTotal de Mulheres Entre 25 e 30 Anos Com Cabelo Loiro " + contadorF);

}}
