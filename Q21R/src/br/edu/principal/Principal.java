package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double alt_quad, distância_escada, tamanho_escada;
		Scanner sc  = new Scanner(System.in);
		System.out.print("Digite o tamanho da escada:");
		tamanho_escada = sc.nextDouble();
		System.out.print("Digite a altura que você deseja colocar o quadro:");
		alt_quad = sc.nextDouble();
		distância_escada = Math.pow(tamanho_escada,2) - Math.pow(alt_quad, 2);
		distância_escada = Math.sqrt(distância_escada);
		System.out.print("A distância que deverá ficar da escada é:"+distância_escada);

	}

}
