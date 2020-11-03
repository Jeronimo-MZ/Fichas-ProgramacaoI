import java.util.Scanner;
import java.util.Arrays;
//  OcorrenciasNoArray
public class Ex05 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o número de elementos do array: ");
		int tamanho = teclado.nextInt();
		int [] arr = new int[tamanho];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = " );
			arr[i] = teclado.nextInt();
		}
		System.out.println("Insira o valor que deseja contar: ");
		int valor = teclado.nextInt();
		int ocorrencias = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valor) ocorrencias++;
		}

		System.out.print("o valor " + valor + " aparece " + ocorrencias + " vez(es) no array ");
		System.out.println(Arrays.toString(arr));
	}
}