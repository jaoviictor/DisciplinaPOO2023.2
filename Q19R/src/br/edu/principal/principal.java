package br.edu.principal;

import java.util.Scanner;

public class principal {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a_degrau, a_usuario, qtd_degraus;
	System.out.print("Informe a altura de cada degrau (em metros): ");
	a_degrau = sc.nextDouble();
	System.out.print("Informe a altura que o usu�rio deseja alcan�ar (em metros): ");
	a_usuario = sc.nextDouble();
	qtd_degraus = a_usuario/a_degrau;
	System.out.println("O usu�rio precisar� subir " + Math.ceil(qtd_degraus) + " degraus para alcan�ar a altura desejada.");

}
}
