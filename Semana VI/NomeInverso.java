import java.util.Scanner;

public class NomeInverso {

    public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);
	System.out.println("Insira o seu Nome (letras maiúsculas ou minúsculas): ");
	String nome = teclado.nextLine();
	String nomeInvertido = "";
	
	for (int i = 0;  i < nome.length(); i++){
		nomeInvertido = nome.charAt(i) + nomeInvertido;
	}
	nomeInvertido = nomeInvertido.toUpperCase();
	System.out.println("O nome invertido fica: " + nomeInvertido);
    }
}

