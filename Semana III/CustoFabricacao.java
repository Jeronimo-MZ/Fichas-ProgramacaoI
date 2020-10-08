import java.util.Scanner;
public class CustoFabricacao {
    public static void main(String args[]) {
        final Scanner teclado = new Scanner(System.in);
        float maoDeObra=0,custoFabricacao=0, custoProducao;
        float materiaPrima, precoVenda;
        System.out.println("Insira o código do produto [1-6]: ");
        int cod = teclado.nextInt();
        System.out.println("Insira o preço da matéria prima: ");
        materiaPrima = teclado.nextFloat();

        if (cod == 3 || cod == 4)      maoDeObra = materiaPrima * 75 / 100;
        else if (cod == 1 || cod == 5) maoDeObra = materiaPrima * 80 / 100;
        else if (cod == 2 || cod == 6) maoDeObra = materiaPrima * 85 / 100;

        if (cod == 2 || cod == 5)      custoFabricacao = materiaPrima * 30 / 100;
        else if (cod == 3 || cod == 6) custoFabricacao = materiaPrima * 35 / 100;
        else if (cod == 1 || cod == 4) custoFabricacao = materiaPrima * 28 / 100;

        custoProducao = materiaPrima + maoDeObra + custoFabricacao;
        precoVenda    = custoProducao + (custoProducao * 45/100);
        
        System.out.println("Para o produto de código "+cod+" o preço de venda será " + 
        precoVenda + "Mt.");
        
        teclado.close();
    }
}