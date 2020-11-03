import java.util.Scanner;
import java.util.Arrays;
// Conjuntos V2
public class Ex10 {
	public static void main(String args[]) {
		int A[] = {2, 4, 7, 13, 14, 15, 16};
		int B[] = {1, 6, 11, 13, 16, 18};
		int [] uniao = uniao(A,B);
		int [] diferenca = diferenca(A,B);
		int [] interseccao = interseccao(A,B);

		System.out.println("A = " + Arrays.toString(A));
		System.out.println("B = " + Arrays.toString(B));
		System.out.println("A ⋃ B:" + Arrays.toString(uniao));
		System.out.println("A ⋂ B:" + Arrays.toString(interseccao));
		System.out.println("A - B:" + Arrays.toString(diferenca));
	}

	private static int indexOf(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) return i;
		}
		return -1;
	}

	private static int[] interseccao (int A[], int B[]) {
		int res[];
		int tamanho= 0;
		for (int i = 0; i < A.length; i++) if (indexOf(B, A[i]) != -1) tamanho++;
		res = new int[tamanho];
		int j = 0;

		for (int i = 0; i < A.length; i++) 
			if (indexOf(B, A[i]) != -1)
				res[j++] = A[i];
		for (int i = A.length; i < res.length; i++) 
			if (indexOf(A, B[i]) != -1) 
				res[j++] = B[i - A.length];
		return res;
	}

	private static int[] uniao(int[] arr, int[] arr2) {
		int repetidos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (indexOf(arr2,  arr[i]) != -1) repetidos++;
		}
		int i = 0;
		int res[] =  new int[arr.length + arr2.length - repetidos];
		for (; i < arr.length; i++) {
			res[i] = arr[i];
		}

		for (int j = 0; j < arr2.length; j++) {
			if (indexOf(res, arr2[j]) == -1) {
				res[i] = arr2[j];
				i++;
			}
		}
		return insertionSort(res);
	}

	private static int[] diferenca(int[] A, int[] B) {
		int cont = 0;
		for (int i = 0; i < A.length; i++) {
			if (indexOf(B, A[i]) == -1) {
				cont++;
			}
		}
		int res[] = new int[cont];
		int j = 0;
		for (int i = 0; i < A.length; i++) {
			if (indexOf(B, A[i]) == -1) {
				res[j] = A[i];
				j++;
			}
		}
		return res;
	}
	// algoritmo de ordenacao
	private static int[] insertionSort(int[] vector) {
		int carta, i, j;
		for (i = 1; i < vector.length; i++){
			carta = vector[i];
			for (j = i-1; (j>=0) && (vector[j] > carta); j--){
				vector[j+1] = vector[j];
			}
			vector[j+1] = carta;
		}
		return vector;
	}
}