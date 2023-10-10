package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int hora, minutos, horasEmMinutos = 0, totalMinutos, totalSegundos;
        System.out.print("Digite a hora: ");
         hora = sc.nextInt();

        System.out.print("Digite os minutos: ");
         minutos = sc.nextInt();

        
        Object horaEmMinutos = hora * 60;

        totalMinutos = horasEmMinutos + minutos;

        totalSegundos = totalMinutos * 60;

        System.out.println("Hora em minutos: " + horaEmMinutos);
        System.out.println("Total de minutos: " + totalMinutos);
        System.out.println("Total de segundos: " + totalSegundos);
    }
}