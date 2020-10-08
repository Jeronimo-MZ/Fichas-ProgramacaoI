public class SomaEProduto {
	public static void main(String[] args) {
		System.out.println("Intervalo: [1-30]");
		System.out.println("soma dos impares = " + somaImparesIntervalo(1,30));
		System.out.println("produto dos pares = " + produtoParesIntervalo(1,30));
	}

	public static int somaImparesIntervalo(int inicio, int fim) {
		int soma = 0;
		for (int i = inicio; i <= fim; i++) {
			if (i % 2 != 0) soma += i;
		}
		return soma;
	}
	
	public static long produtoParesIntervalo(int inicio, int fim) {
		long produto = 1;
		for (int i = inicio; i <= fim; i++) {
			if (i % 2 == 0) produto *= i;
		}
		return produto;
	}
}