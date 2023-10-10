package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int hora_Inicio, min_Inicio, hora_Fin, min_Fin, hora_Durac, min_Durac;
	        
	        System.out.println("Digite o horário inicial: ");
	        System.out.print("hora: ");
	        hora_Inicio = sc.nextInt();
	        System.out.print("minuto: ");
	        min_Inicio = sc.nextInt();
	        
	        System.out.println("Digite o horário final: ");
	        System.out.print("hora: ");
	        hora_Fin = sc.nextInt();
	        System.out.print("minuto: ");
	        min_Fin = sc.nextInt();
	        
	        if (min_Inicio > min_Fin) {
	            min_Fin += 60;
	            hora_Fin--;
	        }
	        
	        if (hora_Inicio > hora_Fin) {
	            hora_Fin += 24;
	        }
	        
	        min_Durac = min_Fin - min_Inicio;
	        hora_Durac = hora_Fin - hora_Inicio;
	        
	        System.out.println("O jogo durou " + hora_Durac + " hora(s) e " + min_Durac + " minuto(s).");
	}

}
