import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número:");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite outro número:");
        int n2 = sc.nextInt();
        sc.nextLine();
        int soma = n1 + n2;
        int mult = n1 * n2;
        int div = n1 / n2;
        int sub = n1 - n2;
        System.out.println("Soma:" + soma + "\n" + "Multiplicação:" + mult + "\n" + "Divisão:" + div + "\n" + "Subtração:" + sub + "\n");
        sc.close();
    }
}
