import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digita um número: ");
        float n1 = sc.nextFloat();
        sc.nextLine();
        System.out.print("Digite outro número: ");
        float n2 = sc.nextFloat();
        sc.nextLine();
        float resultado = n1 + n2;
        System.out.println("O resultado é " + resultado);
        sc.close();
    }
}
