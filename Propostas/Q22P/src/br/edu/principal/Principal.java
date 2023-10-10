package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int numeroLados, numeroDiagonais;
			        System.out.print("Digite o número de lados do polígono convexo: ");
			        numeroLados = sc.nextInt();
			        
			        if (numeroLados < 3) {
			            System.out.println("Um polígono convexo deve ter pelo menos 3 lados.");
			        } else {
			            numeroDiagonais = (numeroLados * (numeroLados - 3)) / 2;
			            System.out.println("O número de diagonais do polígono é: " + numeroDiagonais);
			        }
		}
    }
}