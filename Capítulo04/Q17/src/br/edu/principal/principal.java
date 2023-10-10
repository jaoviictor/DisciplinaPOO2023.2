package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a , b, c, delta, x1, x2;
		
		System.out.println(" Digite o valor de a :");
		a=sc.nextDouble();
		System.out.println(" Digite o valor de b :");
		b = sc.nextDouble();
		System.out.println(" Digite o valor de c :");
		c=sc.nextDouble();

		if (a = 0) {
			System.out.println("Estes valores não formam uma equação de segundo grau");	
		}else {
			delta=((b*b)-(4*a*c));
		}if (delta=0) {
			System.out.println("Existe uma raiz real");
			x1 = (-b)/(2*a);
			System.out.print("Valor de x1:" + x1);
		}if(delta>0) {
			System.out.print("Existem duas raízes reais");
		x1=(-b + Math.sqrt(delta) / ( 2 * a ) );
		x2 =(- b -  Math.sqrt(delta) / ( 2 * a));
		System.out.println(" O valor de x1 :");
		System.out.println(" O vlor de x2 :");
		}
		
		
		
		
	}

}
