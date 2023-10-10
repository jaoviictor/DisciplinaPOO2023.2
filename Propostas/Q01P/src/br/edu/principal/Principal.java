package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite o primeiro número: ");
			double numero1 = scanner.nextDouble();

			System.out.print("Digite o segundo número: ");
			double numero2 = scanner.nextDouble();

			double resultado = numero1 - numero2;

			System.out.println("A subtração de " + numero1 + " - " + numero2 + " é igual a " + resultado);
		}
    }
}