import java.util.Scanner;
public class NomeCompleto {
    public static void main(String args[]) {
        final Scanner teclado = new Scanner(System.in);
        String nome;
        int x = 2562, y = 1415;
        System.out.println("Insira o seu nome completo: ");
        nome = teclado.nextLine();
        System.out.println("=================================");
        System.out.println("O seu nome completo é: "+nome);
        System.out.println("Sendo X = " + x + " e Y = " + y +", então: ");
        System.out.println("X + Y = " + (x+y));
        System.out.println("X * Y = " + (x*y));
        System.out.println("X - Y = " + (x-y));
        System.out.println("X / Y = " + (x/(float)y));
        System.out.println("X % Y = " + (x%y));

        teclado.close();

    }
}