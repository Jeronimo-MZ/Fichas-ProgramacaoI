import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		ArrayList<String> disciplinas = new ArrayList<String>();

		disciplinas.add("Programação I");
		disciplinas.add("Técnicas de Comunicação");
		disciplinas.add("Física II");
		disciplinas.add("Electrónica Digital");
		disciplinas.add("Teoria de Circuitos");

		for (int i = 0; i < disciplinas.size(); i++) {
			System.out.printf("%d - %s\n", (i+1), disciplinas.get(i));
		}

		int opcao;
		do {
			System.out.print("Insira o número correspondente ao nome que deseja excluir: ");
			opcao = teclado.nextInt();
			if (opcao < 1 || opcao> disciplinas.size()){
				System.out.println("Opção inválida. Tente novamente.");
			}
		}while (opcao < 1 || opcao > disciplinas.size());
		disciplinas.remove(opcao - 1);

		System.out.println("\nLista modificada");
		for (int i = 0; i < disciplinas.size(); i++) {
			System.out.printf("%d - %s\n", (i+1), disciplinas.get(i));
		}

	}
}