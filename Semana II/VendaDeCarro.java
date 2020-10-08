import java.util.Scanner;
public class VendaDeCarro {

    public static void main(String args[]) {
        double cif, custoVeiculoNoParque, custoSeguros, custoFrete;
        double impostos, servicosImportacao, direitosAduaneiros, despesasBancarias;
        double transpasse, scannerCarro, servicosInatter, lucroVendedor, total;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o custo (preço) do veículo no parque de origem: ");
        custoVeiculoNoParque = teclado.nextDouble(); // preço do veículo
        System.out.print("insira o custo de seguros: ");
        custoSeguros = teclado.nextDouble();
        System.out.print("Insira o custo do Frete de transporte: ");
        custoFrete = teclado.nextDouble();
        cif = custoVeiculoNoParque + custoSeguros + custoFrete;

        System.out.print("Insira o Custo dos serviços de Importação: ");
        servicosImportacao = teclado.nextDouble();
        System.out.print("insira o Custo dos direitos aduaneiros: ");
        direitosAduaneiros = teclado.nextDouble();
        impostos = servicosImportacao + direitosAduaneiros;

        System.out.print("Insira o valor das despesas bancárias estipuladas pelo banco: ");
        despesasBancarias = teclado.nextDouble();
        System.out.print("Insira o valor do transpasse: ");
        transpasse = teclado.nextDouble();
        System.out.print("Insira o custo de Scanner do carro: ");
        scannerCarro = teclado.nextDouble();
        System.out.print("Insira o custo dos servoços do INATTER: ");
        servicosInatter = teclado.nextDouble();

        total = cif + impostos + despesasBancarias + transpasse + scannerCarro + servicosInatter;
        lucroVendedor = custoVeiculoNoParque * 0.07;

        System.out.println("No total, para o carro que custa "+custoVeiculoNoParque+"Mt, o comprador irá pagar "+
        total+"Mt, e o vendedor terá um lucro de "+ lucroVendedor+"Mt.");


        teclado.close();

    }
}
