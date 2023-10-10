package br.edu.principal;
import java.util.Scanner;
import java.lang.String;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double pre, valor_adic, imposto;
		int   pre_custo, desconto, novo_pre;
	    String tipo = "";
	    String refrig = "";
	
	     System.out.print("Digite o preço:");
	     pre=sc.nextDouble();
	     System.out.print("Digite o tipo;");
	     tipo = sc.next();
	     System.out.print(" Digite o rifrig:");
	     refrig =sc.next();
       
	     if(refrig=="N") {
	    	 
	     }if (tipo == "A") {
	    	 
	     }if (pre <15) {
	    	 valor_adic=2;
	     }else {
	    	 valor_adic=5;
	     }if (tipo == "L") {
	    	 
	     }if(pre <10) {
	    	 valor_adic=1.50;
	     }else {
	    	 valor_adic= 2.50;
	     }if (tipo == "V") {
	    
	     }if(pre<30) {
	    	 valor_adic =3;
	     }else {
	    	 valor_adic = 2.5;
	     }
	     
	     if( tipo == "A") {
	    	 valor_adic = 8 ;
	    	 
	     }if (tipo == "L") {
	    	 valor_adic = 0;
	     } if (tipo == "V") {
	    	 valor_adic=0;
	     }
	     
	     System.out.println("Valor adicional:"+valor_adic);
	     
	     if (pre<25) {
	    	 imposto =5/100*pre;
	    	 
	     }else {
	    	 imposto =8/100*pre;
	     }
	     System.out.println("Imposto" +imposto);
	
	     pre_custo= (int) (pre + imposto);

	
	     System.out.println("O custo será:"+pre_custo);
	
	
	     if( tipo !="A"& refrig != "S" ) {
	    	 desconto = 3/100*pre_custo;
	    	 
	     }else {
	    	 desconto =0;
	     }System.out.println("O desconto será:"+ desconto);
	
	
	     novo_pre =(int) (pre_custo + valor_adic - desconto);
	     System.out.println("Novo preço:"+ novo_pre);
	
	
	     if(novo_pre<=50) {
	    	 System.out.print("Normal");
	     }else {
	    	 System.out.print("Caro");
	     }
	}
}
