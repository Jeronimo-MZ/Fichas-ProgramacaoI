import java.util.Scanner;

public class CalculoSoma {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira o primeiro número: ");
		int n1 = teclado.nextInt();
		System.out.println("Insira o segundo número: ");
		int n2 = teclado.nextInt();
		System.out.println("Soma = " + somar(n1,n2));

	}

	private static int somar(int a, int b) {
		return a+b;
	}
}