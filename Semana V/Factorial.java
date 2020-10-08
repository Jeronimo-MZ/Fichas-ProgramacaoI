import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        long factorial = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int n = teclado.nextInt();
        for (int i = 2; i <= n; i++){
            factorial *= i;
        }
        System.out.printf("O factorial %d é %d%n", n, factorial);
        teclado.close();
    }
}
