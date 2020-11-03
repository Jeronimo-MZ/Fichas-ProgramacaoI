import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		int [][]A = {{2, -3}, {-1, 4}};

		int [][] oposta = new int[A.length][A[0].length];

		for (int i = 0; i < oposta.length; i++) {
			for (int j = 0; j < oposta[i].length; j++) {
				oposta[i][j] = -A[i][j];
			}
		}

		System.out.println("A = " + Arrays.deepToString(A));
		System.out.println("Oposta de A = " + Arrays.deepToString(oposta));

	}
}