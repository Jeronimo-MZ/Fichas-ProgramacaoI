import java.util.Scanner;
import java.util.Arrays;
//ArrayVinteElementos
public class Ex06 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int A[] = new int[20];
		int soma = 0, maior, menor;
		float media;

		for (int i = 0; i < A.length; i++) {
			System.out.print("A[" + i + "] = ");
			A[i] = teclado.nextInt();
		}

		maior = A[0];
		menor = A[0];
		for (int i = 0; i < A.length; i++) {
			if (A[i] > maior) maior = A[i];
			if (A[i] < menor) menor = A[i];
			soma += A[i];
		}

		media = soma / A.length;

		System.out.println(Arrays.toString(A));
		System.out.println("Soma = " + soma);
		System.out.println("Média = " + media);
		System.out.println("Maior Valor = " + maior);
		System.out.println("Menor Valor = " + menor);
	}
}