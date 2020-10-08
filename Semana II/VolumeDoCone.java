import java.util.Scanner;
public class VolumeDoCone {
    public static void main(String args[]) {
        final Scanner teclado = new Scanner(System.in);
        float raio, altura, volume;
        System.out.println("Introduza o valor do raio: ");
        raio = teclado.nextFloat();
        System.out.println("Introduza o valor da altura: ");
        altura = teclado.nextFloat();
        volume = (3.14f * raio * raio * altura)/ 3.0f;
        System.out.println("Volume = " + volume);
        System.out.printf("Volume = %.4f\n", volume);

        teclado.close();
    }
}
