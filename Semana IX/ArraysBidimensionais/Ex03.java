import java.util.Scanner;
import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int M[][] = new int[2][4];
		System.out.println("Insira os valores na matriz: ");
		for (int i = 0; i < M.length; i++){
			for (int j = 0; j < M[i].length; j++) {
				System.out.printf("M[%d][%d] = ", i, j);
				M[i][j] = teclado.nextInt();
			}
		}

		System.out.println("\nMatriz=====");

		for (int i = 0; i < M.length; i++){
			System.out.println(Arrays.toString(M[i]));
		}
	}
}