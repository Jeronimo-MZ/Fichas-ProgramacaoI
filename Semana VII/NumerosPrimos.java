import java.util.Scanner;

public class NumerosPrimos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um número para saber se é primo: ");
		int num = teclado.nextInt();

		if (isPrime(num)){
			System.out.println(num + " é um número primo!");
		} else {
			System.out.println(num + " não é um número primo!");
		}

		teclado.close();
	}

	private static boolean isPrime(int number) {
		if (number != 2 && number % 2 == 0) return false; // se for par e diferente de 2
		
		int divisores = 0;
		for (int i = 1; i <= number; i++){
			if (number %i==0) divisores++;
			if (divisores > 2) return false;
		}
		return divisores == 2;
	}
}