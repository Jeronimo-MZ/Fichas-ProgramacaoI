import java.util.Scanner;

public class Ex04I {
	public static void main(String args[]) {
		Scanner teclado =  new Scanner(System.in);
		float saltos[] =  new float[5];

		System.out.print("Atleta: ");
		String nome = teclado.nextLine();
		System.out.print("Primeiro salto: ");
		saltos[0] = teclado.nextFloat();
		System.out.print("Segundo salto: ");
		saltos[1] = teclado.nextFloat();
		System.out.print("Terceiro salto: ");
		saltos[2] = teclado.nextFloat();
		System.out.print("Quarto salto: ");
		saltos[3] = teclado.nextFloat();
		System.out.print("Quinto salto: ");
		saltos[4] = teclado.nextFloat();

		System.out.println("\nResultado final: ");
		System.out.println("Atleta: " + nome);
		System.out.print("Saltos: " + saltos[0]);
		for (int i = 1; i< saltos.length; i++) {
			System.out.print(" - "+ saltos[i]);
		}
		System.out.println("\nMedia dos saltos: " + calcularMedia(saltos));

	}

	public static float calcularMedia(float[] arr) {
		if (arr.length == 0) return 0;
		float soma = 0;

		for (float i: arr){
			soma += i;
		}
		return soma / arr.length;
	}
}