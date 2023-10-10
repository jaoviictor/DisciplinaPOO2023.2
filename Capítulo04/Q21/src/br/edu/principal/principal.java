package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in) ;
		
	int codE,codC,pesoTo,pesoquilos,preC = 0,imposto = 0,valorTotal;
	
	System.out.print("Digite o codigo de estado:");
	codE=sc.nextInt();
	System.out.print("Digite o peso das toneladas:");
	pesoTo=sc.nextInt();
	System.out.print("Digite o codigo de carga:");
	codC=sc.nextInt();
	
	pesoquilos=pesoTo*1000;
	System.out.println("O peso de quilos :"+pesoquilos);
	
    if (codC  >=10 & codC<=20 ) {
    	preC=100*pesoquilos;
    }if (codC >= 21 & codC<=30) {
    	preC=250*pesoquilos;
    }if (codC>=31 & codC<=40 ) {
    	preC=340*pesoquilos;
    	
    } 	System.out.println("Valor da pre carga será:"+preC);
	 if (codE==1) {
		 
		imposto=35/100*preC;
	 }if(codE==2) {
		 imposto =25/100*preC;
	 }if (codE==3) {
		 imposto= 15/100*preC;
	 }if(codE==4) {
		 imposto =5/100*preC;
	 }if(codE == 5) {
		 imposto=0;
	 }	System.out.println("Valor do imposto:"+imposto);
	
	valorTotal =preC + imposto;
	System.out.println("O valor total :"+valorTotal);
	
	
	
	}
	
	
	

}
