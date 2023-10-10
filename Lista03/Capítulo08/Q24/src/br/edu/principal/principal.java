package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        System.out.print("Digite o símbolo (+ para adição, * para multiplicação): ");
        char operacao = scanner.next().charAt(0);
        
        double resultado = realizarOperacao(valor1, valor2, operacao);
        
        System.out.println("O resultado da operação é: " + resultado);
        
        scanner.close();
    }
    
    public static double realizarOperacao(double valor1, double valor2, char operacao) {
        double resultado = 0.0;
        
        if (operacao == '+') {
            resultado = valor1 + valor2;
        } else if (operacao == '*') {
            resultado = valor1 * valor2;
        } else {
            System.out.println("Operação não reconhecida.");
        }
        
        return resultado;
    }
}