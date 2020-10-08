import java.util.Scanner;

public class ConversorTemperatura {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("==========Conversor=========");
		System.out.println("1 - Fahrenheit -> Celcius");
		System.out.println("2 - Celcius -> Fahrenheit");
		System.out.println("escolha uma opção: ");
		int escolha = teclado.nextInt();
		double temperatura, resultado;
		switch (escolha) {
			case 1:
				System.out.println("Insira a temperatura em Fahrenheit: ");
				temperatura = teclado.nextDouble();
				resultado = fahrenheitToCelcius(temperatura);
				System.out.println(temperatura + "F = " + resultado + "C");
				break;
			case 2:
				System.out.println("Insira a temperatura em Celcius: ");
				temperatura = teclado.nextDouble();
				resultado = celciusToFahrenheit(temperatura);
				System.out.println(temperatura + "C = " + resultado + "F");
				break;
			default:
				System.out.println("Opção inválida!");
		}
	}

	private static double fahrenheitToCelcius(double F){
		return (F - 32) / 1.8;
	}

	private static double celciusToFahrenheit(double C) {
		return C * 1.8 + 32;
	}
}