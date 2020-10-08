import java.util.Scanner;
public class Instituicao {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in); 
		String nome = teclado.nextLine(),nomemeio=teclado.nextLine(),nomefamilia=teclado.nextLine(); 
		System.out.print(nome.charAt(0)); System.out.print(nomemeio.charAt(0)); 
		System.out.println(nomefamilia.charAt(0)); 
		System.out.print(nome.charAt(0)+"."+ nomemeio.charAt(0)+"."+ nomefamilia); 
	}
}