package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);

		int coluna= 3;
		int linha =10;
		int q1, q2, q3, menor, p_menor = 0, i, j ;

		int [] [] notas  = new int [linha][coluna];

		for( i = 1; i< 10;i++){
		      for (j= 1;j < 3;j++){
		 System.out.print("Digite sua primeira nota");
		i=sc.nextInt ();
		System.out.print ("Digite  sua segunda nota");
		j=sc.nextInt ();

		 }
		}
		q1 = 0;
		q2 = 0;
		q3 = 0;
		for( i = 1; i<10;i++){
		 System.out.print ("Valor da primeira nota"+i);

		menor = notas[i][1] ;
		p_menor = 1;
		for(j = 1;j< 3;j++){
		 }
		 if (notas[i][j]< menor) {
			 menor= notas[i][j] ;
		 p_menor =j;

		 }
		}
		System.out.print("O menor :"+ p_menor);

		 if( p_menor ==1){

		 q1 = q1 + 1 ;
		}if( p_menor == 2){
		  q2 = q2 + 1;
		}
		 if( p_menor == 3){

		 q3 = q3 + 1;
		}
		System.out.println("prova 1"+q1);

	}

}
