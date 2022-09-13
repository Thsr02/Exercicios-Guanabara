package tarefa_for;

public class ex005crescenteDecresente {
	public static void main(String[] args) {
				
	int crescente = 1, decrescente = 1024;
		for(int cont = 0; cont < 11; cont++) {
			System.out.print(crescente + " - "); 
			crescente = crescente + crescente;	

			
		System.out.println(decrescente);
		decrescente = decrescente /2;
		}
			
}}
