package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num1, num2, r1, r2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu primeiro numero:");
		num1 = sc.nextDouble();
		System.out.print("Digite seu segundo numero:");
		num2 = sc.nextDouble();
		r1 = Math.pow(num1,num2);
		r2 = Math.pow(num2,num1);
		System.out.println("O primeiro número elevado ao segundo é: "+r1);
		System.out.println("O segundo número elevado ao primeiro é: "+r2);

	}

}
