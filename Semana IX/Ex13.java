import java.util.Scanner;
import java.util.Arrays;

// NumerosDeMatricula

public class Ex13 {
	public static void main(String args[]){
		Scanner teclado =  new Scanner(System.in);
		int numerosDeMatricula[] = new int[20];
		int numero, i = 0;

		while (i < 20) { // 0,1,2,3,4
			System.out.println("\n=====Estudante " + (i+1) + "=====");
			System.out.println("Insira o seu número de matricula: ");
			numero = teclado.nextInt();
			if (existeNoArray(numero, numerosDeMatricula)) {
				System.out.println("O número inserido já existe na base de dados. Tente novamente.");
			}else {
				numerosDeMatricula[i] = numero;
				i++;
			}
		}
		System.out.println("Numeros de matricula Lidos: ");
		System.out.println(Arrays.toString(numerosDeMatricula));
	}

	public static boolean existeNoArray(int elemento, int[]array){
		// for i in array
		// for (int i : array){
		// 	if (i == elemento) return true;
		// }

		for (int i = 0; i < array.length; i++){
			if (array[i] == elemento) return true;
		}

		return false;
	}

}

