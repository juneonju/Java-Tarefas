import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha um número: ");
        int num = sc.nextInt();
        int numPrimo = 0;
        for (int i = 1; i <= num; i++) {
           if (num % i == 0) {
                numPrimo++;
           } 
        }
        if(numPrimo == 2){
            System.out.print("É primo.");
        }else{
            System.out.print("Não é primo");
        }
        sc.close();
    }
}
