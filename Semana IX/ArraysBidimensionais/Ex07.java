import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		int [][] A = {{-7,8}, {4,9}, {2,1}};
		int [][] At = new int[2][3];

		for (int i = 0; i< A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				At[j][i] = A[i][j];
			}
		}

		System.out.println("A = " + Arrays.deepToString(A));
		System.out.println("At = " + Arrays.deepToString(At));
	}
}