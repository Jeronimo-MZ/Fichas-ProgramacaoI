import java.util.Scanner;

public class CoordenadasDoPonto {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float x, y;
        System.out.println("Insira as valores de X e Y, nessa ordem, separados por um espaço: ");
        x = input.nextFloat();
        y = input.nextFloat();

        if (x == 0 && y == 0){
            System.out.println("O ponto está na Origem");
        }else if (x == 0 && y !=0){
            System.out.println("O ponto está no Eixo Y");
        }else if (x !=0 && y == 0){
            System.out.println("O ponto está no Eixo X");
        }else if (x>0 && y>0){
            System.out.println("O ponto está no Primeiro Quadrante");
        }else if (x <0 && y >0){
            System.out.println("O ponto está no Segundo Quadrante");
        }else if (x<0 && y<0){
            System.out.println("O ponto está no Terceiro Quadrante");
        }else if ( x > 0 && y < 0){
            System.out.println("O ponto está no Quarto Quadrante");
        }
        input.close();
    }


}