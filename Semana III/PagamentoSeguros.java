import java.util.Scanner;
public class PagamentoSeguros {
    public static void main(String args[]){
        final Scanner teclado = new Scanner(System.in);
        char plano, resposta;
        float taxaFinal, taxaBase;
        float percentualAumento=0, aumento;
        System.out.println("Insira o plano de politica [A|B]:");
        plano = teclado.nextLine().toUpperCase().charAt(0);

        // A - 4200 | B - 1150
        if (plano == 'A' || plano == 'B'){
            taxaBase = (plano == 'A') ? 4200 : 1150;
            System.out.println("Tem o hábito de beber? [S/N]: ");
            resposta = teclado.nextLine().toUpperCase().charAt(0);
            percentualAumento += (resposta=='S') ? 10 : 0;

            System.out.println("Usa óculos? [S/N]");
            resposta = teclado.nextLine().toUpperCase().charAt(0);
            percentualAumento += (resposta=='S') ? 5 : 0;
            
            System.out.println("Sofre de alguma doença? [S/N]:");
            resposta = teclado.nextLine().toUpperCase().charAt(0);
            percentualAumento += (resposta=='S') ? 5 : 0;
            
            System.out.println("tem mais de 40 anos? [S/N]");
            resposta = teclado.nextLine().toUpperCase().charAt(0);
            percentualAumento += (resposta=='S') ? 20 : 10;

            aumento = taxaBase * percentualAumento / 100;
            taxaFinal = taxaBase + aumento;
            System.out.println("O preço final será:"+taxaFinal);

            
        }else{
            System.out.println("O plano selecionado não existe!");
        }

        teclado.close();
    }
}
