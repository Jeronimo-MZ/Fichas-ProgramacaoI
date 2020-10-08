public class TempoDeGestacao {
	public static void main(String[] args) {
		int dias = 624; // tempo de gestacao de um Elefante indiano 
		int horas = diasParaHoras(dias);
		int minutos = horasParaMinutos(horas);
		int segundos = minutosParaSegundos(minutos);
		
		System.out.println("O tempo de gestacao de um elefante indiano é de " + dias + " dias.");
		System.out.println("Em horas, equivalem à: " + horas+ " horas.");
		System.out.println("Em minutos, equivalem à: " + minutos + " minutos.");
		System.out.println("Em segundos, equivalem à: " + segundos + " segundos.");
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

}