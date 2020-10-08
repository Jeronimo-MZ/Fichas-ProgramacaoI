import java.util.Scanner;

public class Quadrado {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o tamanho do lado do quadrado: ");
		int n = teclado.nextInt();
		imprimirQuadrado(n);
	}

	public static void imprimirQuadrado(int n){
		for (int i = 1; i<= n; i++){
			for (int j = 1; j <= n; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}