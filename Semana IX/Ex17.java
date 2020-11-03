import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int votos[] = new int[23]; // para 23 jogadores

		int totalDeVotos = 0, voto;
		int melhorJogador = 0; // indice do melhor jogador;

		do {
			System.out.print("Numero do jogador (0=fim): ");
			voto = teclado.nextInt();
			if (voto >= 0 && voto <= 23){
				if (voto != 0) {
					votos[voto-1]++;
					totalDeVotos++;
				}
			} else {
				System.out.println("Informe um valor entre 1 e 23 ou 0 para sair!");
			}

		} while (voto != 0);

		for (int i = 0; i < votos.length; i++) {
			if (votos[i] > votos[melhorJogador]) melhorJogador = i;
		}

		double percentual;
		System.out.printf("Foram computados %d votos.\n", totalDeVotos);
		System.out.println("Jogador  votos  %");
		for (int i = 0; i < votos.length; i++) {
			if (votos[i] > 0) {
				percentual =  calcularPercentual(votos[i], totalDeVotos);
				System.out.printf("%7d  %5d  %.2f\n", (i+1), votos[i], percentual);
			}	
		}
		percentual = calcularPercentual(votos[melhorJogador], totalDeVotos);
		System.out.printf("O melhor jogador for o número %d, com %d votos, correspondendo a %.2f%% do total de votos\n",
			(melhorJogador + 1), votos[melhorJogador], percentual);
	}

	private static double calcularPercentual(int votos, int totalDeVotos) {
		return votos * 100.0/totalDeVotos;
	}
}