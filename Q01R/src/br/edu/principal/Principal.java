package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1, n2, n3, n4, soma;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua nota da n1:");
		n1= sc.nextDouble();
		System.out.print("Digite sua nota da n2:");
		n2 = sc.nextDouble();
		System.out.print("Digite sua nota da n3:");
		n3 = sc.nextDouble();
		System.out.print("Digite sua nota da n4:");
		n4 = sc.nextDouble();
		soma = n1 + n2 + n3 + n4;
		System.out.print("Sua media é:"+ soma );

	}

}
