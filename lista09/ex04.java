package lista09;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[5][4];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if(j == 0) {
                    System.out.print("Informe a matrícula do aluno: ");
                    matriz[i][j] = sc.nextInt();
                } else if(j == 1) {
                    System.out.print("Informe a média das provas: ");
                    matriz[i][j] = sc.nextInt();
                } else {
                    System.out.print("Informe a média dos trabalhos: ");
                    matriz[i][j] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            matriz[i][3] = matriz[i][1] + matriz[i][2];
        }

        int maior = matriz[0][3];
        int maiorMat = matriz[0][0];

        for (int i = 1; i < 5; i++) {
            if(matriz[i][3] > maior) {
                maior = matriz[i][3];
                maiorMat = matriz[i][0];
            }
        }

        System.out.println("Matrícula com a maior nota : " + maiorMat);

        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += matriz[i][3];
        }

        System.out.println("Média aritmética: " + soma / 5);
    }
}