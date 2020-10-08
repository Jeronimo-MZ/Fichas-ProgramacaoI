/*Faça um programa que exiba um menú ao usuário e peça qual lanche ele deseja, 
utilizando a estrutura de seleção múltipla exiba o lanche escolhido e o seu preço,
caso seja digitado um número que não exista no meu exiba uma mensagem de erro. Preço dos lanches:
Preços:X-Hamburger - Preço: 200mtn | X-Cachorro- Preço: 250mtn |
| X-Prego- Preço: 300 mtn || X-Sandes Mista - Preço: 150mtn */

import java.util.Scanner;

public class Lanches {
    public static void main(String args []) {
        final Scanner teclado = new Scanner(System.in);
        
        System.out.println("========Menu========");
        System.out.println(" ID |    Produto");
        System.out.println("  1 | X-Hamburger");
        System.out.println("  2 | X-Cachorro ");
        System.out.println("  3 | X-Prego");
        System.out.println("  4 | X-Sandes Mista");
        System.out.println("Insira o ID do produto que deseja: ");
        int id = teclado.nextInt();

        switch (id) {
            case 1: System.out.println("preço: 200 mtn"); break;
            case 2: System.out.println("preço: 250 mtn"); break;
            case 3: System.out.println("preço: 300 mtn"); break;
            case 4: System.out.println("preço: 150 mtn"); break;
            default: System.out.println("Opção inválida! ");
        }
        teclado.close();
    }
}
