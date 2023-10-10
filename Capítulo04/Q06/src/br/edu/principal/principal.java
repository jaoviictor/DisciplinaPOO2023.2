package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		
		int num;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Digite um número: ");
	    num = sc.nextInt();
	    if(num%2 == 0){
	      System.out.print("O número é par");
	    }else{
	      System.out.print("O número é ímpar");
	    }
	}
}
