import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o tamanho do vetor? ");
        int n = sc.nextInt();;
        sc.nextLine();
        int[] array = new int[n];
        int cont = 0;
        for (int i = 0; i < n; i++) {
            cont++;
            System.out.print("Qual o número da posição " + cont + " do vetor: ");
            array[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(array);
        System.out.print(Arrays.toString(array));
        sc.close();
    }
}
