package ListaGuanabara;

import javax.swing.JOptionPane;

public class ex028ClassificaçaoAreaDoTerreno {

	public static void main(String[] args) {
	

//28) Faça um programa que leia a largura e o comprimento de um terreno
//retangular, calculando e mostrando a sua área em m². O programa também
//devemostrar a classificação desse terreno, de acordo com a lista abaixo:
//   - Abaixo de 100m² = TERRENO POPULAR
//   - Entre 100m² e 500m² = TERRENO MASTER
//   - Acima de 500m² = TERRENO VIP

		
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
					
						JOptionPane.showMessageDialog(null,"Medida " + area + "m²" + " Terreno de classificação " + classificacao);
		
		
}}
