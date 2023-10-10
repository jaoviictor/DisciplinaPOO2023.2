package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double pes, polegadas, jardas, milhas;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite a quantidades de pés: ");
		pes = sc.nextDouble();
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1.760;
		System.out.println("conversão de pés para polegadas é: "+polegadas);
		System.out.println("conversão de pés para jardas é: "+ jardas);
		System.out.println("conversão de pés para milhas é: "+ milhas);


	}

}
