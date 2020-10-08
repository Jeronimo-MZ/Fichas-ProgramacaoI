import java.util.Scanner;
public class Numeros {

	public static void main(String args[]) {
		final Scanner teclado = new Scanner(System.in);
		int N;
		System.out.print("Insira um número: ");
		N = teclado.nextInt();
		if (N % 2 == 0 && N>0) {
			System.out.println(N+" é um número par positivo");
		}else {
			System.out.println(N + " não é um número par positivo!");
		}
	}
}
