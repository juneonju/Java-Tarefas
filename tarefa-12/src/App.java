public class App {
    public static void main(String[] args) throws Exception {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                soma = soma + i;   
            }  
        }
        System.out.println(soma);
    }
}
