package br.edu.principal;
import java.util.Scanner;
public class principal {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double sal, qtd, tipo = 0, valor_kw, gasto, acresc = 0,total = 0, tot_geral, qtd_cons;

	tot_geral = 0 ;
	qtd_cons = 0 ;

	System.out.print("Digite o salário mínimo");
	sal=sc.nextDouble();
	System.out.print ("Digite a quantidade:");
	qtd=sc.nextDouble ();

	valor_kw = sal / 8 ;
	while (qtd !=8){ 

	gasto =qtd * valor_kw ;

	System.out.print ("Digite o tipo:");

	if( tipo == 1){
	 acresc = gasto * 5 / 100 ;
	}
	if (tipo ==2){
	acresc = gasto * 10 / 100 ;
	}
	if(tipo == 3){
	 acresc = gasto * 15 / 100 ;
	total = gasto + acresc;
	tot_geral =tot_geral + total ;
	}
	if(total >= 500 & total <= 1000){
	 qtd_cons =qtd_cons + 1 ;
	System.out.println("Os gastos:"+gasto);
	System.out.println("O acréscimo :"+acresc );
	System.out.println("O total :"+ total);
	System.out.print ("Digite a quantidade:");
	qtd=sc.nextDouble();
	}
	    }
	 }
}

