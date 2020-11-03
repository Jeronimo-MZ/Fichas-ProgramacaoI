import java.util.Scanner;

public class Ex12 {

	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a ordem do triangulo: ");
		int n = teclado.nextInt();
		int[][] triangulo = new int[n][n];
		int maiorValor = 0;

		for (int i = 0; i < triangulo.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					triangulo[i][j] = 1;
				}
				else {
					triangulo[i][j] = triangulo[i-1][j] + triangulo[i-1][j-1];
					if (triangulo[i][j] > maiorValor) maiorValor = triangulo[i][j];
				}
			}
		}

		int tamanho = String.valueOf(maiorValor).length(); // numero de digitos do maior valor, para ser usado no printf
		for (int i = 0; i < triangulo.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("%"+ (tamanho+1) + "d", triangulo[i][j]);
			}
			System.out.println();
		}

	}
}