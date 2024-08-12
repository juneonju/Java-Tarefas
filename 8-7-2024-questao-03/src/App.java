import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha um número: ");
        int num = sc.nextInt();

        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < num; i++) {
            System.out.println("O resultado é " + num1);
            num2 = num1 + num2;
            num1 = num2 - num1;
        }
        sc.close();
    }
}

