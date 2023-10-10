package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		
		

		int i, num, qtde;

		System.out.print ("Digite um número:");
		num = sc.nextInt ();

		qtde = 0;
		for( i =1 ;i <num ;i++);

		if((num/i) == 0){
		 qtde =qtde + 1;
		}
		if (qtde > 2){
		System.out.println("Número não primo");
		}
		else {
		System.out.println("Número primo");
		}

		 
		
	}

}
