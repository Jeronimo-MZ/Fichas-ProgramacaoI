import java.util.Scanner;
public class Salario {
    public static void main(String args[]) {
        final Scanner teclado = new Scanner(System.in);
        float salarioPorHora, salarioBruto, salarioLiquido, descontos;
        int horasTrabalhadas;
        final float IRPS = 0.11f, INSS= 0.02f;
        System.out.println("Insira o nome do Funcionário: ");
        String nome = teclado.nextLine();
        System.out.println("Insira o valor que o funcionário recebe por hora: ");
        salarioPorHora = teclado.nextFloat();
        System.out.println("Insira o número de horas trabalhadas: ");
        horasTrabalhadas = teclado.nextInt();

        salarioBruto = salarioPorHora * horasTrabalhadas;
        descontos = (salarioBruto*(IRPS+INSS));
        salarioLiquido = salarioBruto - descontos;
        System.out.println("O Funcionário " + nome + " trabalhou " + horasTrabalhadas + " horas, o que correspode a um salario bruto de " + 
        salarioBruto + "Mt, que com o desconto de "+ descontos + "Mt, correspondentes ao IRPS e ao INSS, receberá "+ salarioLiquido + "Mt.");

        teclado.close();
    }
}