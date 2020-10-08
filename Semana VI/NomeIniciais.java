import java.util.Scanner;

public class NomeIniciais {

	public static void main(String args[]) {
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Insira um Nome: ");
		String nome = teclado.nextLine();
		String iniciais = "";
		int inicio = 0;
		String sub;

		for (int i = 0; i < nome.length(); i++){

			if (nome.charAt(i) == ' ' || i == nome.length()-1){
				if( i == nome.length()-1) i++;
				sub = nome.substring(inicio, i).toUpperCase();
				if (!"E DO DA DOS DAS DE DI DU".contains(sub)){
				iniciais += sub.charAt(0);					
				}
				inicio = i + 1;
			}
		}
		System.out.println("Iniciais: " + iniciais);
	}
}