import java.util.Random;
public class SimuladorDeDados {
    public static void main(String args[]){
        Random dado = new Random();
        System.out.println("Simulando Dados...");
        for (int i = 1; i <= 10; i++){
            System.out.println("Jogada " + i + ": " + (dado.nextInt(6)+1));
        }
    }
}