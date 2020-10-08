import java.util.Scanner;
public class Tabuada{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um número para ver a sua tabuada: ");
        int num = teclado.nextInt();
        for (int i = 1; i <=12; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
        teclado.close();
    }
}