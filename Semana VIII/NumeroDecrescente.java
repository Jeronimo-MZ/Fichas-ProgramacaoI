import java.util.Scanner;

public class NumeroDecrescente {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o numero limite:");
		int n = teclado.nextInt();
		
		System.out.println("\nInicio da Contagem---\n");
		imprimirEmOrdemDecrescente(n);
		System.out.println("\nFim da contagem------");

	}

	public static void imprimirEmOrdemDecrescente(int n) {
		for (int i = n; i>= 0; i--){
			System.out.println(i);
		}
	}
}