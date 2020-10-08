import java.util.Scanner;
public class GestaoSalarial {
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numFuncionarios, menor50Mil = 0, maior50Mil = 0;
        float salario, total=0;

        System.out.println("Insira o número de funcionários na empresa: ");
        numFuncionarios = teclado.nextInt();

        for (int i = 1; i <= numFuncionarios; i++){
            System.out.println("Insira o salario do " + i + "o funcionário: ");
            salario = teclado.nextInt();
            total += salario;

            if (salario < 50000) menor50Mil++;
            else maior50Mil++;
        }

        System.out.println("Número de funcionários com salário menor que 50000 mtn: "+ menor50Mil);
        System.out.println("Número de funcionários com salário maior ou igual  a 50000  mtn: "+ maior50Mil);
        System.out.println("Total gasto com pagamentos de salários: " + total + "mtn");
        teclado.close();
    }
}
