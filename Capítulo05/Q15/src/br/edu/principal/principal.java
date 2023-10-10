package br.edu.principal;
import java.util.Scanner;
import java.lang.String;
public class principal {

	public static void main(String[] args) {
		
  	Scanner sc =new Scanner (System.in);

		int i, preco = 0, custo_est, imp, preco_final = 0, adicional;
		double maior_p = 0, menor_p = 0, tot_imp, qtd_b, qtd_n, qtd_c;
		String refri="";
		String categ ="";

		adicional = 0;
		tot_imp =0;
		qtd_b = 0;
		qtd_n = 0;
		qtd_c = 0;
		
		for( i =1; i < 12; i++){

		System.out.print("Digiteo preço:");
		preco=sc.nextInt();
		System.out.print("Digite o refrigeração:");
		refri=sc.next();
		System.out.print ("Digite a categoria:");
		 categ=sc.next();
		 
		}if (preco <= 20){
		}if( categ =="A"){
		 custo_est = 2;
		}if( categ == "L"){
		custo_est = 3;
		}if( categ == "V"){
		 custo_est = 4;
		}
		if(preco > 20 & preco <= 50){
		}if( refri == "S"){
		custo_est = 6;
		}else{
		custo_est =0;
		}

		if (preco > 50){
		}if( refri =="S"){
		}if( categ == "A"){
		custo_est =5;
		}
		if( categ == "L"){
		custo_est = 2;
		}
		if( categ == "V"){
		custo_est = 4;
		}

		else if (categ =="A" ||categ == "V"){
		custo_est = 0;
		}
		if( categ =="L"){
		 custo_est = 1;
		}

		if(categ != "A" & refri !="S"){
		 imp = preco * 2 / 100;
		}
		else{
		 imp = preco * 4 / 100;
		preco_final =preco + custo_est + imp;
		System.out.println("O custo de Estado "+custo_est);
		System.out.println("O imposto será:"+imp);
		System.out.println("O preço final :"+preco_final);
		}
		if (preco_final <= 20){
		qtd_b = qtd_b + 1;
		System.out.println("Classificação Barato");
		}
		if(preco_final > 20 & preco_final <= 100){

		qtd_n = qtd_n + 1;
		System.out.println("Classificação Normal");
		}
		if(preco_final > 100){
		qtd_c =qtd_c + 1;
		System.out.println("Classificação Caro");
		}
		adicional = adicional + custo_est + imp;
		tot_imp =  tot_imp = imp;
		if( i == 1){

		maior_p = preco_final;
		menor_p = preco_final;
		}
		else if ( preco_final > maior_p){
		 maior_p = preco_final;
		}
		if(preco_final < menor_p){
		menor_p = preco_final;
		}
		adicional = adicional / 12;
		System.out.println("Valor adicional:"+adicional);
		System.out.println ("O maior preço "+maior_p);
		System.out.println ("O menor preço "+menor_p);
		System.out.println("O total do imposto:"+tot_imp);
		System.out.println ("A quantidade de produtos com classificação barato"+qtd_b);
	}

}
