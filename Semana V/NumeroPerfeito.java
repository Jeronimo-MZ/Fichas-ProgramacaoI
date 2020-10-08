import java.util.Scanner;
public class NumerosPerfeitos {
    public static void main(String args[]) {
        int somaDivisores = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int numero = teclado.nextInt();
        // usando operadores ternários
        for (int i = 1; i < numero; i++) somaDivisores += (numero % i == 0) ? i : 0;
        
        System.out.println("O número "+ numero + ((somaDivisores == numero) ? " é perfeito" : " não é perfeito"));
        teclado.close();
    }

}