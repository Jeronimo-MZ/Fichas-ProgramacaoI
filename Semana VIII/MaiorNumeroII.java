public class MaiorNumeroII {
	public static void main(String[] args) {
		int maiorInt = maior(65, 12, 98, 43, 64);
		double maiorDouble = maior(1.5, 4.7, 5.6, 12.7, 12.8);

		System.out.println("O maior número entre 65, 12, 98, 43 e 64 é: " + maiorInt);
		System.out.println("O maior número entre 1.5, 4.7, 5.6, 12.7 e 12.8 é: " + maiorDouble);

		
	}

	// int
	
	public static int maior(int a, int b) {
		return (a > b) ? a : b;
	}

	public static int maior(int a, int b, int c) {
		int m = maior(a,b);
		return (m > c) ? m : c;
	}

	public static int maior(int a, int b, int c, int d) {
		int m = maior(a,b,c);
		return (m > d) ? m : d;
	}

	public static int maior(int a, int b, int c, int d, int e) {
		int m = maior(a, b, c, d);
		return (m > e) ? m : e;
	}

	// double
	public static double maior(double a, double b) {
		return (a > b) ? a : b;
	}

	public static double maior(double a, double b, double c) {
		double m = maior(a,b);
		return (m > c) ? m : c;
	}

	public static double maior(double a, double b, double c, double d) {
		double m = maior(a,b,c);
		return (m > d) ? m : d;
	}

	public static double maior(double a, double b, double c, double d, double e) {
		double m = maior(a, b, c, d);
		return (m > e) ? m : e;
	}

}