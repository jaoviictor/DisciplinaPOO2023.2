package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
double cateto_1, cateto_2, hipotenusa;
        System.out.print("Digite o valor do primeiro cateto: ");
     cateto_1 = scanner.nextDouble();

      System.out.print("Digite o valor do segundo cateto: ");
 cateto_2 = scanner.nextDouble();
 hipotenusa = Math.sqrt(Math.pow(cateto_1, 2) + Math.pow(cateto_2, 2));

        System.out.println("O valor da hipotenusa é: " + hipotenusa);
    }
}