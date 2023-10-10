package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		 
		int num1, num2, num3, num4;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite três números em ordem crescente: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        
        System.out.print("Digite um número (fora de ordem): ");
        num4 = sc.nextInt();
        
        System.out.print("A ordem decrescente é: ");
        
        if (num4 > num3) {
            System.out.println(num4 + "-" + num3 + "-" + num2 + "-" + num1);
        } else if (num4 > num2 && num4 < num3) {
            System.out.println(num3 + "-" + num4 + "-" + num2 + "-" + num1);
        } else if (num4 > num1 && num4 < num2) {
            System.out.println(num3 + "-" + num2 + "-" + num4 + "-" + num1);
        } else if (num4 < num1) {
            System.out.println(num3 + "-" + num2 + "-" + num1 + "-" + num4);
        }
	}

}
