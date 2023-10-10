package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

	
		
		int n, num = 0, i, j, fat ;

		System.out.print("Digite qualquer  número :");
		n =sc.nextInt();

		for(i = 1 ; i < n; i++  ){

		System.out.println ("O número inteiro"+ n);

		fat =1;
		

		for( j = 1; j < num ; j++){

		fat =fat * j ;
		}

		System.out.println("O número positivo"+fat);

		}
		
	}
	}


