import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		
		System.out.println("Insira o número de estudantes: ");
		int numEstudantes = Integer.parseInt(teclado.nextLine());
		System.out.println("Insira o número de Avaliações: ");
		int numAvaliacoes = Integer.parseInt(teclado.nextLine());
		
		String [][] Estudantes = new String[numEstudantes][numAvaliacoes+1]; // +1 porque a primeira coluna terá os nomes	
		double []medias = new double[numEstudantes];
		

		for (int i = 0; i< Estudantes.length; i++) {
			System.out.print("Insira o nome do " + (i+1) + "⁰ estudante: ");
			Estudantes[i][0] = teclado.nextLine();
			for (int j = 1; j< Estudantes[i].length; j++) {
				System.out.printf("Insira a nota de %s na %d⁰ Avaliacão: ", Estudantes[i][0], j);
				// isto é para evitar que sejam inseridos valores inválidos;
				// nextLine para ler a String
				// Double.parseDouble para tranformar a string em double, caso a string nao seja um número terá um erro
				// String.valueOf para tranformar o valor em double de volta para String
				Estudantes[i][j] = String.valueOf(Double.parseDouble(teclado.nextLine()));

			}
		}

		for (int i = 0; i< Estudantes.length; i++) {
			medias[i] = calcularMedia(Estudantes[i]);
		}
 		
 		for (int i = 0; i< Estudantes.length; i++) {
 			System.out.printf("O estudante %s teve média %.2f\n", Estudantes[i][0], medias[i]);
 		}

	}

	private static double calcularMedia(String[] arr) {
		// o indice 0 contem o nome do estudante
		double soma = 0;
		for (int i = 1; i < arr.length; i++) {
			soma += Double.parseDouble(arr[i]);
		}
		return soma / (arr.length - 1); // -1 devido a primeira posicao
	} 

}