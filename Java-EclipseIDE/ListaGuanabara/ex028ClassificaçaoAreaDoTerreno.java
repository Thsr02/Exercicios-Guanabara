package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex028Classifica�aoAreaDoTerreno {

	public static void main(String[] args) {
	

//28) Fa�a um programa que leia a largura e o comprimento de um terreno
//retangular, calculando e mostrando a sua �rea em m�. O programa tamb�m
//devemostrar a classifica��o desse terreno, de acordo com a lista abaixo:
//   - Abaixo de 100m� = TERRENO POPULAR
//   - Entre 100m� e 500m� = TERRENO MASTER
//   - Acima de 500m� = TERRENO VIP

		
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Entre Com a Altura do terreno"));
				double largura = Double.parseDouble(JOptionPane.showInputDialog("Entre Com a largura do terreno"));
				double area = largura * altura;
				String classificacao = "";
					if(area < 100) {
						classificacao = "Popular";
					}else if(area <= 500) {
						classificacao = "Master";
					}else {
						classificacao = "VIP";
					}
					
						JOptionPane.showMessageDialog(null,"Medida " + area + "m�" + " Terreno de classifica��o " + classificacao);
		
		
}}
