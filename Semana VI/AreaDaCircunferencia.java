import java.util.Scanner;
public class AreaDaCircunferencia {
    public static void main(String args[]) {
        final Scanner teclado = new Scanner(System.in);
        float area, raio;
        System.out.println("Insira o raio da circunferência em metros: ");
        raio = teclado.nextInt();
        area = (float) Math.PI * (float) Math.pow(raio, 2);
        System.out.printf("A área da circunferência de raio " + raio + " é %.4f m²%n", area);
        
        teclado.close();
    }
}
