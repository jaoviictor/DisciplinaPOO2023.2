package br.edu.principal;

import java.util.Scanner;

public class Principal {
    private static String temperaturaFamhrenhit;

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
double temperaturaCelsius, temperaturaFahrenheit;
        
        System.out.print("Digite a temperatura em Celsius: ");
    temperaturaCelsius = sc.nextDouble();
        
 temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        
        System.out.println("A temperatura em Fahrenheit é:" +temperaturaFamhrenhit);
    }
}