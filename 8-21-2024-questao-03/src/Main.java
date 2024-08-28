import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.println(codificarFrase(frase));
        sc.close();      
    }

    public static String codificarFrase(String frase) {
        frase = frase.toLowerCase();
        StringBuilder resultado = new StringBuilder();
        for (char caractere : frase.toCharArray()) {
            if (Character.isLetter(caractere)) {
                int numero = caractere - 'a' + 1;
                resultado.append(numero);
            }else {
                resultado.append(caractere);
            }
        }
        return resultado.toString();
    }
}