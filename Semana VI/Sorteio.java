import java.util.Scanner;
import java.util.Random;
public class Sorteio{

    public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);
	Random R = new Random();
	int numeroAleatorio = R.nextInt(1001);
	int palpite, tentativas = 0;
	do {
	    System.out.println("Insira o seu palpite [0-1000]:");
	    palpite = teclado.nextInt();
	    if (palpite == numeroAleatorio) System.out.println("Acertou!!! O número aleatório era:" + numeroAleatorio);
	    else if (palpite >  numeroAleatorio) System.out.println("Errou!! Tente um número menor.");
	    else System.out.println("Errou!! Tente um número Maior.");
	    tentativas++;
	}while (palpite != numeroAleatorio);
	System.out.println("Acertou em " + tentativas + " tentativas");
    }
}
