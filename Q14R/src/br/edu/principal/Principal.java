package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int ano_atual, ano_nascimento, idade_atual, idade_2050;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o ano atual:");
		ano_atual = sc.nextInt();
		System.out.print("Digite seu ano de nascimento:");
		ano_nascimento = sc.nextInt( );
		idade_atual = ano_atual - ano_nascimento;
		idade_2050 = 2050 - ano_nascimento;
		System.out.println("Sua idade �: "+ idade_atual);
		System.out.print("Sua idade em 2050 �:"+idade_2050);

		    }
		}
