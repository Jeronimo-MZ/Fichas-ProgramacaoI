import java.util.Scanner;

public class SituacaoEstudante {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int nota, aprovados = 0, reprovados = 0;
        String nome;

        for (int i = 1; i <= 10; i++){
            System.out.println("Insira o nome do " + i + " o Aluno");
            nome = teclado.nextLine();
            System.out.println("Insira a nota do " + i + " o Aluno");
            nota = Integer.parseInt(teclado.nextLine());

            if (nota < 225) reprovados++;
            else aprovados++;
        }

        System.out.println("No total tiveram " + aprovados + " alunos reprovados e " +
        reprovados + " alunos reprovados. ");

        teclado.close();
    }
}