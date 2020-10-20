import java.util.Scanner;

public class MediaAlturas {
	public static void main(String args[]){
		Scanner teclado =  new Scanner(System.in);

		System.out.print("Insira o número de pessoas: ");
		int n = teclado.nextInt();
		float alturas[] =  new float[n];
		int maisAltas = 0, maisBaixas = 0;
		float altura;

		for (int i = 0; i < alturas.length; i++) { 
			System.out.print("Insira a altura da "+ (i+1) + "a pessoa: ");
			alturas[i] = teclado.nextFloat();
		}

		float media = calcularMedia(alturas);

		for (int i = 0; i < alturas.length; i++){
			if (alturas[i] > media) {
				maisAltas++;
			} else if (alturas[i] < media){
				maisBaixas++;
			}
		}
		System.out.println("A média das altura é: " + media);
		System.out.println("Existem " + maisAltas + " pessoas mais altas que a média e " + 
			maisBaixas + " pessoas mais baixas que a média. ");
	}

	public static float calcularMedia(float[] arr) {
		float soma = 0;
		for (int i = 0; i < arr.length; i++) {
			soma += arr[i];
		}

		return soma / arr.length; // media
	}
}