import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fala um número: ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <= quantidade; i++) {
            checarPrimo(i);
        }
        
        sc.close();
    }
    
    public static void checarPrimo(int numPrimo){
        int cont = 0;
        for (int i = 1; i <= numPrimo; i++) {
            if (numPrimo % i == 0) {
                cont++;
            }
        }

        if (cont == 2) {
            System.out.println(numPrimo);                   
        }
    }
}
