package br.edu.principal;
import java.util.Scanner;
public class prinpal {

	public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   int dia_um, mes_um, ano_um, dia_dois, mes_dois, ano_dois;
   
   System.out.println("Digite a primeira data: ");
   System.out.print("Dia: ");
   dia_um = sc.nextInt();
   System.out.print("Mes: ");
   mes_um = sc.nextInt();
   System.out.print("Ano: ");
   ano_um = sc.nextInt();
   System.out.println(" ");
   System.out.println("Digite a segunda data: ");
   System.out.print("Dia: ");
   dia_dois = sc.nextInt();
   System.out.print("Mes: ");
   mes_dois = sc.nextInt();
   System.out.print("Ano: ");
   ano_dois = sc.nextInt();

   if (ano_um > ano_dois) {
    System.out.println("A maior data é: " + dia_um + "/" + mes_um + "/" + ano_um);
   }
   else if(ano_um < ano_dois) {
    System.out.println("A maior data é: " + dia_dois + "/" + mes_dois + "/" + ano_dois);
   } 
   else if (mes_um > mes_dois) {
    System.out.println("A maior data é: " + dia_um + "/" + mes_um + "/" + ano_um);
   }
   else if (mes_dois > mes_um) {
    System.out.println("A maior data é: " + dia_dois + "/" + mes_dois + "/" + ano_dois);
   }
   else if (dia_um > dia_dois) {
    System.out.println("A maior data é: " + dia_um + "/" + mes_um + "/" + ano_um);
   }
   else if (dia_dois > dia_um) {
    System.out.println("A maior data é: " + dia_dois + "/" + mes_dois + "/" + ano_dois);
   }
   else {
    System.out.println("As datas são iguais!");
   }
	}

}
