package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salario, cheque1, cheque2, cpmf1, cpmf2, saldo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do seu sal�rio:");
		salario = sc.nextDouble();
		System.out.print("Digite o valor do primeiro cheque:");
		cheque1 = sc.nextDouble();
		System.out.print("Digite o valor do segundo cheque:");
		cheque2 = sc.nextDouble();
		cpmf1 = cheque1 * 0.38 / 100;
		cpmf2 = cheque2 * 0.38 / 100;
		saldo =  salario - cheque1 - cheque2 - cpmf1 -cpmf2;
		System.out.print("Valor do seu saldo �:"+saldo);


	}

}
