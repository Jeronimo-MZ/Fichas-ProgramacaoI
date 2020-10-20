import java.util.*;
public class Ex14{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int nr, R[], I[], P[];
		System.out.println("Insira o tamanho do vector:  ");
		nr = teclado.nextInt();
		R = new int[nr];
		int pares = 0; int impares = 0;

		for(int i = 0; i < R.length; i++){
			System.out.print("R[" + i + "]: ");
			R[i] = teclado.nextInt();
		}


		for(int i = 0; i < R.length; i++){
			if(R[i] % 2 == 0 ){
				pares++;
			}
			else{
				impares++;
			}
		}

		P = new int[pares];
		I = new int[impares];
		
		int posI = 0, posP = 0;

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
		System.out.println(Arrays.toString(R));
		System.out.println(Arrays.toString(P));
		System.out.println(Arrays.toString(I));
	}
}