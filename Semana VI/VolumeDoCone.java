import java.util.Scanner;
public class VolumeDoCone {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        float volume, raio, altura;
        System.out.println("Insira o raio do cone: ");
        raio = teclado.nextFloat();
        System.out.println("Insira a altura do cone: ");
        altura = teclado.nextFloat();
        volume = (float) (Math.PI* Math.pow(raio,2) * altura)/3;
        System.out.println("O volume do cone é:" + volume);
        teclado.close();
    }
}
