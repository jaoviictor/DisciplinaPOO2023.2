package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double ang, alt, escada, radiano;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do ângulo (em graus): ");
		ang = sc.nextDouble();
		System.out.print("Digite o valor da altura: ");
		alt = sc.nextDouble();
		radiano = ang * 3.14 / 180;
		escada = alt / Math.sin(radiano);
		System.out.print("A medida da escada: "+escada);

	}

}
