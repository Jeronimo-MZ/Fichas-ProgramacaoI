import java.util.Scanner;
public class Numeros {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n, opcao, qtdNumeros=0, soma=0;
        float media;
        do{
            System.out.println("Insira o número: ");
            n = teclado.nextInt();
            soma += n;
            qtdNumeros++;
            System.out.println("Deseja inserir outro número? [1-sim|2-não]:");
            opcao = teclado.nextInt();
        }while(opcao != 2);
        media = (float) soma/qtdNumeros;
        System.out.println("Quantidade de números digitados: " + qtdNumeros);
        System.out.println("Soma dos números digitados: " + soma);
        System.out.println("Média dos números digitados: " + media);
        teclado.close();
    }
}
