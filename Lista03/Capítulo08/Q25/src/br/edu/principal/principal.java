package br.edu.principal;
import java.util.Scanner;

public class principal{
	 public static void substituirNegativosPorZero(int[] vetor) {
    	for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] vetorA = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10, 11, -12, 13, -14, 15, -16, 17, -18, 19, -20, 21, -22, 23, -24, 25};

        System.out.println("Vetor original:");
        for (int valor : vetorA) {
            System.out.print(valor + " ");
        }

        substituirNegativosPorZero(vetorA);

        System.out.println("\nVetor após substituição de negativos por zero:");
        for (int valor : vetorA) {
            System.out.print(valor + " ");
        }
    }

    }
