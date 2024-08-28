import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        System.out.println(primeiraVogal(palavra));
        sc.close();
    }
    public static char primeiraVogal(String frase){

        char primeiraVogal = ' ';

        char[] listaChar = new char[frase.length()];

        for (int i = 0; i < listaChar.length; i++) {
            listaChar[i] = frase.charAt(i);
        }
        
        int i = 0;

        while (i < listaChar.length - 1) {
            if (listaChar[i] == listaChar[i + 1]) {
                primeiraVogal = listaChar[i];
                break;
            }else{
                i++;
            }
        }
        return primeiraVogal; 
    }
}
