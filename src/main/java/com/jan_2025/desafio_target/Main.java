package com.jan_2025.desafio_target;

import java.util.*;

public class Main {
    public static void main(String[] Args)  {

        // Exercício 01 (SOMA)

        System.out.println("Exercício 01 (Soma):");
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K += 1;
            SOMA += K;
        }

        System.out.println("Resposta do exercício 01: SOMA = " + SOMA);
        System.out.println();

        // Exercício 02 (Fibonacci)

        System.out.println("Exercício 02 (Fibonacci):");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = sc.nextInt();
        HashSet<Integer> fibonacciSet = new HashSet<>();
        int a = 0, b = 1;
        fibonacciSet.add(a);
        fibonacciSet.add(b);
        while ( b <= numero) {
            int proximo = a + b;
            fibonacciSet.add(proximo);
            a = b;
            b = proximo;
        }

        if (fibonacciSet.contains(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        System.out.println();

        // Exercício 03 (Faturamento diário)

        System.out.println("Exercício 03 (Faturamento diário):");
        List<Integer> faturamentoDiario = new ArrayList<>();
        faturamentoDiario.add(10550);
        faturamentoDiario.add(7980);
        faturamentoDiario.add(15220);
        faturamentoDiario.add(4500);
        faturamentoDiario.add(21700);

        Integer menorFaturamento = faturamentoDiario.get(0);
        Integer maiorFaturamento = faturamentoDiario.get(0);
        int somaMensal = 0;
        double mediaMensal;
        int quantidadeSuperiorAMedia = 0;
        for (Integer faturamento : faturamentoDiario) {
            if (faturamento < menorFaturamento) {
                menorFaturamento = faturamento;
            }
            if (faturamento > maiorFaturamento) {
                maiorFaturamento = faturamento;
            }
            somaMensal += faturamento;
        }
        mediaMensal = (double) (somaMensal / faturamentoDiario.size());
        for ( Integer faturamento : faturamentoDiario) {
            if (faturamento > mediaMensal) {
                quantidadeSuperiorAMedia += 1;
            }
        }

        System.out.println("O menor valor de faturamento ocorrido em um dia do mês: " + menorFaturamento);
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês: " + maiorFaturamento);
        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + quantidadeSuperiorAMedia);
        System.out.println();

        // Exercício 04 (Faturamento mensal)

        System.out.println("Exercício 04 (Faturamento mensal):");
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        double totalFaturamento = 0.0;
        for (double valor : faturamentoPorEstado.values()) {
            totalFaturamento += valor;
        }

        System.out.println("Faturamento percentual por estado:");
        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            String estado = entry.getKey();
            double faturamento = entry.getValue();
            double percentual = (faturamento / totalFaturamento) * 100;
            System.out.printf("%s: R$%.2f (%.2f%%)%n", estado, faturamento, percentual);
        }
        System.out.println();
        sc.nextLine();

        // Exercício 05 (Inverter String)
        System.out.println("Exercício 05 (Inverter string):");
        System.out.print("Digite uma string para inverter: ");
        String input = sc.nextLine();
        String stringInvertida = inverterString(input);
        System.out.println("String invertida: " + stringInvertida);
        sc.close();
    }

    public static String inverterString(String str) {
        StringBuilder invertida = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida.append(str.charAt(i));
        }
        return invertida.toString().toLowerCase();
    }
}
