import java.util.Scanner;
import java.util.Arrays;
//CopiaArray
public class Ex07 {
	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);

		System.out.println("Insira o número de elementos do array: ");
		int n = teclado.nextInt();
		int arr[] = new int[n];
		int copiaArr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = teclado.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			copiaArr[i] = arr[i];
		}

		System.out.println("Array Original: " + Arrays.toString(arr));
		System.out.println("cópia: " + Arrays.toString(copiaArr));
	}
}