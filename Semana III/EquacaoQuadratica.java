import java.util.Scanner;
public class EquacaoQuadratica {
    
    public static void main(String args[]) {
        final Scanner teclado = new Scanner(System.in);
        float a, b, c, delta, x, x1, x2;
        System.out.println("Introduza os valores de a, b e c separados por um espaço: ");
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();

        if (a == 0) {
            x = -c/b;
            System.out.println("A equação é linear e o valor de X é " + x);
        } else {
            delta = (float)Math.pow(b,2) - 4*a*c;
            if (delta >= 0) {
                x1 = (float)(-b + Math.sqrt(delta)) / (2*a);
                x2 = (float)(-b - Math.sqrt(delta)) / (2*a);
                System.out.println("X1 = " + x1 + " e X2 = " + x2);
            } else{
                System.out.println("Não tem raizes reais");
            }
        }
        teclado.close();
    }
}