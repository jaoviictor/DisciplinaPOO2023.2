package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double peso_saco, racao_gato1, racao_gato2, total_final;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o peso do saco de ra��o: ");
		peso_saco = sc.nextDouble();
		System.out.print("Digite  a quantidade de ra��o para o primeiro gado: ");
		racao_gato1= sc.nextDouble();
		System.out.print("Digite a quantidade de ra��o para o gato 2: ");
		racao_gato2 = sc.nextDouble();
		racao_gato1 = racao_gato1 / 1000;
		racao_gato2 = racao_gato2 / 1000;
		total_final = peso_saco - 5 * (racao_gato1 + racao_gato2);
		System.out.print("A quantidade de ra��o em 5 dia �: "+ total_final);

	}

}
