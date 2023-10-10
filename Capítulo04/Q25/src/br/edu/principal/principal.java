package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double  angulo , voltas;
		
		System.out.print("Digite o valor do angulo");
		angulo =sc.nextDouble();
		
		if (angulo>360 || angulo <-360) {
			
			voltas = (int)angulo/360;
			angulo=  angulo % 360;
			
		}else {
			voltas = 0;
		}if ((angulo == 0 || angulo == 90 || angulo ==180) || (angulo==270 ||angulo ==360)||(angulo == -90 || angulo == -180) ||(angulo == -270 || angulo == -360)) {
			System.out.println("Está em cima de algum dos eixos ");
			
		}if((angulo > 0 & angulo <90  || angulo==180)||(angulo < -270 & angulo > -270) ) {
			
			System.out.println("1 Quadrante");
		}if ((angulo > 90 & angulo < 180) || (angulo < -180 & angulo > -270)) {
			System.out.println("2 quadrante ");
		}if ((angulo > 180 & angulo < 270) || (angulo < -90 & angulo > -180)) {
			 System.out.println("3 quadrante ");
		}if((angulo > 270 & angulo < 360) || (angulo < 0 & angulo > -90)) {
			System.out.println("4 quadrante ");
		}
		
		System.out.print("volta(s) no sentido "+voltas);
		if (angulo<0) {
			System.out.println("horario");
		}else {
			System.out.println("anti-horario");
		}
		
		
		
		
		
		
	}

}
