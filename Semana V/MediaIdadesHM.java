import java.util.Scanner;
public class MediaIdadesHM {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int qtdHomens, qtdMulheres, somaHomens = 0, somaMulheres = 0;
        float mediaHomens, mediaMulheres;

        System.out.println("Insira a quantidade de homens: ");
        qtdHomens = teclado.nextInt();
        System.out.println("Insira a quantidade de mulheres: ");
        qtdMulheres = teclado.nextInt();

        for (int i = 1; i <= qtdHomens; i++){
            System.out.printf("Insira a idade do %do homem: ",i);
            somaHomens += teclado.nextInt();
        }
        for (int i = 1; i <= qtdMulheres; i++){
            System.out.printf("Insira a idade da %da mulher: ",i);
            somaMulheres += teclado.nextInt();
        }

        mediaHomens = (float) somaHomens / qtdHomens;
        mediaMulheres = (float) somaMulheres / qtdMulheres;

        System.out.printf("Media da idade dos homens na turma: %.2f%n", mediaHomens);
        System.out.printf("Media da idade das mulheres na turma: %.2f%n", mediaMulheres);

        teclado.close();
    }
}
