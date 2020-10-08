import java.util.Scanner;
public class StringInvertida {
    public static void main(String args[]) {
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Insira uma String (palavra ou frase):");
        String entrada = teclado.nextLine();
        String entradaInvertida = "";
        for (int i = 0;  i<entrada.length(); i++) entradaInvertida = entrada.charAt(i) + entradaInvertida;
        System.out.println("String invertida: " + entradaInvertida);
        teclado.close();
    }
}
