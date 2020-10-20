import java.util.Scanner;
import java.util.Arrays;

public class Conjuntos {
	public static void main(String args[]) {
		int A[] = {2, 4, 7, 13, 14, 15, 16};
		int B[] = {1, 6, 11, 13, 16, 18};
		String uniao = "", interseccao = "", diferenca = "";
		String elemento;

		for (int i =0; i < A.length; i++) { // i++ -> i = i+1
			elemento = String.valueOf(A[i]); // transformo os numeros em string
			if (indexOf(B, A[i]) == -1) {
				diferenca += ((diferenca == "") ? "" : ", ") + elemento;
			} else {
			 	interseccao += ((interseccao == "") ? "" : ", ") + elemento;
			}
			uniao += ((uniao == "") ? "" : ", ") + elemento;
		}

		for (int i =0; i < B.length; i++) {
			elemento = String.valueOf(B[i]);
			if (indexOf(A, B[i]) == -1) {
				diferenca += ((diferenca == "") ? "" : ", ") + elemento;
			}
			else {
				interseccao += ((interseccao == "") ? "" : ", ") + elemento;;
			}
			uniao += ((uniao == "") ? "" : ", ") + elemento;
		}

		System.out.println("A = " + Arrays.toString(A));
		System.out.println("B = " + Arrays.toString(B));
		System.out.println("A ⋃ B: {" + uniao + "}");
		System.out.println("A ⋂ B: {" + interseccao + "}");
		System.out.println("A - B: {"+ diferenca+ "}");
	}

	public static int indexOf(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) return i;
		}
		return -1;
	}
}