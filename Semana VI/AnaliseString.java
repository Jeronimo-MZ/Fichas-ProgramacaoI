import java.util.Scanner;
public class AnaliseString {

    public static void main(String args[]){
		final Scanner teclado = new Scanner(System.in);
		System.out.println("Insira uma Frase: ");
		String frase = teclado.nextLine();
		String vogais = "aeiouAEIOU";
		int contVogais = 0, contEspacos = 0;

		for (int i = 0; i < frase.length(); i++) {
		    if (vogais.indexOf(frase.charAt(i)) != -1) contVogais++;
		    else if (frase.charAt(i) == ' ') contEspacos++;
		}
		
		System.out.println("Na frase inserida existem " + contVogais + " vogais e " + contEspacos + " espaços em branco");
    }
}
