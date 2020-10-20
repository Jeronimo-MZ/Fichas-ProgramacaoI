import java.util.Scanner;

public class ArrayDezInteiros {
	public static void main(String args[]) {
		Scanner teclado =  new Scanner(System.in);

		int arr[] = new int[10];
		int positivos = 0, negativos = 0, nulos = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Insira o "+ (i+1) + "⁰ valor: ");
			arr[i] = teclado.nextInt();
		}

		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] == 0) nulos++;
			else if (arr[i] < 0) negativos++;
			else positivos++;
		}

		System.out.println("Foram introduzidos: " + positivos + " valores positivos, " + 
			negativos + " valores negativos e " + nulos + " zeros." );


	}
}