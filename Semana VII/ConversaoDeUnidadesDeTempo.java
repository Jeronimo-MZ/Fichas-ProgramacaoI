import java.util.Scanner;

public class ConversaoDeUnidadesDeTempo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("------Conversor-------------");
		System.out.println("1 - minutos -> segundos");
		System.out.println("2 - horas -> minutos");
		System.out.println("3 - dias -> horas");
		System.out.println("4 - semanas -> dias;");
		System.out.println("5 - meses -> dias");
		System.out.println("6 - anos -> dias");
		System.out.println("Escolha uma opcao: ");
		int opcao = teclado.nextInt();
		int valorInserido, resultado;

		switch (opcao) {
			case 1:
				System.out.println("Insira os minutos: ");
				valorInserido = teclado.nextInt();
				resultado = minutosParaSegundos(valorInserido);
				System.out.println(valorInserido + " minutos equivalem à " + resultado + " segundos.");
				break;
			case 2:
				System.out.println("Insira as horas: ");
				valorInserido = teclado.nextInt();
				resultado = horasParaMinutos(valorInserido);
				System.out.println(valorInserido + " horas equivalem à " + resultado + " minutos.");
				break;
			case 3:
				System.out.println("Insira os dias: ");
				valorInserido = teclado.nextInt();
				resultado = diasParaHoras(valorInserido);
				System.out.println(valorInserido + " dias equivalem à " + resultado + " horas.");
				break;
			case 4:
				System.out.println("Insira as semanas: ");
				valorInserido = teclado.nextInt();
				resultado = semanasParaDias(valorInserido);
				System.out.println(valorInserido + " semanas equivalem à " + resultado + " dias.");
				break;
			case 5:
				System.out.println("Insira os meses: ");
				valorInserido = teclado.nextInt();
				resultado =	mesesParaDias(valorInserido);
				System.out.println(valorInserido + " meses equivalem à, aproximadamente, " + resultado + " dias.");
				break;
			case 6:
				System.out.println("Insira os anos: ");
				valorInserido = teclado.nextInt();
				float result = anosParaDias(valorInserido);
				System.out.println(valorInserido + " anos equivalem à, aproximadamente, " + result + " dias.");
				break;
			default:
				System.out.println("Opção Inválida!");
		}


		teclado.close();
	}

	private static int minutosParaSegundos(int minutos){
		return minutos * 60;
	}

	private static int horasParaMinutos(int horas){
		return horas * 60;
	}

	private static int diasParaHoras(int dias){
		return dias * 24;
	}

	private static int semanasParaDias(int semanas){
		return  semanas * 7;
	}

	private static int mesesParaDias(int meses){
		return meses * 30;
	}

	private static float anosParaDias(int anos){
		return anos * 365.5f;
	}
}