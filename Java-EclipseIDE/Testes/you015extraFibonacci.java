package Testes;

public class you015extraFibonacci {
	
	public static void main(String[] args) {
		
		int fibonacci = 0, n1 = 0, n2 = 1;
			System.out.print(n1 + " | " + n2 + " | ");
		for(int cont = 1 ; cont <= 13; cont++) {
			fibonacci = n1 + n2;
			System.out.print(fibonacci + " | ");
			n1 = n2;
			n2 = fibonacci;
			
		}
		
			
		
		
	
}}
