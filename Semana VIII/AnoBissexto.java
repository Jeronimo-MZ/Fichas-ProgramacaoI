import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o ano desejado: ");
		int ano = teclado.nextInt();

		if (eBissexto(ano)) {
			System.out.println(ano + " é um ano bissexto!");
		}else{
			System.out.println(ano + " não é um ano bissexto!");
		}
	}

	public static boolean eBissexto(int ano) {
		return (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0));
	}
}