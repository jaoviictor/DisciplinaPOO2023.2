package br.edu.principal;
import java.util.Scanner;
import java.lang.String;

public class principal {

	public static void main(String[] args) {
		

		Scanner sc =new Scanner (System.in);

		int i, num_cri , meses = 0 , porc_f, porc_m, tot_f;
		double tot_m, tot_24, porc_24;
		String sexo = "";

		
		System.out.println ("Digite o número de crianças nascidas no período ");
	    porc_m = sc.nextInt();
		System.out.println("Digite o número de crianças ");
		num_cri = sc.nextInt();
		
		tot_m = 0 ;
		tot_f = 0 ;
		tot_24 = 0;
		
		for(i = 1 ;i < num_cri; i++) {
		System.out.println("Digite o sexo da "+ i+ "a criança");
		sexo=sc.next();
		System.out.println ("Digite o tempo de vida (em meses) da "+i+"a criança");
	    System.out.println ("Digite o mês:");
         meses=sc.nextInt();
		}if( sexo == "M"){
		 tot_m = tot_m + 1 ;
		}
		if( sexo == "F"){
		 tot_f =tot_f + 1 ;
		}
		if(meses <= 24){
		 tot_24 = tot_24 + 1;
		}
		if( num_cri == 0){
		System.out.println("NENHUMA CRIANÇA DIGITADA" );
		}else{
		porc_m = (int) (tot_m * 100 / num_cri) ;
		porc_f = tot_f * 100 / num_cri ;
		porc_24 =tot_24 * 100 / num_cri;
		System.out.println ("Percentual de crianças do sexo feminino mortas "+ porc_f );
		System.out.println ("Percentual de crianças do sexo masculino mortas "+porc_m);
		System.out.println ("Percentual de crianças com 24 meses ou menos mortas Ê no período "+ porc_24);

		
		}
	}
}
		
		
		
		
		
		
		   
		
		
		
		
		
		
		
