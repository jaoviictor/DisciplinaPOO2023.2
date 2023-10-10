package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double vlr_Sal, vlr_kw = 0.0, vlr_reais = 0.0, desc = 0.0, vlr_desc = 0.0;
        int qtdKw = 0;
        System.out.print("Digite o valor do seu salario minimo: ");
        vlr_Sal = sc.nextDouble();
        System.out.print("insira a quantidade de quilowatts consumida na residencia: ");
        qtdKw = sc.nextInt();
        vlr_kw = vlr_Sal / 5;
        vlr_reais = vlr_kw * qtdKw;
        desc = ( vlr_reais *15) / 100;
        vlr_desc = vlr_reais - desc;
        System.out.println("O valor de cada quilowatts: "+vlr_kw);
        System.out.println("O valor a ser pago por essa residencia: "+vlr_reais);
        System.out.println("O valor a ser pago com desconto de 15%: "+vlr_desc);

	}

}
