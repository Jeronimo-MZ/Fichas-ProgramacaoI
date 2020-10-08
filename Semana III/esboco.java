/*Faça um programa que exiba um menú ao usuário e peça qual lanche ele deseja, 
utilizando a estrutura de seleção múltipla exiba o lanche escolhido e o seu preço,
caso seja digitado um número que não exista no meu exiba uma mensagem de erro. Preço dos lanches:
Preços:X-Hamburger - Preço: 200mtn | X-Cachorro- Preço: 250mtn |
| X-Prego- Preço: 300 mtn || X-Sandes Mista - Preço: 150mtn */

import java.util.Scanner;

public class esboco {
    public static void main(String args []) {
        final Scanner teclado = new Scanner(System.in);
        System.out.println("==============Menu==============");
        System.out.println(" ID |    Produto     |  Preço");
        System.out.println("  1 | X-Hamburger    | 200 mtn");
        System.out.println("  2 | X-Cachorro     | 250 mtn");
        System.out.println("  3 | X-Prego        | 300 mtn");
        System.out.println("  4 | X-Sandes Mista | 150 mtn");
        System.out.println();
        System.out.println("Insira o ID do produto que deseja: ");
        id = teclado.nextInt();
        switch (id) {
            case 1:
            case 2:
            case 3:
            case 4:
        }
        teclado.close();
    }
}
