import java.util.Scanner;
import java.util.ArrayList;

public class Ex06 {
	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Windows Server");
		nomes.add("Unix");
		nomes.add("Linux");
		nomes.add("Netware");
		nomes.add("Mac OS");
		nomes.add("Outro");

		System.out.println("Qual o melhor sistema operacional para uso em servidores?");
		for (int i = 0; i<nomes.size(); i++){
			System.out.printf("%d - %s\n", (i+1), nomes.get(i));
		}

		int[] votos = new int[nomes.size()];

		int totalVotos = 0;
		int opcao;
		do{
			System.out.print("Insira a sua opção [0 para parar]: ");
			opcao = teclado.nextInt();
			if (opcao >= 1 && opcao <= votos.length) {
				votos[opcao-1]++;
				totalVotos++;
			}else if ( opcao != 0) {
				System.out.println("Opção Inválida. tente novamente numeros entre 1 e " + votos.length);
			}
		}while (opcao != 0);

		System.out.println("Sistema operacional     Votos        % ");
		System.out.println("-------------------   ---------  --------");
		////////////////////////
		int melhor = 0; // indice do melhor sistema
		for (int i = 0; i < votos.length; i++){
			System.out.printf("%19s   %9d  %.2f\n", nomes.get(i), votos[i], (((float) votos[i])/totalVotos* 100));
			if (votos[i] > votos[melhor]) melhor = i;

		}
		System.out.println("-----------------------------------------");
		System.out.printf("O sistema operacional mais votado foi %s, com %d votos, correspondendo a %.2f %% dos votos.\n", 
			nomes.get(melhor), votos[melhor], (((float) votos[melhor])/totalVotos* 100));


	}
}