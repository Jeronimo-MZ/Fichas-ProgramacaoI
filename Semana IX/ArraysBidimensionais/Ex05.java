import java.util.Arrays;
public class Ex05 {
	public static void main(String[] args) {
		int[][] A = {{-10, 1, 4, 6}, {2, 3, 2, 8}};
		int[][] B = {{1, 8, 4, -1}, {0, 6, 3, -3}};
		int[][] soma = new int[2][4];
		for (int i = 0; i< A.length; i++) {
			for (int j = 0; j < A[i].length; j++){
				soma[i][j] = A[i][j] + B[i][j];
			}
		}

		System.out.println("A = " + Arrays.deepToString(A));
		System.out.println("B = " + Arrays.deepToString(B));
		System.out.println("A + B = " + Arrays.deepToString(soma));
	}
}