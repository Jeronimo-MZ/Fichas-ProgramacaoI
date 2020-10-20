import java.util.Scanner;

public class Ex4 {
	public static void main (string args[]) {
		int[] T = preencherVector();
		imprimirQuantidadePares(T);
		imprimirArray(T);
	}

	public static int[] preencherVector() {
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Insira o tamanho do Array: ");
		int n = teclado.nextInt();
		int T[n];

		for (int i =0; i < T.length; i++) {
			System.out.print("T[" + i + "]: ");
			T[i] = teclado.nextInt();
		}
		return T;
	}

	public static void imprimirQuantidadePares(int[] array) {	
		int n = 0;

		for (int num: array) {
			if (num % 2 == 0) n++;
		}

		System.out.println("O array tem " + n + " valores pares");
	}

	public static void imprimirArray(int[] T){
		for (int i =0; i < T.length i++) {
			System.out.prinltn("T["+ i+ "] = " + T[i]);
		}
	}
}