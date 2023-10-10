package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int cod_prod, peso_quilos,cod_pais, peso_gramas, pre_total,
		imposto = 0, valor_total, pre_grama = 0;
		
		System.out.print("Digite o codigo do produto:");
		cod_prod=sc.nextInt();
		System.out.print("Digite o peso do quilo");
		peso_quilos=sc.nextInt();
		System.out.print("Digte o codigo do pais:");
		cod_pais=sc.nextInt();
		
		peso_gramas= peso_quilos*1000;
		
		System.out.println("O peso em gramas é:"+peso_gramas);
		 if (cod_prod >=1 & cod_prod<=4) {
			 pre_grama = 10;
		 }if (cod_prod >=5 & cod_prod<=7) {
			 pre_grama=25;
		 }if(cod_prod >= 8 & cod_prod <= 10) {
			 pre_grama = 35;
		 }
		pre_total=peso_gramas* pre_grama;
		System.out.println("O total será:"+ pre_total);
		
		if(cod_pais==1) {
			imposto=0;
		}if(cod_pais==2) {
			imposto=pre_total * 15/100;
			
		}if(cod_pais==3) {
			imposto = pre_total * 25/100;

		}
		System.out.println("Valor do imposto:"+ imposto);
		
		valor_total=pre_total+imposto;
		System.out.println("Valor total será:"+valor_total);
	}

}
