import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a ordem da matriz: ");
		int N = teclado.nextInt();

		int M[][] = new int[N][N];
		System.out.println("Insira os valores na matriz:");

		for (int i = 0; i < M.length; i++){
			for (int j = 0; j < M[i].length; j++) {
				System.out.printf("M[%d][%d] = ", i, j);
				M[i][j] = teclado.nextInt();
			}
		}

		System.out.println("Soma dos elementos da primeira coluna: " + somaPrimeiraColuna(M));
		System.out.println("Produto dos elementos da primeira linha: " + produtoPrimeiraLinha(M));
		System.out.println("Soma de todos os elementos: " + somaMatriz(M));
		System.out.println("Produto da diagonal principal: " + produtoDiagonalPrincipal(M));
	
		
	}

	public static int somaPrimeiraColuna(int arr[][]){
		int soma = 0;
		for (int i = 0; i< arr.length; i++) {
			soma += arr[i][0];
		}
		return soma;
	}

	public static int produtoPrimeiraLinha(int arr[][]) {
		if (arr.length == 0) return 0;

		int produto = 1;
		for (int j = 0; j < arr.length; j++){
			produto *= arr[0][j];
		}

		return produto;
	}

	public static int somaMatriz(int [][] M) {
		int soma = 0;

		for (int i = 0; i < M.length; i++){
			for (int j = 0; j < M[i].length; j++) {
				soma += M[i][j];
			}
		}
		return soma;
	}

	public static int produtoDiagonalPrincipal(int [][] M) {
		if (M.length == 0) return 0;
		int produto = 1;

		for (int i = 0; i < M.length; i++){
			for (int j = 0; j < M[i].length; j++) {
				if (i==j) produto *= M[i][j];
			}
		}
		return produto;
	}
}