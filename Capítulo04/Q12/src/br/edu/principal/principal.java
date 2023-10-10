package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
 Scanner sc = new Scanner ( System.in);
 System.out.println("Digite o código do cargo do funcionário (1, 2, 3, 4 ou 5):");
 int cargo = sc.nextInt();

 System.out.println("Digite o valor do salário:");
 double salario = sc.nextDouble();

 double aumento = 0;
 double novo_Salario = 0;
 String nome_Cargo = "";

 if (cargo == 1) {
     nome_Cargo = "Escriturário";
     aumento = salario * 0.5;
 } else if (cargo == 2) {
     nome_Cargo = "Secretário";
     aumento = salario * 0.35;
 } else if (cargo == 3) {
     nome_Cargo = "Caixa";
     aumento = salario * 0.2;
 } else if (cargo == 4) {
     nome_Cargo = "Gerente";
     aumento = salario * 0.1;
 } else if (cargo == 5) {
     nome_Cargo = "Diretor";
     aumento = 0; 
 } else {
     System.out.println("Cargo Inexistente!");
     return;
 }

 novo_Salario = salario + aumento;

 System.out.println("O cargo é: " + nome_Cargo);
 System.out.println("O valor do aumento é: " + aumento);
 System.out.println("O novo salário é: " + novo_Salario);
 
	}

}
