import java.util.Scanner;
import java.util.Random;
public class TrigonometriaAleatoria {

    public static void main(String args[]){
	final Scanner teclado = new Scanner(System.in);
	Random R = new Random();
	System.out.println("insira um número");
	int numero = teclado.nextInt();
	int numeroAleatorio =  R.nextInt(numero + 1);
	System.out.println("Número aleatório gerado: " + numeroAleatorio);
	System.out.printf("Sen %d = %.4f%n", numeroAleatorio, Math.sin(numeroAleatorio));
	System.out.printf("Cos %d = %.4f%n", numeroAleatorio, Math.cos(numeroAleatorio));
	System.out.printf("cos %d = %.4f%n", numeroAleatorio, Math.tan(numeroAleatorio));
	System.out.printf("sqrt(%d) = %.4f%n", numeroAleatorio, Math.sqrt(numeroAleatorio));
	System.out.printf("%d^%d = %.4f%n", numero, numeroAleatorio, Math.pow(numero, numeroAleatorio));

	teclado.close();
    }
}
