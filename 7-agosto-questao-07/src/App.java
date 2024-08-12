import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int soma = 0;
        int metade = num/2;
        int div = 1;
        while(div <= metade){
            if (num % div == 0) {
                soma = soma + div;
            }

            div = div + 1;
        }

        if (soma == num) {
            System.out.println("O número " + num + " é um número perfeito.");
        }else{
            System.out.println("não é um número perfeito");
        }
        sc.close();
    }
}
