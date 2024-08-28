import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 26: ");
        int indice = sc.nextInt();
        System.out.println(acharLetra(indice));
        sc.close();
    }
    public static char acharLetra(int indiceLetra){
        char[] listaAlfabetica =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        return listaAlfabetica[indiceLetra - 1];
    }
}