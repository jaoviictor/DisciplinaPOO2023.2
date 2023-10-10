package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double base, altura, área;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor da base: ");
		base = sc.nextDouble();
		System.out.print("Digite o valor da altura: ");
		altura = sc.nextDouble();
		área =(base * altura)/2;
		System.out.print("O valor da área é: "+ área);

	}

}
