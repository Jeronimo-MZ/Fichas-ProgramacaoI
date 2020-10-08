import java.util.Scanner;
public class Sorveteria {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o tipo de adesão [A,B ou C]:");
        char tipo = teclado.nextLine().toUpperCase().charAt(0);
        System.out.println("Insira o valor da venda: ");
        float valorVenda = teclado.nextFloat();
        float desconto = 0;

        if (tipo == 'A')      desconto = valorVenda * 10 / 100;
        else if (tipo == 'B') desconto = valorVenda * 15 / 100;
        else if (tipo == 'C') desconto = valorVenda * 20 / 100;
        float total = valorVenda - desconto;

        if (tipo == 'A' || tipo == 'B' || tipo == 'C'){
            System.out.println("Para o cliente com adesão do tipo '"+tipo+ "' o desconto será " +  
            desconto +"Mt, tendo como preço final "+total + "Mt.");
        } else {
            System.out.println("O tipo de adesão não existe! Não será aplicado nenhum desconto.");
            System.out.println("O preço a pagar será: " + total + "Mt.");
        }
        teclado.close();
    }
}