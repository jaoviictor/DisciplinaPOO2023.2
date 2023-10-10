package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlunos = 6;
        String[] nomes = new String[totalAlunos];
        double[] nota1 = new double[totalAlunos];
        double[] nota2 = new double[totalAlunos];
        double[] media = new double[totalAlunos];
        String[] situacao = new String[totalAlunos];

        // Coleta os nomes e notas dos alunos
        for (int i = 0; i < totalAlunos; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.next();
            System.out.print("Digite a nota da 1ª prova: ");
            nota1[i] = scanner.nextDouble();
            System.out.print("Digite a nota da 2ª prova: ");
            nota2[i] = scanner.nextDouble();

            // Calcula a média e determina a situação do aluno
            media[i] = (nota1[i] + nota2[i]) / 2;
            if (media[i] >= 7.0) {
                situacao[i] = "Aprovado";
            } else if (media[i] >= 4.0) {
                situacao[i] = "Exame";
            } else {
                situacao[i] = "Reprovado";
            }
        }

        // Exibe o relatório de notas
        System.out.println("Relatório de Notas:\n");
        System.out.println("ALUNO\tPROVA 1\tPROVA 2\tMÉDIA\tSITUAÇÃO");
        for (int i = 0; i < totalAlunos; i++) {
            System.out.printf("%s\t%.1f\t%.1f\t%.1f\t%s\n", nomes[i], nota1[i], nota2[i], media[i], situacao[i]);
        }

        // Calcula e exibe as estatísticas
        double mediaClasse = calcularMediaClasse(media);
        double percentualAprovados = calcularPercentualAprovados(situacao);
        double percentualExame = calcularPercentualExame(situacao);
        double percentualReprovados = calcularPercentualReprovados(situacao);

        System.out.printf("\nMédia da classe: %.2f\n", mediaClasse);
        System.out.printf("Percentual de alunos aprovados: %.2f%%\n", percentualAprovados);
        System.out.printf("Percentual de alunos em exame: %.2f%%\n", percentualExame);
        System.out.printf("Percentual de alunos reprovados: %.2f%%\n", percentualReprovados);

        scanner.close();
    }

    // Função para calcular a média da classe
    public static double calcularMediaClasse(double[] medias) {
        double soma = 0;
        for (double media : medias) {
            soma += media;
        }
        return soma / medias.length;
    }

    // Função para calcular o percentual de alunos aprovados
    public static double calcularPercentualAprovados(String[] situacoes) {
        int aprovados = 0;
        for (String situacao : situacoes) {
            if (situacao.equals("Aprovado")) {
                aprovados++;
            }
        }
        return (double) aprovados / situacoes.length * 100;
    }

    // Função para calcular o percentual de alunos em exame
    public static double calcularPercentualExame(String[] situacoes) {
        int exame = 0;
        for (String situacao : situacoes) {
            if (situacao.equals("Exame")) {
                exame++;
            }
        }
        return (double) exame / situacoes.length * 100;
    }

    // Função para calcular o percentual de alunos reprovados
    public static double calcularPercentualReprovados(String[] situacoes) {
        int reprovados = 0;
        for (String situacao : situacoes) {
            if (situacao.equals("Reprovado")) {
                reprovados++;
            }
        }
        return (double) reprovados / situacoes.length * 100;
    }
}