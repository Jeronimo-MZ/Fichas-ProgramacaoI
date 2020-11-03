import java.util.*;
public class Ex14{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int nr, R[], I[], P[];
		System.out.println("Insira o tamanho do vector:  ");
		nr = teclado.nextInt();
		R = new int[nr];
		int pares = 0; int impares = 0; // contadores

		// preencher o vector
		for(int i = 0; i < R.length; i++){
			System.out.print("R[" + i + "]: ");
			R[i] = teclado.nextInt();
		}

		// fazer a contagem
		for (int i = 0; i < R.length; i++){
			if (R[i] % 2 == 0 ){
				pares++;
			}
			else{
				impares++;
			}
		}

		P = new int[pares];
		I = new int[impares];
		
		int posI = 0, posP = 0;

		// preencher os vectores P e I
		for(int i = 0; i < R.length; i++){
			if(R[i] % 2 == 0 ){
				P[posP] = R[i];
				posP++;
			}
			else{
				I[posI] = R[i];
				posI++;
			}
		}
		// imprimir os vectores
		System.out.println("R = " + Arrays.toString(R));
		System.out.println("P = " + Arrays.toString(P));
		System.out.println("I = " + Arrays.toString(I));
	}
}