import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> valores =  new ArrayList<Integer>();
		int valor, numeroDeValores = 0, soma = 0;
		int acimaDaMedia = 0, abaixoDeSete = 0;
		float media;

		do {
			System.out.println("Insira um valor [(-1) para parar]: ");
			valor = teclado.nextInt();
			if (valor != -1) {
				valores.add(valor);
				numeroDeValores++;
			}
		} while(valor != -1);

		// soma
		for (int i = 0; i < valores.size(); i++){
			soma += valores.get(i);
		}
		// media
		media = (float) soma / valores.size();

		// contagens
		for (int i = 0; i < valores.size(); i++) {
			valor = valores.get(i);
			if (valor > media) acimaDaMedia++;
			if (valor < 7) abaixoDeSete++;
		} 
		// SAIDA
		System.out.println("\nValores em ordem: ");
		imprimirEmOrdem(valores);
		System.out.println("\nValores em ordem inversa: ");
		imprimirReverso(valores);
		System.out.println("");
		System.out.println("Quantidade de valores lidos: " + numeroDeValores);
		System.out.println("Soma dos valores: " + soma);
		System.out.println("Media dos valores: " + media);
		System.out.println("Quantidade de valores maiores que a média: " + acimaDaMedia);
		System.out.println("Quantidade de valores abaixo de sete: " + abaixoDeSete);
		System.out.println("Fim do programa.");

	}

	public static void imprimirEmOrdem(ArrayList<Integer> T) {
		System.out.print(T.get(0));
		for (int i = 1; i < T.size(); i++){
			System.out.print(" " + T.get(i));
		}
	}

	public static void imprimirReverso(ArrayList<Integer> T) {
		for (int i = T.size() - 1; i >=0 ; i--){
			System.out.println(T.get(i));
		}
	}
}