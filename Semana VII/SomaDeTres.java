import java.util.Scanner;

public class SomaDeTres {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o primeiro número: ");
		int n1 = teclado.nextInt();
		System.out.println("Insira o segundo número: ");
		int n2 = teclado.nextInt();
		System.out.println("Insira o terceiro número: ");
		int n3 = teclado.nextInt();
		System.out.println("Soma = " + somar(n1, n2, n3));

		teclado.close();
	}

	public static int somar(int a, int b, int c) {
		return a + b + c;
	}
}