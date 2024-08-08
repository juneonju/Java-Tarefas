import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é seu nome? ");
        String nome = sc.nextLine();
        System.out.print("Qual sua idade? ");
        int idade = sc.nextInt();
        System.out.print("Seu nome é " + nome + " e sua idade é " + idade + " anos daora");
    }
}
