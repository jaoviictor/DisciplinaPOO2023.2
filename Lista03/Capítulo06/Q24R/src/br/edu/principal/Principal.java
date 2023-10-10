package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 15;
        int[] vetorOriginal = new int[tamanho];
        int[] vetorResultante = new int[tamanho]; // O vetor resultante pode ter no máximo 15 elementos

        // Ler os números inteiros e armazená-los no vetor original
        System.out.println("Digite " + tamanho + " números inteiros:");
        for (int i = 0; i < tamanho; i++) {
            vetorOriginal[i] = scanner.nextInt();
        }

        int contadorPrimos = 0; // Contador de números primos no vetor resultante

        // Verificar se cada número do vetor original é primo e armazená-lo no vetor resultante, se for primo
        for (int i = 0; i < tamanho; i++) {
            if (ehPrimo(vetorOriginal[i])) {
                vetorResultante[contadorPrimos] = vetorOriginal[i];
                contadorPrimos++;
            }
        }

        // Exibir o vetor resultante contendo os números primos
        System.out.println("Números primos no vetor original:");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.print(vetorResultante[i] + " ");
        }

        scanner.close();
    }

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}