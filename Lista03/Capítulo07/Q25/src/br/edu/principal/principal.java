package br.edu.principal;
import java.util.Scanner;
import java.lang.String;

public class principal {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner (System.in);

		double preco, imp, transp = 0, seguro, fim ,total_imp = 0, origem = 0 ;
		String meio_t = null ;
		String carga = null;

		System.out.print("Digite  o preço ");
		preco = sc.nextDouble ();

		while (preco > 0 ){
		System.out.println("Digite a origem ");
		origem = sc.nextDouble ();
		System.out.println("Digite o meio de transporte ");
		meio_t = sc.next ();
		System.out.println("Digite a carga ");
		carga = sc.next ();
		}
		if(preco <= 100){
		 imp = preco * 5 / 100 ;
		}
		else{
		imp = preco * 10 / 100;
		}
		if(carga == "S" ){
		}
		if( origem == 1 ){
		 transp = 50 ;
		}
		if( origem == 2){
		 transp = 21 ;
		}
		if(origem == 3 ){
		 transp = 24;
		}

		if(carga  == "N"){
		}
		if(origem == 1 ){
		 transp = 12;
		}
		if( origem == 2 ){
		transp =21;
		}
		if( origem ==3){
		 transp = 60;
		}if(origem == 2 || meio_t == "A" ){
		 seguro = preco/2 ;
		}
		else{
		 seguro = 0;
		}
		fim= preco + imp + transp + seguro ;
		total_imp = total_imp + imp;
		System.out.println("O imposto:"+imp );
		System.out.println("O transporte:"+transp );
		System.out.println (" O seguro:"+seguro );
		System.out.println(" Valor final:"+ fim );
		System.out.println ("Digite o preço ");
		preco = sc.nextDouble ();

}
}