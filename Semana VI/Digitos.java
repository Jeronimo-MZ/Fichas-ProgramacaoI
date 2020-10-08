import java.util.Scanner;
public class Digitos {

    public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		String digitos,resultado = "";
		System.out.println("Entre com o número: ");
		int numero = teclado.nextInt();
		digitos = String.valueOf(numero);
		for (int i = 0; i < digitos.length(); i++ ){
			
			if (resultado != "") resultado += ", ";
			switch (digitos.charAt(i)) {
			case '1': resultado += "um";   break;
			case '2': resultado += "dois"; break;
			case '3': resultado += "tres"; break;	
			case '4': resultado += "quatro"; break;	
			case '5': resultado += "cinco"; break;	
			case '6': resultado += "seis"; break;	
			case '7': resultado += "sete"; break;	
			case '8': resultado += "oito"; break;	
			case '9': resultado += "nove"; break;	
			case '0': resultado += "zero"; break;
			}	
		}
		System.out.println("Resultado = " + resultado);
		teclado.close();
    }
}
