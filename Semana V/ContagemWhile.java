import java.util.Scanner;
public class ContagemWhile {

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        System.out.println("Insira um número inteiro positivo: ");
        int n = teclado.nextInt();

        System.out.println("Contagem: ");

        while(i <=n){
            System.out.println(i);
            i++;
        }
        teclado.close();
    }
}
