import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Passe uma lista de números: ");
        String lista = sc.nextLine();
        String[] stringSeparada = lista.split(",");

        int min = Integer.valueOf(stringSeparada[0]);
        int max = 0;
        for (int i = 0; i < stringSeparada.length; i++) {

            int atual = Integer.valueOf(stringSeparada[i]);

            if (max < atual) {
                max = atual;
            }

            if (min > atual) {
                min = atual;
            }
        }

        System.out.println("O maior número da lista é " + max + " e o menor é " + min);
    }
}
