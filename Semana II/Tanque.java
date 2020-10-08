import java.util.Scanner;
public class Tanque {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        float mangueira, minutos, horas;
        System.out.println("Insira a capacidade da mangueira (l/min): ");
        mangueira = teclado.nextFloat();
        minutos = 50000/mangueira; // 50 m³ -> 50 000 l
        horas = minutos/60;
        System.out.println("Para encher um tanque com uma capacidade de 50 m³ com uma mangueira com capacidade de " +
        mangueira +" l/m, serão necessárias, aproximadamente, " + (int)Math.ceil(horas) + " horas.");

        teclado.close();
    }
}