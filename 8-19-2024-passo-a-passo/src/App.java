import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        char[] listaAlfa = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for (int i = 0; i < listaAlfa.length; i++) {
            System.out.println((i + 1) + " - " + listaAlfa[i]);
        }
    }
}
