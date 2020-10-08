import java.util.Scanner;
public class DezValores {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int val1, val2, val3, val4, val5, val6, val7, val8, val9, val10;
        System.out.println("Insira o primeiro valor: ");
        val1 = teclado.nextInt();
        System.out.println("Insira o segundo valor: ");
        val2 = teclado.nextInt();
        System.out.println("Insira o terceiro valor: ");
        val3 = teclado.nextInt();
        System.out.println("Insira o quarto valor: ");
        val4 = teclado.nextInt();
        System.out.println("Insira o quinto valor: ");
        val5 = teclado.nextInt();
        System.out.println("Insira o sexto valor: ");
        val6 = teclado.nextInt();
        System.out.println("Insira o sétimo valor: ");
        val7 = teclado.nextInt();
        System.out.println("Insira o oitavo valor: ");
        val8 = teclado.nextInt();
        System.out.println("Insira o nono valor: ");
        val9 = teclado.nextInt();
        System.out.println("Insira o décimo valor: ");
        val10 = teclado.nextInt();

        System.out.println("Os valores inseridos foram: " + val1 + ", " +  val2 + ", " + val3 +", " + val4 + ", " 
        + ", " + val5 + ", " + val6 + ", " + val7 + ", " + val8 + ", " + val9 + ", " + val10);
        int soma = val1 + val2 + val3 + val4 + val5 + val6 + val7 + val8 + val9 + val10;
        float media = (float) soma/10;
        System.out.println("A soma dos valores inseridos é:" + soma);
        System.out.println("A média dos valores inseridos é:" + media);
        teclado.close();
    }
}
