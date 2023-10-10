package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int[][] matriz = {
        {1, 2, 3, 4, 5, 6},
        {7, 8, 9, 10, 11, 12},
        {13, 14, 15, 16, 17, 18},
        {19, 20, 21, 22, 23, 24},
        {25, 26, 27, 28, 29, 30},
        {31, 32, 33, 34, 35, 36}
    };

    int menorDiagonalSecundaria = encontrarMenorDiagonalSecundaria(matriz);
    System.out.println("O menor elemento da diagonal secundária é: " + menorDiagonalSecundaria);
}

public static int encontrarMenorDiagonalSecundaria(int[][] matriz) {
    int menor = matriz[0][matriz.length - 1]; // Inicializa com o primeiro elemento da diagonal secundária

    for (int i = 1; i < matriz.length; i++) {
        int elementoDiagonalSecundaria = matriz[i][matriz.length - 1 - i];
        if (elementoDiagonalSecundaria < menor) {
            menor = elementoDiagonalSecundaria;
        }
    }

    return menor;
}

       

	

}
