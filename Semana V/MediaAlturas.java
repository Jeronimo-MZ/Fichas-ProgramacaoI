import java.util.Scanner;

public class MediaAlturas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float altura, somaAlturas=0, media;
        System.out.println("Insira o número de alunos na turma: ");
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Insira a altura do estudante " + i+ " (em metros):");
            altura = teclado.nextFloat();
            somaAlturas += altura;
        }
        media = somaAlturas/n;
        System.out.printf("A média das alturas dos estudantes da turma I16 é %.4fm%n",media);

        teclado.close();
    }

}