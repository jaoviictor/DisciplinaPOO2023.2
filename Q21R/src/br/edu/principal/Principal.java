package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double alt_quad, dist�ncia_escada, tamanho_escada;
		Scanner sc  = new Scanner(System.in);
		System.out.print("Digite o tamanho da escada:");
		tamanho_escada = sc.nextDouble();
		System.out.print("Digite a altura que voc� deseja colocar o quadro:");
		alt_quad = sc.nextDouble();
		dist�ncia_escada = Math.pow(tamanho_escada,2) - Math.pow(alt_quad, 2);
		dist�ncia_escada = Math.sqrt(dist�ncia_escada);
		System.out.print("A dist�ncia que dever� ficar da escada �:"+dist�ncia_escada);

	}

}
