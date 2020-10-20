/*
Faça um programa que preenche em uma matriz (de cadeia de caracteres) o
nome de estudantes e a média de cada estudante.
*/

import java.util.Scanner;
import java.util.Arrays;

public class Ex01 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o número de estudantes");
		int n = Integer.parseInt(teclado.nextLine());
		String T[][] = new String[n][2];

		for (int i = 0; i< T.length ; i++) {
			System.out.println("Estudante " + (i+1));
			System.out.print("Nome: ");
			T[i][0] = teclado.nextLine();
			System.out.print("Nota: ");
			T[i][1] = teclado.nextLine();
		}

		for (int i = 0; i < T.length; i++) {
			System.out.printf("%10s %4s \n", T[i][0], T[i][1]);
		}
		
	}
}