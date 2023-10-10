package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matriculasLogica = new int[15];
        int[] matriculasProgramacao = new int[10];

        System.out.println("Informe os números de matrícula dos alunos que cursam Lógica:");

        for (int i = 0; i < 15; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            matriculasLogica[i] = scanner.nextInt();
        }

        System.out.println("Informe os números de matrícula dos alunos que cursam Linguagem de Programação:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            matriculasProgramacao[i] = scanner.nextInt();
        }

        System.out.println("Números de matrícula que aparecem em ambos os vetores:");

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriculasLogica[i] == matriculasProgramacao[j]) {
                    System.out.println(matriculasLogica[i]);
                }
            }
        }

        scanner.close();
    }
}