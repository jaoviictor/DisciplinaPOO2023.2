package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);

		double cont, n1, n2, media = 0, ta = 0 , te = 0, tr = 0,media_classe, total_classe;

		total_classe = 0;

		for( cont = 1;cont < 6;cont++){
		System.out.print ("Digite a nota da n1:");
		n1=sc.nextDouble ();
		System.out.print ("Digite a nota da n2:");
		n2=sc.nextDouble();

		media = (n1 + n2) /2 ;
		System.out.println ("Sua media será:"+media);
		
		if(media <= 3 ){
		tr = tr + 1;
		System.out.println ("Reprovado");
		}
		if( media > 3 & media < 7 ){

		te =te + 1 ;
		System.out.println ("Exame" );
		}
		if(media >= 7 ){
		ta = ta + 1 ;
		System.out.println ("Aprovado" );
		}
		}
		total_classe = total_classe + media ;
		System.out.println("Total de alunos reprovados: "+ tr );
		System.out.println("Total de alunos exame:"+te );
		System.out.println("Total de alunos aprovados:"+ ta);

		media_classe =total_classe/6;
		 System.out.println("Total da media da classe:"+media_classe);

	}

}

