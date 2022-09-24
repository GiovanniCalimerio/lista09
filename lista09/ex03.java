package lista09;

import java.util.Random;
import java.util.stream.IntStream;

public class ex03 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int numGerados[] = new int[25];
        int ind = 0;

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                boolean condicao = true;
                int numero = 0;
                while(condicao) {
                    int numeroAleatorio = random.nextInt(99);
                    condicao = IntStream.of(numGerados).anyMatch(n -> n == numeroAleatorio);
                    numero = numeroAleatorio;
                }
                matriz[i][j] = numero;
                numGerados[ind] = numero;
                ind++;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}