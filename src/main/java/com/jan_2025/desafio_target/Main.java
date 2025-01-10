package com.jan_2025.desafio_target;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
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
        String url = "https://drive.google.com/uc?id=1qXvCPjEL4jerElN-hnScoKkEVmSQ8A2L";
        String jsonData = getJsonFromUrl(url);
        JSONArray faturamento = new JSONArray(jsonData);
        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamento = 0;

        for (int i = 0; i < faturamento.length(); i++) {
            JSONObject dia = faturamento.getJSONObject(i);
            double valor = dia.getDouble("valor");
            if (valor > 0 && valor < menorValor) {
                menorValor = valor;
            }
            if (valor > maiorValor) {
                maiorValor = valor;
            }
            if (valor > 0) {
                soma += valor;
                diasComFaturamento++;
            }
        }

        double mediaMensal = soma / diasComFaturamento;

        int diasAcimaDaMedia = 0;
        for (int i = 0; i < faturamento.length(); i++) {
            JSONObject dia = faturamento.getJSONObject(i);
            double valor = dia.getDouble("valor");
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.printf("Menor valor de faturamento: %.2f%n", menorValor);
        System.out.printf("Maior valor de faturamento: %.2f%n", maiorValor);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
        System.out.println();

        // Exercício 04 (Faturamento mensal)

        System.out.println("Exercício 04 (Faturamento mensal):");
        Map<String, Double> faturamentoPorEstado = new LinkedHashMap<>();
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
            double faturamentoMensal = entry.getValue();
            double percentual = (faturamentoMensal / totalFaturamento) * 100;
            System.out.printf("%s: R$%.2f (%.2f%%)%n", estado, faturamentoMensal, percentual);
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

    private static String getJsonFromUrl(String urlString) {
        StringBuilder result = new StringBuilder();
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();
        } catch (Exception e) {
            System.out.println("Error accessing json url: " + urlString);
        }
        return result.toString();
    }
}
