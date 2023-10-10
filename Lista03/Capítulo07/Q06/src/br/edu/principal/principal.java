package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [] [] a = new int [4][5];

		int [] [] b = new int [5][2];

		int [] [] c= new int [4][2];

		int i, j, k, soma, mult;

		for(i =1;i< 4;i++){

		 for ( j =1; j < 5;j++){
		 System.out.print(" Preencha primeira  matriz" + a[i][j]);
		 a[i][j] = sc.nextInt ();
		 }
		}
		for( i =1 ; i <5;i++){
		 
		for ( j = 1;j< 2;j++){
		System.out.print ("Preencha a segunda matriz"+b[i][j]);
		 b[i][j]= sc.nextInt ();
		 }
		}
		soma = 0;
		for ( i = 1;i<4 ;i++){

		for (k = 1;k< 2;k++) {
		for (j =1;j <5;j++){
		 
		 mult =a[i][j] * b[j][ k];
		 soma = soma + mult;
		 }
		 c[i][k] = soma;
		 soma = 0;
		 }
		}
		for( i = 1;i <4; i++){

		 for( j = 1;i<2;i++) {
		System.out.println ("Valor da matriz de c"+c[i][j]);
		
	}

}
	}
}
