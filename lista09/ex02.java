package lista09;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Insira um valor na matriz: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i > j) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("Soma dos valores abaixo da diagonal principal: " + soma);

    }
}