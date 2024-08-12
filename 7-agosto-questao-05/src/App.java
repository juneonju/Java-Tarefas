import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Leitura do tamanho do vetor
        System.out.print("Digite o número de elementos no vetor: ");
        int n = scanner.nextInt();

        // Criação do vetor
        int[] vetor = new int[n];

        // Leitura dos elementos do vetor
        System.out.println("Digite " + n + " números inteiros:");
        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Ordenação do vetor (Método da Bolha)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca de elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        // Impressão do vetor ordenado
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
        scanner.close();
    }
}
