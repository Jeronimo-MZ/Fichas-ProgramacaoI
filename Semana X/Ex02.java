/*
	Nomes de Usuario
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Ex02 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		ArrayList<String> nomeUsuarios = new ArrayList<String>();

		for (int i = 1; i <= 5; i++){
			System.out.printf("Insira o nome do %d⁰ usuário: ", i);
			nomeUsuarios.add(teclado.nextLine());
		}

		for (int i = nomeUsuarios.size() - 1; i >= 0; i--){
			System.out.printf("Usuário %d: %s\n", (i+1), nomeUsuarios.get(i));
		}
	}
}