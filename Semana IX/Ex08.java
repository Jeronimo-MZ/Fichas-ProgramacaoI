import java.util.Scanner;
import java.util.Arrays;
// SomaVectores
public class Ex08 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int arr[], arr2[],soma[];

		System.out.println("Insira o número de elementos dos arrays: ");
		int n = teclado.nextInt();
		arr =  new int[n];
		arr2 =  new int[n];
		soma =  new int[n];
		System.out.println("Insira os valores no primeiro Array:");

		for (int i = 0; i < arr.length; i++){
			System.out.print("arr[" + i + "] = ");
			arr[i] = teclado.nextInt();
		}
		System.out.println();
		System.out.println("Insira os valores no segundo Array:");

		for (int i = 0; i < arr2.length; i++){
			System.out.print("arr2[" + i + "] = ");
			arr2[i] = teclado.nextInt();
		}
		for (int i = 0; i < arr.length; i++){
			soma[i] = arr[i] + arr2[i];
		}
		System.out.println();
		System.out.println("arr = "  + Arrays.toString(arr));
		System.out.println("arr2 = " + Arrays.toString(arr2));
		System.out.println("Soma = " + Arrays.toString(soma));
	}
}