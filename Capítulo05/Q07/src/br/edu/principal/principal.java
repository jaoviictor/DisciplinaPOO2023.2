package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);

		int cont, num1, num2, res;

		num1 = 0 ;
		num2 = 1 ;

		System.out.print ("Digite primeiro numero:");
		num1=sc.nextInt();
		System.out.print ("Digite segundo numero:");
		num2=sc.nextInt ();

		for ( cont =3 ; cont < 8;cont++){
		 
		res = num1 + num2;

		 System.out.println(""+res);
		num1 = num2;
		num2 =res;

		}

	}

}
