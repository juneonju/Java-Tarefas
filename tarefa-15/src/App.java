import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma lista de números divididos por virgula: ");
        String numeros = sc.nextLine();
        numeros.split(",");
        sc.close();
    }
}
