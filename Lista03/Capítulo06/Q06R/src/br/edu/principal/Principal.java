package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalVendedores = 10;
        String[] nomesVendedores = new String[totalVendedores];
        double[] vendasVendedores = new double[totalVendedores];
        double[] comissaoVendedores = new double[totalVendedores];
        double[] valorAReceber = new double[totalVendedores];

        // Ler os dados dos vendedores
        for (int i = 0; i < totalVendedores; i++) {
            System.out.print("Digite o nome do vendedor " + (i + 1) + ": ");
            nomesVendedores[i] = scanner.nextLine();

            System.out.print("Digite o total de vendas do vendedor " + (i + 1) + ": ");
            vendasVendedores[i] = scanner.nextDouble();

            System.out.print("Digite o percentual de comissão do vendedor " + (i + 1) + ": ");
            comissaoVendedores[i] = scanner.nextDouble();

            // Calcular o valor a receber
            valorAReceber[i] = (vendasVendedores[i] * comissaoVendedores[i]) / 100;

            // Limpar o buffer do scanner
            scanner.nextLine();
        }

        // Calcular o total das vendas de todos os vendedores
        double totalVendas = calcularTotalVendas(vendasVendedores);

        // Encontrar o maior e o menor valor a receber e os respectivos nomes
        int indiceMaior = encontrarIndiceMaior(valorAReceber);
        int indiceMenor = encontrarIndiceMenor(valorAReceber);

        // Exibir o relatório com os nomes dos vendedores e os valores a receber
        System.out.println("\nRelatório de Comissões:");
        System.out.println("Nome do Vendedor \t Valor a Receber");
        for (int i = 0; i < totalVendedores; i++) {
            System.out.println(nomesVendedores[i] + "\t\t\t\t R$" + valorAReceber[i]);
        }

        System.out.println("\nTotal das Vendas de Todos os Vendedores: R$" + totalVendas);
        System.out.println("Maior Valor a Receber: R$" + valorAReceber[indiceMaior] + " (Vendedor: " + nomesVendedores[indiceMaior] + ")");
        System.out.println("Menor Valor a Receber: R$" + valorAReceber[indiceMenor] + " (Vendedor: " + nomesVendedores[indiceMenor] + ")");

        scanner.close();
    }

    // Função para calcular o total das vendas de todos os vendedores
    public static double calcularTotalVendas(double[] vendas) {
        double total = 0;
        for (double venda : vendas) {
            total += venda;
        }
        return total;
    }

    // Função para encontrar o índice do maior valor em um vetor
    public static int encontrarIndiceMaior(double[] valores) {
        int indiceMaior = 0;
        double maiorValor = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maiorValor) {
                indiceMaior = i;
                maiorValor = valores[i];
            }
        }
        return indiceMaior;
    }

    // Função para encontrar o índice do menor valor em um vetor
    public static int encontrarIndiceMenor(double[] valores) {
        int indiceMenor = 0;
        double menorValor = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < menorValor) {
                indiceMenor = i;
                menorValor = valores[i];
            }
        }
        return indiceMenor;
    }
}