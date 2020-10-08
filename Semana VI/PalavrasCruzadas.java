import java.util.Scanner;
import java.text.Normalizer;
public class PalavrasCruzadas {
	
	public static void main(String args[]){
		Scanner teclado =  new Scanner(System.in);
		int pontos = 0;

		System.out.println("Insira a palavra: ");
		String palavra = teclado.nextLine();
		
		palavra = palavra.toUpperCase();
		String palavraAux = palavra;
		String caracter;
		// palavraAux = removeAcentos(palavraAux);

		for (int i = 0; i< palavraAux.length(); i++){
			caracter = String.valueOf(palavraAux.charAt(i));
			if      ("QZ".contains(caracter))       pontos += 10;
			else if ("JX".contains(caracter))       pontos += 8;
			else if ("k".contains(caracter))        pontos += 5;
			else if ("FHVWY".contains(caracter))    pontos += 4;
			else if ("BCMP".contains(caracter))     pontos += 3;
			else if ("DG".contains(caracter))       pontos += 2;
			else if ("AEILNORSTU".contains(caracter)) pontos += 1;
		}
		System.out.println("A palavra " + palavra + " vale "+ pontos + " pontos.");
		teclado.close();
	}

	// public static String removeAcentos(String string) {
	//     if (string != null){
	//         string = Normalizer.normalize(string, Normalizer.Form.NFD);
	//         string = string.replaceAll("[^\\p{ASCII}]", "");
	//     }
	//     return string;
	// }
}