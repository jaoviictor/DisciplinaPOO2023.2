package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int [][] num = new int [5][4];

		int num_aux = 0, i, j, k = 0, l = 0, m, n, lin, col;

		for( i = 1 ; i< 5 ;i++){

		for( j =1;j <4;j++){
		 System.out.println ("Digite um número auxilia " +  num_aux);

		if( i == 1 & j == 1){

		num[i][ j] = num_aux;
		}
		else {
		 k =1 ;
		 l = 1;
		}
		 while ( num[k][l] < num_aux & (k != i || l != j) ){

		 l = l + 1 ;
		if( l > 4 ){

		 k = k + 1 ;
		 l =1;
		 }
		}
		 m = i; 
		 n = j;
		 while (m != k || n  != j ){
		 if ( n-1 < 1 ){

		 lin = m-1;
		 col = 4 ;
		 }

		 else {

		 lin = m ;
		 col = n-1 ;
		 }
		 num[m][n] = num[lin][col] ;
		 n =n-1;
		 if ( n < 1){

		
		 n = 4;
		 m = m-1 ;
		 }
		}
		 num[k][l] = num_aux ;
		}
		}
		 
		for( i =1;i<5;i++){

		for(j =1;j<4;j++){
		 System.out.println ( "Elemento da posição "+ i+ "-"+ j + "="+ num[i][j]);
		
	}

		}
	}
}
