public class Distribuidora {

    public static void main(String[] args) {

        // Valores de faturamento mensal por estado
        float sp = 67836.43f;
        float rj = 36678.66f;
        float mg = 29229.88f;
        float es = 27165.48f;
        float outros = 19849.53f;

        // Calcular o valor total mensal
        float total = sp + rj + mg + es + outros;

        // Calcular o percentual de representação de cada estado
        float percentualSP = (sp / total) * 100;
        float percentualRJ = (rj / total) * 100;
        float percentualMG = (mg / total) * 100;
        float percentualES = (es / total) * 100;
        float percentualOutros = (outros / total) * 100;

        // Imprimir os resultados com duas casas decimais
        System.out.println("Percentual de representação por estado:");
        System.out.printf("SP: %.2f%%\n", percentualSP);
        System.out.printf("RJ: %.2f%%\n", percentualRJ);
        System.out.printf("MG: %.2f%%\n", percentualMG);
        System.out.printf("ES: %.2f%%\n", percentualES);
        System.out.printf("Outros: %.2f%%\n", percentualOutros);
    }
}
