import java.util.Scanner;
import java.util.Arrays;

public class Troca {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int [] arr = new int[20];
		
		for (int i = 0; i< arr.length; i++){
			System.out.print("arr[" + i + "] = ");
			arr[i] = teclado.nextInt();
		}

		System.out.println("Array inserido: " + Arrays.toString(arr));
		int temp;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		System.out.println("Array com valores Trocados: " + Arrays.toString(arr));
	}
}