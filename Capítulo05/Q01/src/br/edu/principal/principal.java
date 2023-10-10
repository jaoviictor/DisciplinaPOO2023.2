package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double novo_salario, percentual,salario ;
		int i, ano_atual = 0 ;
		
		System.out.print("Digite o ano atual:" + ano_atual);
		
		 ano_atual =sc.nextInt();

		salario = 1000 ;
		percentual = 1.5/100;

		novo_salario  = salario + percentual * salario ;

		for(  i  =  2007; i < ano_atual; i++ ){
		System.out.println (i + "");
		}

		percentual = 2 * percentual;
		novo_salario =novo_salario + percentual * novo_salario ;

		System.out.println("Seu novo salário:"+novo_salario);

		}
	}


