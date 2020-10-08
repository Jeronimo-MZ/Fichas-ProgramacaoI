import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o primeiro valor: ");
		int x = teclado.nextInt();
		System.out.println("Insira o segundo valor: ");
		int y = teclado.nextInt();

		System.out.println("O maior número inserido é: " + maior(x,y));
	}

	public static int maior(int a, int b) {
		/*
		if (a > b) return a;
		else return b;
		*/
		return (a > b) ? a : b;
	}
}