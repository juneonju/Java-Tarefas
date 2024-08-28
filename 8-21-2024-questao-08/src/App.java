import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Diga uma palavra: ");
        String palavra = sc.nextLine();
        System.out.println(contarVogais(palavra));
        sc.close();
    }
    public static int contarVogais(String palavra){
        int vogal = 0;

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a') {
                vogal++;
            }else if(palavra.charAt(i) == 'e'){
                vogal++;
            }else if(palavra.charAt(i) == 'i'){
                vogal++;
            }else if(palavra.charAt(i) == 'o'){
                vogal++;
            }else if(palavra.charAt(i) == 'u'){
                vogal++;
            }
        }
        return vogal;
    }
}
