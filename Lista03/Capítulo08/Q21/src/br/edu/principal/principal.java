package br.edu.principal;
import java.util.Scanner;
class principal {


	    
		    // Função para verificar se um número é primo
		    public static boolean ehPrimo(int numero) {
		        if (numero <= 1) {
		            return false;
		        }
		        for (int i = 2; i <= Math.sqrt(numero); i++) {
		            if (numero % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }

		    // Função para calcular a soma dos números primos entre x e y (inclusive)
		    public static int somaNumerosPrimosEntreXY(int x, int y) {
		        int soma = 0;
		        for (int i = x; i <= y; i++) {
		            if (ehPrimo(i)) {
		                soma += i;
		            }
		        }
		        return soma;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int x, y;

		        do {
		            System.out.print("Digite o valor de x: ");
		            x = scanner.nextInt();
		            System.out.print("Digite o valor de y (maior que x): ");
		            y = scanner.nextInt();

		            if (x < y) {
		                int somaPrimos = somaNumerosPrimosEntreXY(x, y);
		                System.out.println("A soma dos números primos entre " + x + " e " + y + " é: " + somaPrimos);
		            } else {
		                System.out.println("x deve ser menor que y. Por favor, digite novamente.");
		            }

		        } while (x != y);

		        scanner.close();
		    }
		}