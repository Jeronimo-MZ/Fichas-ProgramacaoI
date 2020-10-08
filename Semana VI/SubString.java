import java.util.Scanner;

public class SubString {
	
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira uma palavra a testar: ");
		String palavra = teclado.nextLine();
		System.out.println("Insira a letra desejada: ");
		char letra = teclado.nextLine().charAt(0);
		System.out.println("Imprimindo SubStrings correspondentes...");
		for (int i = 0; i<palavra.length(); i++){
			if (palavra.charAt(i) == letra){
				System.out.println(palavra.substring(0, i+1));
			}
		}
	}
}