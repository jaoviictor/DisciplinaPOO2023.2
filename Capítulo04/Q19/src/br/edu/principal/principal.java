package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double altura,peso;
		
		System.out.print("Digite sua alura:");
		altura=sc.nextDouble();
		System.out.print("Digite seu peso:");
		peso=sc.nextDouble();
		
		if(altura<1.20) {
			
		}if(peso<=60) {
			System.out.print("A");
		}if(peso>60 & peso <=90) {
			System.out.print("D");
		}if (peso >90) {
			System.out.print("G");
	
		}if (altura>=1.20 & altura<=1.70) {
		}if (peso<=60) {
			 System.out.print("B");
			 
		}if (peso>60 & peso <=90) {
		System.out.print("E");
	
		}if (peso>90) {
	System.out.print("H");
}if (altura>1.70) {
}if(peso<=60) {
		System.out.print("C");
}if (peso>60 & peso<=90) {
			System.out.print("F");
}if(peso>90) {
				System.out.print("I");
			}
		}
	}

		     
		 

     

		
	
	 