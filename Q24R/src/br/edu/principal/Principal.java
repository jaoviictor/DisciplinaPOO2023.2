package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double hora, h, conversao;
		int m;
		Scanner sc  = new Scanner(System.in);
		System.out.print("Digite a hora:");
		hora = sc.nextDouble();
		h = (int)hora;
		m = (int) (hora - h);
		conversao = (h*60) + (m * 100);
		System.out.print("Conservação da horas para minutos:"+ conversao);
	}

}
