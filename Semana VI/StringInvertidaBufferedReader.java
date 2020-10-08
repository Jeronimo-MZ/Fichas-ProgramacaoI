import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringInvertidaBufferedReader {
    public static void main(String args[]) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insira uma String (palavra ou frase):");
        String entrada = teclado.readLine();
        String entradaInvertida = "";
        for (int i = 0;  i<entrada.length(); i++) entradaInvertida = entrada.charAt(i) + entradaInvertida;
        System.out.println("String invertida: " + entradaInvertida);
    }
}
