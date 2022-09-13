package tarefa_for;

import javax.swing.JOptionPane;

public class ex004numerosAleatorios {
	
	public static void main(String[] args) {
		
		int maior = 0, menor = 0;
		String mostrarmaior = "", mostrarmenor = "";
		for(int cont = 0; cont < 20; cont++) {
			
			int randowNumber = (int) (Math.random() * 101);
			//System.out.print(randowNumber + " | ");
			
			if(randowNumber > 50 ) {
				maior = maior +1;
				mostrarmaior += randowNumber + " | " ;
			}else {
				menor = menor +1;
				mostrarmenor += randowNumber + " | " ;
				
			}
			
		}
		JOptionPane.showMessageDialog(null, "São Maiores que 50 o total de: " + maior + "\n Os Numeros são: \n" + mostrarmaior + 
											"\nSão Menores que 50 o total de : " + menor + "\n Os Numeros são \n" + mostrarmenor);
}}
