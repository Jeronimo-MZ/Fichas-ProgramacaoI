import java.util.Scanner;

public class TransaacaoATM {
    public static void main(String args[]) {
        final Scanner teclado = new Scanner(System.in);
        double saldo = 0d, valor = 0d;
        int opcao;
        
        System.out.println("Insira o nome do Titular da conta: ");
        final String nome = teclado.nextLine();

        do {
            System.out.println("Escolha 1 Para retirar");
            System.out.println("Escolha 2 Para deposito");
            System.out.println("Escolha 3 Para verificar o saldo");
            System.out.println("Escolha 4 Para SAIR");
            do{
                System.out.print("Escolha a opção que você deseja realizar: ");
                opcao = teclado.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("==============================================");
                        System.out.println("O saldo actual é: " + saldo);
                        System.out.println("Insira o valor a retirar: ");
                        valor = teclado.nextFloat();
                        if (saldo - valor < 0) {
                            System.out.println("Operação negada! O saldo é insuficiente!");
                        } else if (valor < 0){
                            System.out.println("Operação negada! Sem brincadeiras no Banco!");
                        }else{
                            System.out.println("Operação bem sucedida!");
                            saldo -= valor;
                        }
                        System.out.println("==============================================");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("==============================================");
                        System.out.println("Insira o valor a depositar: ");
                        valor = teclado.nextDouble();
                        if (valor < 0){
                            System.out.println("Operação negada! não pode depositar valores negativos!");
                        }else{
                            saldo += valor;
                            System.out.println("Operação Concluida!");
                        }
                        System.out.println("==============================================");
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("==============================================");
                        System.out.println("Titular da conta: " + nome);
                        System.out.println("O saldo actual é: " + saldo);
                        System.out.println("==============================================");
                        System.out.println();
                        break;
                    case 4:
                        System.out.println();
                        System.out.println("Obrigado! Volte Sempre!");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente!");
                        System.out.println();
                }
            
            }while(opcao<1 || opcao>4);
        }while(opcao != 4);

        teclado.close();
    }
}