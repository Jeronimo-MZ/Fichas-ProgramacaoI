import java.util.Scanner;
public class CompraCarros {
    public static void main(String args[]){
        final Scanner teclado = new Scanner(System.in);
        float precoCarro, precoFinal, desconto;
        int ano, totalCarros=0, totalCarros2000=0;
        char resposta;

        do{
            System.out.println("==========================================");
            System.out.println("Insira o Marca do Carro: ");
            final String marca = teclado.nextLine();
            System.out.println("Insira o preço do carro: ");
            precoCarro = Float.parseFloat(teclado.nextLine());
            System.out.println("Insira o ano de fabricação do carro: ");
            ano = Integer.parseInt(teclado.nextLine());
            if (ano <= 2000) {
                totalCarros2000 += 1;
                desconto = precoCarro * 0.12f;
            }else{
                desconto = precoCarro * 0.07f;
            }
            precoFinal = precoCarro - desconto;
            System.out.println("==========================================");
            System.out.println("Marca do Carro: " + marca);
            System.out.println("Preço original: " + precoCarro);
            System.out.println("Desconto:" + desconto);
            System.out.println("Preço com desconto: " + precoFinal);
            System.out.println("==========================================");
            totalCarros += 1;
            do{
                System.out.println("Deseja Continuar [S/N]: ");
                resposta = teclado.nextLine().charAt(0);
                if (resposta == 's' || resposta == 'n' ||
                resposta == 'S' || resposta == 'N') {
                    break;
                }else{
                    System.out.println("Opção Inválida! Tente novamente.");
                }
            } while(true);
            System.out.println();
        }while(resposta != 'N' && resposta != 'n');
        System.out.println("==========================================");
        System.out.println("Carros com ano até 2000 vendidos: "+totalCarros2000);
        System.out.println("Total de carros vendidos: " + totalCarros);
        System.out.println("==========================================");
        System.out.println("         Obrigado! Volte Sempre!          ");
        System.out.println("==========================================");
        teclado.close();
    }
}
