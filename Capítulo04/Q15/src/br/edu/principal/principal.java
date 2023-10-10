package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double sal_min, nht, ndep, nhet;
		double sal_receber, vh, smes, vdep, vhe, imp;
	    double sbruto, grat;
	    double sliq=0;
	   
	    System.out.println(" Digite o valor do seu salario minimo:");
	    sal_min = sc.nextDouble();
	    System.out.println(" Digite o numero de horas trabalhadas:");
	    nht = sc.nextDouble();
	    System.out.println(" Digite o numeros de dependentes do funcionario:");
	    ndep =sc.nextDouble();
	    System.out.println(" Digite a qualidade e a qualidade de horas extras trabalhadas:");
	    nhet = sc.nextDouble();
	//calculos
	    vh = 1/5 * sal_min;
	    smes = nht * vh;
	    vdep = 32 * ndep;
	    vhe = nhet * (vh + (vh * 50/100));
	    sbruto = smes + vdep + vhe;
	
	    if (sbruto<200) {
	    	imp=0;
	    }if (sbruto>=200 & sbruto <=500) {
	    	imp = sbruto *10/100;
	    }if (sbruto >500) {
	    	imp = sbruto* 20/100;
	    	sliq = sbruto - imp;
	    }if (sliq <=350) {
	    	grat=100;
	    }if (sliq>350) {
	    
	      grat=50;
sal_receber = sliq + grat;
System.out.print("Salario á receber será:"+ sal_receber);}
	}
	
}
	

