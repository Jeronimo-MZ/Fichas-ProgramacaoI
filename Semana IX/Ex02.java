import java.util.Scanner;

public class Ex02 {
	public static void main(String args[]) {
		Scanner teclado =  new Scanner(System.in);

		int arr[] = new int[10];
		int positivos = 0, negativos = 0;
		int somaPositivos = 0, somaNegativos = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Insira o "+ (i+1) + "⁰ valor: ");
			arr[i] = teclado.nextInt();
		}

		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] > 0) {
				somaPositivos += arr[i];
				positivos++;
			} else { 
				somaNegativos += arr[i];
				negativos++;
			}
		}
		float mediaPositivos = (float) somaPositivos/positivos;
		float mediaNegativos = (float) somaNegativos/negativos;

		System.out.println("Media dos valores positivos inseridos: " + mediaPositivos);
		System.out.println("Media dos valores negativos inseridos: " + mediaNegativos);


	}
}