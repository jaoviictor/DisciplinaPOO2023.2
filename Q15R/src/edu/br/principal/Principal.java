package edu.br.principal;

import java.util.Scanner;

public class Principal {
public static void main(String[] args){
	double p_fab, perc_d, perc_i, vlr_d, vlr_i, p_final;
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite o valor de fábrica: ");
	p_fab = sc.nextDouble();
	System.out.print("Digite o percentual do lucro: ");
	perc_d = sc.nextDouble();
	System.out.print("Digite o percentual dos impostos: ");
	perc_i = sc.nextDouble();
	vlr_d = p_fab * perc_d / 100;
	vlr_i =  p_fab * perc_i / 100;
	p_final  = p_fab + vlr_d + vlr_i;
	System.out.println("O valor de lucro do distribuídor: "+vlr_d);
	System.out.println("O valor dos impostos: "+ vlr_i);
	System.out.print("O valor do preço final é: "+p_final);
	
	
	
	
	
	
}
}
