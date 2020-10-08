import java.util.Scanner;
public class CalculoArea {

	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		System.out.println("======Calculadora de Área======");
		System.out.println("1 -> Área do Quadrado.");
		System.out.println("2 -> Área do Triângulo.");
		System.out.println("3 -> Área do Círculo.");
		System.out.println("Escolha a opção desejada: ");
		int opcao = teclado.nextInt();
		double area;

		switch (opcao) {
			case 1:
				System.out.println("Insira a medida do lado do quadrado (em m): ");
				double lado = teclado.nextDouble();
				area = calcularAreaQuadrado(lado);
				System.out.println("A área do quadrado de lado " + lado + "m é de " + area + "m²");
				break;
			case 2:
				System.out.println("Insira a medida da base do triângulo (em m): ");
				Double base = teclado.nextDouble();
				System.out.println("Insira a medida da altura do triângulo (em m): ");
				Double altura = teclado.nextDouble();
				area = calcularAreaTriangulo(base, altura);
				System.out.println("A área do triângulo de base " + base + "m e altura " + altura + "m é de " + area + "m²");
				break;
			case 3:
				System.out.println("Insira a medida do raio da circunferência (em m): ");
				double raio = teclado.nextDouble();
				area = calcularAreaCirculo(raio);
				System.out.println("A área do círculo de raio " + raio + "m é de " + area + "m²");
				break;
			default:
				System.out.println("Opção inválida!");
		}

		teclado.close();
	}

	private static double calcularAreaQuadrado(double lado) {
		return lado * lado;
	}

	private static double calcularAreaTriangulo(double base, double altura) {
		return base * altura / 2;
	}

	private static double calcularAreaCirculo(double raio) {
		return Math.PI * raio * raio;
	}
}