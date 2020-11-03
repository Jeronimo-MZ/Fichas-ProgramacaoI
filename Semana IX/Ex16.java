import java.util.Arrays;
// escola de samba
public class Ex16 {
	public static void main(String[] args) {
		double[] notas = {9.9, 9.7, 9,8, 10, 10};
		double media;
		double maior = notas[0], menor = notas[0];

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > maior) maior = notas[i];
			if (notas[i] < menor) menor = notas[i];
		} 

		media = (somarArray(notas) - maior - menor) / (notas.length - 2);
		System.out.print("Para as notas " + Arrays.toString(notas) + ", eliminando a maior e a menor nota, ");
		System.out.println("a média é: " + media);

	}

	public static double somarArray(double[] arr) {
		double soma = 0;
		for (double valor: arr) {
			soma += valor;
		}
		return soma;
	}
}