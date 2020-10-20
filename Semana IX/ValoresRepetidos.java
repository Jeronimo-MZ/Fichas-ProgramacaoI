import java.util.Scanner;
import java.util.Arrays;

public class ValoresRepetidos {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o tamanho dos arrays: ");
		int N = teclado.nextInt();
		int cont = 0;
		int [] arr  =  new int[N];
		int [] arr2 =  new int[N];
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

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr2[i]) cont++;
		}

		System.out.println("O primeiro e o segundo array têm os mesmos números nas mesmas posições " 
			+ cont + " vezes.");

	}
}
