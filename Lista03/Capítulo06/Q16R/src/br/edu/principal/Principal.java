package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeInferior50 = 0;
        String produtosEntre50e100 = "";
        double somaPrecosSuperior100 = 0;
        int contadorPrecosSuperior100 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome do produto " + i + ": ");
            String nomeProduto = scanner.nextLine();

            System.out.print("Digite o preço do produto " + i + ": ");
            double precoProduto = scanner.nextDouble();

            if (precoProduto < 50.0) {
                quantidadeInferior50++;
            } else if (precoProduto >= 50.0 && precoProduto <= 100.0) {
                if (!produtosEntre50e100.isEmpty()) {
                    produtosEntre50e100 += ", ";
                }
                produtosEntre50e100 += nomeProduto;
            } else if (precoProduto > 100.0) {
                somaPrecosSuperior100 += precoProduto;
                contadorPrecosSuperior100++;
            }

            // Limpa o buffer do scanner
            scanner.nextLine();
        }

        System.out.println("Quantidade de produtos com preço inferior a R$ 50,00: " + quantidadeInferior50);

        if (!produtosEntre50e100.isEmpty()) {
            System.out.println("Produtos com preço entre R$ 50,00 e R$ 100,00: " + produtosEntre50e100);
        } else {
            System.out.println("Nenhum produto com preço entre R$ 50,00 e R$ 100,00.");
        }

        if (contadorPrecosSuperior100 > 0) {
            double mediaPrecosSuperior100 = somaPrecosSuperior100 / contadorPrecosSuperior100;
            System.out.println("Média dos preços dos produtos com preço superior a R$ 100,00: R$" + mediaPrecosSuperior100);
        } else {
            System.out.println("Nenhum produto com preço superior a R$ 100,00.");
        }

        scanner.close();
    }
}