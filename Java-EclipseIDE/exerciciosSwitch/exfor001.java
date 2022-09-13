package exerciciosSwitch;

public class exfor001 {
			
	public static void main(String [] args) {
		
		for(int i =0; i <= 10; i++) {
			System.out.print(i + "|");
			
		}
		
		System.out.println();
		System.out.println("==========================================================");
		
		for(int i = 10; i <= 100; i+=5) {
			System.out.print(i + "|");
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		
		for(int i=10; i >=0; i--) {
			System.out.print(i + "|");
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		
		int numero =0;
		int totalPar = 0, totalImpar =0, contadorPar = 0, contadorImpar = 0, somaTotal =0;
		
		for(int i=1; i <= 5; i++) {
			
					numero = (int) (Math.random() *11);
				System.out.print(numero);
				somaTotal = somaTotal += numero;
			if(numero % 2 ==0) {
				System.out.print(" PAR | ");
				totalPar += numero;
				contadorPar++;
			}else {
				System.out.print(" IMPAR | ");
				totalImpar += numero;
				contadorImpar++;
			}	
			
		}
			System.out.println();
			System.out.println("TOTAL DE NUMEROS PARES É: " + contadorPar);
			System.out.println("TOTAL DE NUMEROS IMPARES É: " + contadorImpar);
			System.out.println("SOMA DOS NUMEROS PARES: " + totalPar);
			System.out.println("SOMA DOS NUMEROS IMPARES: " + totalImpar);
			System.out.println("SOMA DE TODOS OS NUMEROS: " + somaTotal);
}}
