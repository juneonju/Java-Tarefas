import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 12 pra eu informar o respectivo mês: ");
        int n = sc.nextInt();

        if (n >= 1 && n <= 12) {
            System.out.println(meses[n - 1]);
        }else{
            System.out.println("Número inválido");
        }

        sc.close();
    }
}
