import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt(); // Lê o número fornecido pelo usuário

        // Verifica se o número está na sequência de Fibonacci e exibe o resultado
        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " está na sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não está na sequência de Fibonacci.");
        }
    }

    // Verifica se um número está na sequência de Fibonacci
    public static boolean isFibonacci(int n) {
        int anterior = 0;
        int atual = 1;

        // Gera a sequência de Fibonacci até que o próximo número seja maior ou igual a 'n'
        while (atual < n) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        // Retorna true se 'n' for igual ao último número calculado na sequência de Fibonacci
        return atual == n;
    }
}
