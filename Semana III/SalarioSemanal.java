import java.util.Scanner;
public class SalarioSemanal {

	public static void main(String args[]) {
		final Scanner teclado = new Scanner(System.in);
		float salario;
		
		System.out.println("Insira o nome do funcionário: ");
		String nome = teclado.nextLine();
		System.out.println("Insira o número de horas trabalhadas: ");
		int horas = teclado.nextInt();

		if (horas <=40) {
			salario = horas * 1500;
			System.out.println("O funcionário "+nome+ " trabalhou " + horas + " horas e irá receber um salário de " +
			salario + "Mt.");
		} else {
			int horasExtra = horas - 40;
			horas -= horasExtra;
			salario = horas * 1500;
			float salarioExtra = horasExtra * 1750;
			
			System.out.println("O funcionário "+nome+ " trabalhou " + (horas+horasExtra) + " horas e irá receber " +
			salario + "Mt pelas horas normais e "+ salarioExtra + "Mt pelas horas extra, o que totaliza  "+
			(salario + salarioExtra) + "Mt.");
			teclado.close();
		}
	}
}
