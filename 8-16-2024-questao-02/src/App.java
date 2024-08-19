import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Que ano estamos?");
        String ano = sc.nextLine();
        String anoInvertido = "";

        for (int i = ano.length()-1; i >= 0; i--) {
            anoInvertido += ano.charAt(i);
        }

        String capturarValor = anoInvertido.substring(0,2);
        String inverterValor = "";

        for (int i = capturarValor.length()-1; i >= 0; i--) {
            inverterValor += capturarValor.charAt(i);
        }

        int anoAtual = Integer.parseInt(ano);
        int valor = Integer.parseInt(inverterValor);

        if (anoAtual % 400 == 0) {
            System.out.println("Ano bissexto");
        }else if(valor == 00) {
            System.out.println("Ano não é bissexto");
        }else if (valor % 4 == 0) {
            System.out.println("Ano bissexto");
        }else{
            System.out.println("O mundo acabou");
        }

        sc.close();
    }
}