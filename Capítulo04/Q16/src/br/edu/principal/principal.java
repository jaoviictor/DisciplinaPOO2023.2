package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double pre, venda;
		double  novo_pre= 0;
		System.out.println("Digite seu preço:");
		pre=sc.nextDouble();
		System.out.println(" Digite sua venda:");
	    venda=sc.nextDouble();
	    
	    if(venda<500 || pre<30) {
	    	novo_pre = pre + 15/100*pre;
	    	
	    }else if ((venda>=500 & venda<1200)||( pre>=30 & pre<80)){
	    	novo_pre = pre + 15/100 * pre;	
	    }else if (venda>=1200 || pre>=80) {
	         novo_pre = pre - 20/100 * pre;      
	    } 
	    System.out.print("Seu novo preço"+ novo_pre);   	
	    }
}


