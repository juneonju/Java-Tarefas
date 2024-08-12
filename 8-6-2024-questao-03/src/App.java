import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha um número: ");
        int numero = scanner.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("é par");
        }else{
            System.out.println("é impar");
        }
        scanner.close();
    }
}