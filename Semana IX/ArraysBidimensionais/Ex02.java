import java.util.Scanner;

public class Ex02 {

	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o número de linhas da matriz: ");
		int m = teclado.nextInt();
		System.out.print("Insira o número de colunas da matriz: ");
		int n = teclado.nextInt();

		double M[][] = new double[m][n];

		for (int i = 0; i < M.length; i++){
			for (int j = 0; j < M[i].length; j++) {
				System.out.printf("M[%d][%d] = ", i, j);
				M[i][j] = teclado.nextDouble();
			}
		}

		System.out.println("A media dos valores da Matriz é: " + calcularMedia(M));
	}


	public static double calcularMedia(double[][] arr) {
		if (arr.length == 0) return 0;
		double soma = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				soma += arr[i][j];
			}
		}

		return soma / (arr.length * arr[0].length);
	}
}