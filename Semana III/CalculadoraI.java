import java.util.Scanner;
public class CalculadoraI {
    public static void main(String args[]) {
        final Scanner teclado = new Scanner(System.in);
        int operacao;
        double num1, num2;
        System.out.println("Insira o primeiro número: ");
        num1 = teclado.nextDouble();
        System.out.println("Insira o segundo número: ");
        num2 = teclado.nextDouble();
        System.out.println("1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Multiplicação ");
        System.out.println("Insira o número correspondente a operação que deseja realizar: ");
        operacao = teclado.nextInt();
        if (operacao == 1) System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        else if (operacao == 2) System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        else if (operacao == 3) System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        else if (operacao == 4) System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
        else System.out.println("Opção inválida!");
        teclado.close();
    }
}