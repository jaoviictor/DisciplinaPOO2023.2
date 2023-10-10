package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal, salreceber, grat, imp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do seu salário: ");
		sal = sc.nextDouble();
		grat = sal * 5/100;
		imp = sal * 7/100;
		salreceber = sal + grat - imp;
		System.out.println("O valor do salário a receber é: "+ salreceber);

	}

}
