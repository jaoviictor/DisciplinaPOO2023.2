package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double dep, taxa, rend, total;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do deposito: ");
		dep = sc.nextDouble();
		System.out.print("Digite o valor da taxa de juros: ");
		taxa = sc.nextDouble();
		rend = dep * taxa/100;
		total = dep + rend;
		System.out.println("O valor do seu rend: "+ rend);
		System.out.print("O valor total: "+ total);

	}

}
