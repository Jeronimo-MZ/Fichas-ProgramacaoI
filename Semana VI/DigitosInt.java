import java.util.Scanner;

public class DigitosInt {

    public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		String resultado = "";
		System.out.println("Entre com o número: ");
		int numero = teclado.nextInt();
		int dig = 1;
		while (numero > 0){
			dig = numero % 10;
			if (resultado != "") resultado = ", " + resultado;
			switch (dig) {
			case 1: resultado = "um"  + resultado;  break;
			case 2: resultado = "dois" + resultado; break;
			case 3: resultado = "tres" + resultado; break;	
			case 4: resultado = "quatro" + resultado; break;	
			case 5: resultado = "cinco" + resultado; break;	
			case 6: resultado = "seis" + resultado; break;	
			case 7: resultado = "sete" + resultado; break;	
			case 8: resultado = "oito" + resultado; break;	
			case 9: resultado = "nove" + resultado; break;	
			case 0: resultado = "zero" + resultado; break;
			}	
			numero = numero / 10;
		}
		System.out.println("Resultado = " + resultado);
		teclado.close();
    }
}