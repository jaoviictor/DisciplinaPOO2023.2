package br.edu.principal;
import java.util.Scanner;
class principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		int num, soma, qtd, maior = 0, menor = 0, qtd_par;
		double media_par, soma_par, qtd_impar, media, perc;

		qtd = 0 ;
		qtd_par =0 ;
		soma_par =0 ;
		qtd_impar =0 ;
		soma =0;

		System.out.print ("Digite um número ");
		num=sc.nextInt();

		while (num != 30000 ){
		}
		if(qtd == 0 ){
		maior = num ;
		menor = num;
		}
		else if ( num > maior){
		maior = num ;
		}
		if(num < menor){
		menor = num;
		}

		soma =soma + num ;
		qtd = qtd + 1;

		if ((num/2) ==0){

		soma_par = soma_par + num ;
		qtd_par =qtd_par + 1;
		}
		else{ 
		qtd_impar = qtd_impar + 1 ;
		System.out.print ("Digite um número:"+num);
		num=sc.nextInt ();
		}
		if( qtd == 0){
		 System.out.print ("Nenhum número digitado" );
		}else{
		System.out.println ("Ressaltado da soma"+soma );
		System.out.println("As quantidades:"+qtd);
		media =soma / qtd ;
		System.out.println("A média será:"+media );
		System.out.println("O maior número "+ maior );
		System.out.println("O menor  número:"+ menor );
		}
		if( qtd_par == 0){
		 System.out.println("nenhum par" );
		}
		else{
		media_par = soma_par / qtd_par ;
		System.out.println("A média do par "+media_par);

	}

}}
