import java.util.Scanner;
import java.util.ArrayList;

public class Ex05 {
	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		ArrayList<String> questoes =  new ArrayList<String>();
		questoes.add("Telefonou para a vítima? [S/N]: ");
		questoes.add("Esteve no local do crime? [S/N]: ");
		questoes.add("Mora perto da Vítima? [S/N]: ");
		questoes.add("Devia para a vítima? [S/N]: ");
		questoes.add("Já trabalhou com a vítima? [S/N]: ");

		int respostasPositivas = 0;
		char res;

		for (int i = 0; i < questoes.size(); i++){
			do {
				System.out.print(questoes.get(i));
				res = teclado.nextLine().toUpperCase().charAt(0);
				if (res == 'S') respostasPositivas++;
				if (res != 'S' && res != 'N') {
					System.out.println("Opção inválida! Tente novamente.");
				}
			}while (res != 'S' && res != 'N');
		}

		if (respostasPositivas == 2) {
			System.out.println("Suspeito");
		} else if (respostasPositivas == 3 || respostasPositivas == 4) {
			System.out.println("Cumplice");
		} else if (respostasPositivas == 5) {
			System.out.println("Assasino");
		}else {
			System.out.println("Inocente");

		}
	}
}