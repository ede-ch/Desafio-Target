package com.example;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Vetor {

    public static void main(String[] args) {
        try {
            // Ler o conteúdo do arquivo JSON como uma string
            String jsonContent = new String(Files.readAllBytes(Paths.get("3-Vetor\\faturamento\\src\\main\\java\\com\\example\\dados.json")));

            // Inicializar o JSONArray com a string JSON
            JSONArray faturamento = new JSONArray(jsonContent);

            // Lista para armazenar os valores de faturamento diário
            List<Double> valoresFaturamento = new ArrayList<>();

            // Iterar sobre os objetos JSON no JSONArray
            for (int i = 0; i < faturamento.length(); i++) {
                JSONObject item = faturamento.getJSONObject(i);
                double valor = item.getDouble("valor");

                // Ignorar os dias sem faturamento
                if (valor > 0) {
                    valoresFaturamento.add(valor);
                }
            }

            // Calcular o menor e o maior valor de faturamento diário
            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            for (double valor : valoresFaturamento) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
            }

            // Calcular a média mensal de faturamento diário
            double totalFaturamento = 0;
            for (double valor : valoresFaturamento) {
                totalFaturamento += valor;
            }
            double mediaFaturamento = totalFaturamento / valoresFaturamento.size();

            // Contar o número de dias em que o valor de faturamento diário foi superior à média mensal
            int diasAcimaDaMedia = 0;
            for (double valor : valoresFaturamento) {
                if (valor > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }

            // Imprimir os resultados
            System.out.println("Menor valor de faturamento diário: " + menorFaturamento);
            System.out.println("Maior valor de faturamento diário: " + maiorFaturamento);
            System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }
}
