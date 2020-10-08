import java.util.Random;

public class CartoesLoteria {
    public static void main(String[] args) {
        Random R = new Random();
        int numeroCartao;
        for (int i = 1; i <=5; i++){
            numeroCartao = (int) (R.nextDouble() * 1000000);
            System.out.printf("cartão %d: %06d%n", i, numeroCartao);
        }
    }
}
