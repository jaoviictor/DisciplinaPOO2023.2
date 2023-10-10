package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);

		 int m, n, soma, i ;

		System.out.print("Digite um número inteiro");
		m=sc.nextInt();
		System.out.print ("Digite um número inteiro");
		n=sc.nextInt ();

		while( m < n){
		 
		soma =0;
		for( i=0; m < n;i++){

		soma = soma + i ;
		}
		System.out.print ("Valor da soma:"+soma );

		System.out.print("Digite um número inteiro");
		m=sc.nextInt();
		System.out.print ("Digite um número inteiro");
		n=sc.nextInt ();

	}

	}
}
