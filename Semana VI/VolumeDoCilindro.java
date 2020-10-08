import java.util.Scanner;
public class VolumeDoCilindro {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        float altura, raio, volume;
        System.out.println("Insira a altura do cilindro em metros: ");
        altura = teclado.nextFloat();
        System.out.println("Insira o raio do cilindro em metros: ");
        raio = teclado.nextFloat();

        volume = (float) Math.PI * (float) Math.pow(raio,2) * altura;
        System.out.printf("O volume do cilindro = %.4f%n m³", volume);
        teclado.close();
    }
}
