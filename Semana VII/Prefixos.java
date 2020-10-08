import java.util.Scanner;

public class Prefixos {
	public static void main(String args[]) { 
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a palavra a testar: ");
		String palavra = teclado.nextLine();
		System.out.println("Insira o possivel prefixo: ");
		String prefixo = teclado.nextLine();

		if (isPrefix(prefixo, palavra)) {
			System.out.println(prefixo + " é um prefixo de " + palavra);
		} else{
			System.out.println(prefixo + " não é um prefixo de " + palavra);
		}

		teclado.close();
	}

	private static boolean isPrefix(String a, String b) {
		if (a.length() > b.length()) return false;
		a = a.toUpperCase();
		b = b.toUpperCase();
		
		if (b.substring(0,a.length()).equals(a)) return true;
		return false;
	}
}