import java.util.Scanner;

public class InversaoString {

    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite a string a ser invertida
        System.out.println("Digite a string a ser invertida:");
        String original = scanner.nextLine();

        // Inverter a string
        String invertida = inverterString(original);

        // Imprimir a string original e a string invertida
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);

        // Fechar o scanner
        scanner.close();
    }

    // Função para inverter uma string
    public static String inverterString(String str) {
        // Converter a string para um array de caracteres
        char[] caracteres = str.toCharArray();

        // Índices para início e fim da string
        int inicio = 0;
        int fim = caracteres.length - 1;

        // Iterar sobre os caracteres e trocar de posição
        while (inicio < fim) {
            // Trocar os caracteres de posição
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            // Atualizar os índices
            inicio++;
            fim--;
        }

        // Construir uma nova string com os caracteres invertidos
        return new String(caracteres);
    }
}
