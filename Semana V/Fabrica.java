import java.util.Scanner;
public class Fabrica {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o número de peças: ");
        float comprimento;
        int pecasAdequadas = 0;
        int n = teclado.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println("Insira o comprimento da peça "+ i +" (em metros):");
            comprimento = teclado.nextFloat();
            if (comprimento >= 1.20 && comprimento <= 1.30) pecasAdequadas++;
        }
        System.out.println("No total há " + pecasAdequadas + " peça(s) adequada(s) ao lote.");
        teclado.close();
    }
}
