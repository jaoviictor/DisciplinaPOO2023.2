package br.edu.principal;
import java.util.Scanner;
import java.lang.String;
public class principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		double sal_min, nht, coeficiente = 0, sal_bruto,imposto, grat, auxilio, sal_liq;
		String  turno = "" ;   
		String categoria ="";
		
		System.out.print("Digite seu salario minimo :");
		sal_min=sc.nextDouble();
		System.out.print(" Digite seu turno:");
		turno =sc.next();
		System.out.print(" Digite sua categoria:");
		categoria=sc.next();
		System.out.print("Digite o numero de horas trabalhadas:");
		nht = sc.nextDouble();
		
		
		if (turno == "M") {
			coeficiente = 10/100* sal_min;
		}if (turno== "V") {
			coeficiente = 15/100 * sal_min;
		}if (turno== "N") {
			coeficiente = 12/100*sal_min;
		}
		System.out.println(" O coeficiente será:" + coeficiente);
		
		sal_bruto=nht* coeficiente;
		System.out.println("O valor do salario bruto: "+sal_bruto);
	
	if (categoria == "O") {
		
	}if(sal_bruto>=300) {
		imposto=5/100*sal_bruto;
	}else {
		imposto =3/100*sal_bruto;
	}
	System.out.println("O valor do imposto"+imposto);
	
	if(turno =="N" & nht>80 ) {
		
		grat=50;
	}else {
		grat=30;
	}
	System.out.println("Valor de grat:"+grat);
	if (categoria == "O" || coeficiente<=25) {
		auxilio =1/3*sal_bruto;
	}else {
		auxilio =1/2 *sal_bruto;
	}
	System.out.println("O auxilio : "+auxilio);

	sal_liq=sal_bruto-imposto;
	System.out.println("O salario liquido :"+sal_liq);
	 
	if (sal_liq<350) {
		System.out.println("mal remunerado");
	}if (sal_liq >=350 & sal_liq <=600) {
		System.out.println("Normal");
	}if(sal_liq >600) {
		System.out.println("Bem renumerado");
	}
	}

}
