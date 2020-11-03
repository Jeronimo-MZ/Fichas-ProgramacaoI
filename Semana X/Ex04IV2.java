import java.util.Scanner;
import java.util.ArrayList;

public class Ex04IV2 {
	public static void main(String args[]) {
		Scanner teclado =  new Scanner(System.in);
		ArrayList<Float> saltos = new ArrayList<Float>();

		System.out.print("Atleta: ");
		String nome = teclado.nextLine();
		System.out.print("Primeiro salto: ");
		saltos.add(teclado.nextFloat());
		System.out.print("Segundo salto: ");
		saltos.add(teclado.nextFloat());
		System.out.print("Terceiro salto: ");
		saltos.add(teclado.nextFloat());
		System.out.print("Quarto salto: ");
		saltos.add(teclado.nextFloat());
		System.out.print("Quinto salto: ");
		saltos.add(teclado.nextFloat());

		System.out.println("\nResultado final: ");
		System.out.println("Atleta: " + nome);
		System.out.print("Saltos: " + saltos.get(0));
		for (int i = 1; i< saltos.size(); i++) {
			System.out.print(" - "+ saltos.get(i));
		}
		System.out.println("\nMedia dos saltos: " + calcularMedia(saltos));

	}

	public static float calcularMedia(ArrayList<Float> arr) {
		if (arr.size() == 0) return 0;
		float soma = 0;

		for (float i: arr){
			soma += i;
		}
		return soma / arr.size();
	}
}