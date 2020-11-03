import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		String[] nomes = {"Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro"};
		System.out.println("Qual o melhor sistema operacional para uso em servidores?");
		for (int i = 0; i<nomes.length; i++){
			System.out.printf("%d - %s\n", (i+1), nomes[i]);
		}

		int[] votos = new int[nomes.length];

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
			System.out.printf("%19s   %9d  %.2f\n", nomes[i], votos[i], (((float) votos[i])/totalVotos* 100));
			if (votos[i] > votos[melhor]) melhor = i;

		}
		System.out.println("-----------------------------------------");
		System.out.printf("O sistema operacional mais votado foi %s, com %d votos, correspondendo a %.2f %% dos votos.\n", 
			nomes[melhor], votos[melhor], (((float) votos[melhor])/totalVotos* 100));


	}
}