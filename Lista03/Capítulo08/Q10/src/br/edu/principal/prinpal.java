package br.edu.principal;
import java.util.Scanner;
public class prinpal {

	public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   int N = 5; // Você pode substituir N pelo valor desejado
   double resultado = calcularSerie(N);
   System.out.println("O valor de S para N = " + N + " é: " + resultado);
}

public static double calcularSerie(int N) {
   double S = 1.0;
   double fatorial = 1.0;

   for (int i = 1; i <= N; i++) {
       fatorial *= i;
       S += 1.0 / fatorial;
   }

   return S;
}

	}


