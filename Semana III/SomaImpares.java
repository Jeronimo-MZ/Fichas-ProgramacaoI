public class SomaImpares {

	public static void main(String args[]) {
		int somaImpares = 0;
		long  produtoPares = 1;
		for (int i = 1; i <=30; i++) {
			if (i % 2 != 0){
				 somaImpares += i;
			} else {
				produtoPares *= i;
			}
		}
		System.out.println("A soma dos ímpares de 0 à 30 é "+ somaImpares+" e a multiplicação de pares é " +
		 produtoPares);
	}
}
