import java.util.Scanner;
import java.util.Arrays;
// Eleicoes
public class Ex12 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o número de Candidatos: ");
		int candidatos = teclado.nextInt();
		System.out.print("Insira o número de votantes: ");
		int votantes = teclado.nextInt();

		int [] votosCandidato = new int[candidatos];
		int numeroCandidato;

		for (int i = 1; i <= votantes; i++) {
			do {
				System.out.println("Votante " + (i) + ", insira o número do seu candidato: ");
				numeroCandidato = teclado.nextInt();
				if (numeroCandidato < 1 || numeroCandidato > candidatos) {
					System.out.println("Numero inválido. Tente novamente.");
				}
			} while (numeroCandidato < 1 || numeroCandidato > candidatos);
			votosCandidato[numeroCandidato-1]++;
		}

		for (int i = 0; i < votosCandidato.length; i++){
			System.out.println("Votos do canditato " + (i+1) + ": " + votosCandidato[i]);
		}

	}
}
