package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner (System.in);

		int fim = 0, i, j, x, expoente , num_termos ,   den = 0, denominador, fat = 0,s;

		System.out.print("Digite o  númerode termo:");
		num_termos=sc.nextInt ();
		System.out.print ("Digite um valor positivo:");
		x=sc.nextInt ();

		s = 0;
		denominador = 1;
		for( i = 1; i < num_termos; i++){

		fim = denominador;
		fat = 1;
		}
		for( j = 1; j < fim;j++){ 

		fat = fat * j;
		}
		expoente =i + 1 ;

		if ((expoente/2) == 0 ){
		 s = s -  expoente /fat;
		}
		else { 
		s =s + expoente/fat;
		}
		if (denominador ==4){

		den = -1;
		}
		if (denominador ==1){

		den =1 ;
		}
		if( den==1 ){
		 denominador =denominador + 1 ;
		}
		else {
		denominador = denominador - 1 ;
		}
		System.out.print("O valor da série A seguir:"+s);
	}

	

}
