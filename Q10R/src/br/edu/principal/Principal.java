package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Double aréa, raio;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do raio:");
		raio = sc.nextDouble();
		aréa = 3.1415 * Math.pow(raio,2);
		System.out.println("O valor da area é "+ aréa);
	}

}
