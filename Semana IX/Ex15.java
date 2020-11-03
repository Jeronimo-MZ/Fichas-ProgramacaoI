import java.util.Scanner;
import java.util.Arrays;

// Ordenacao
public class Ex15 {
	public static void main(String args[]) {
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Nota: Insira valores ordenados para cada vector!");

		System.out.print("Insira o tamanho do primeiro vector: ");
		int tamanhoM = teclado.nextInt();
		System.out.print("Insira o tamanho do segundo vector: ");
		int tamanhoN = teclado.nextInt();

		int M[] = new int[tamanhoM];
		int N[] = new int[tamanhoN];
		System.out.println("\n=====Primeiro vector=====");
		for (int i = 0; i < M.length; i++) {
			System.out.print("M[" + i + "] = ");
			M[i] = teclado.nextInt();
		}
		System.out.println("\n=====Segundo vector=====");
		for (int i = 0; i < N.length; i++) {
			System.out.print("N[" + i + "] = ");
			N[i] = teclado.nextInt();
		}

		int res[] = ordenar(M,N);
		System.out.println("\n=====Saida=====");
		System.out.println("M[] = " + Arrays.toString(M));
		System.out.println("N[] = " + Arrays.toString(N));
		System.out.println("resultado: " + Arrays.toString(res));
 	}


 	public static int[] ordenar(int M[], int N[]) {

 		int posM = 0;
 		int posN = 0; 
 		int i = 0; 
 		int res[] = new int[M.length+N.length];
 		while (posM < M.length || posN < N.length) {
 			if (posM < M.length && posN < N.length) {
 				// COMPARACAO

	 			if (M[posM] < N[posN]) {
	 				res[i] = M[posM];
	 				i++;
	 				posM++; 
	 			}else {
	 				res[i] = N[posN];
	 				posN++;
	 				i++;
	 			}

 			} else if (posN >= N.length){
 				for (;posM < M.length; posM++){
 					res[i] = M[posM];
 					i++;
 				}
 			}else {
 				for (;posN < N.length; posN++){
 					res[i] = N[posN];
 					i++;
 				}
 			}
 		}
 		return res;
 	}
}