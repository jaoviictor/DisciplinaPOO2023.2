package br.edu.principal;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		  String [] nomes = new String[5];
		  int custo [] = new int [5];
		  int [][] imp = new int [4][5];
           int preco = 0,i, j, fina;
		
          for( i = 1;i< 5;i++) {
        	System.out.print("Digite o primeiro nome:");
           nomes[i] = sc.next();
           
           for( i = 1;i < 5;i++) {
         
          for(j = 1;j< 4;j++) {
        
        	  System.out.print("Digite o primeiro prço:");
        	  preco =sc.nextInt();
          }
        
          for( i = 1;i< 5;i++) {
        System.out.print("Digite o custo:");
           custo[i] = sc.nextInt();
          }
          for( i =1;i<5;i++) {
        	  
             for (j = 1;j <4;j++) {
          
           if ( preco <= 50) {
            imp[i][j] = preco  * 5 / 100;
		
           }else if( preco > 50 & preco <= 100) {
            		  imp[i][j] = preco*10/100;
           }else {
        	   imp[i][j] = preco*15/100;
           }
             }for ( i = 1;i < 5;i++) {
            	System.out.println( "Nome do produto "+nomes[i]);
            	System.out.println("Custo = "+ custo[i]) ;
            	
            		for (j = 1;j<4;j++) {
      
            		 fina =  preco + imp[i][j] + custo[i];
            				 System.out.println("Imposto na loja "+ j+" = "+ imp[i][j]);
            				System.out.println(" Preço na loja "+ j+ " =" + preco);
            				System.out.println(" Preço final na loja "+j+ " =" + fina);
 
		
		
		
		
		
		
		
		
}
	}
		
          }
           }
          }
	}
}
		
		
		
		   
		
		
		
		
		
		
		
