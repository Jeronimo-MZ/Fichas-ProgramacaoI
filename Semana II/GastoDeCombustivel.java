import java.util.Scanner;
public class GastoDeCombustivel {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        float km_percorridos, gasto;
        //float preco_combustivel = 61; // em metical
        System.out.print("Insira os km percorridos: ");
        km_percorridos = teclado.nextFloat();
        float litros = km_percorridos/8.0f;
        gasto = 61 * litros;
        System.out.println("O automóvel que percorreu " + km_percorridos + "km, efectuou um gasto de " + litros + 
        " litros, equivalentes a " + gasto + " Mt.");

        teclado.close();
    }
}