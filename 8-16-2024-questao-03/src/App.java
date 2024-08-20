import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 0 a 999: ");
        int num = sc.nextInt();
        int centena = num / 100;
        int dezena = (num % 100) / 10;
        int unidade = (num % 100) % 10;
        
        if (centena == 0 && dezena == 1 && unidade == 1) {
            System.out.println(dezena + " dezena e " + unidade + " unidade.");
        }else if (centena == 0 && dezena == 1 && unidade != 1 && unidade != 0) {
            System.out.println( dezena + " dezena e " + unidade + " unidades.");
        }else if(centena == 0 && dezena != 1 && dezena != 0 && unidade == 1){
            System.out.println( dezena + " dezenas e " + unidade + " unidade.");
        }else if (centena == 0 && dezena != 1 && dezena != 0 && unidade != 1 && unidade != 0) {
            System.out.println(dezena + " dezenas e " + unidade + " unidades.");
        }else if (centena == 0 && dezena == 0 && unidade == 1) {
            System.out.println(unidade + " unidade.");
        }else if (centena == 0 && dezena == 0 && unidade != 1 && unidade != 0) {
            System.out.println(unidade + " unidades.");
        }else if (centena == 1 && dezena == 1 && unidade == 1) {
            System.out.println(centena + " centena, " + dezena + " dezena e " + unidade + " unidade.");
        }else if (centena == 1 && dezena == 0 && unidade == 0) {
            System.out.println(centena + " centena");
        }else if (centena == 1 && dezena != 0 && dezena != 1 && unidade != 0 && unidade != 1) {
            System.out.println(centena + " centena, " + dezena + " dezenas e " + unidade + " unidades.");
        }else if (centena == 1 && dezena == 1 && unidade != 0 && unidade != 1) {
            System.out.println(centena + " centena, " + dezena + " dezena e " + unidade + " unidade.");
        }else if (centena == 1 && dezena != 1 && dezena != 0 && unidade == 1) {
            System.out.println(centena + " centena, " + dezena + " dezenas e " + unidade + " unidade.");
        }else if (centena != 1 && centena != 0 && dezena == 1 && unidade == 1) {
            System.out.println(centena + " centenas, " + dezena + " dezena e " + unidade + " unidade.");
        }else if (centena != 1 && centena != 0 && dezena != 1 && dezena != 0 && unidade != 1 && unidade != 0) {
            System.out.println(centena + " centenas, " + dezena + " dezenas e " + unidade + " unidades.");
        }else if (centena != 1 && centena != 0 && dezena != 1 && dezena != 0 && unidade == 1) {
            System.out.println(centena + " centenas, " + dezena + " dezenas e " + unidade + " unidade.");
        }else if (centena != 1 && centena != 0 && dezena == 0 && unidade == 0) {
            System.out.println(centena + " centenas.");
        }else if (centena != 1 && centena != 0 && dezena != 0 && dezena != 1 && unidade == 0) {
            System.out.println(centena + " centenas e " + dezena + " dezenas.");
        }else if (centena != 1 && centena != 0 && dezena == 1 && unidade == 0) {
            System.out.println(centena + " centenas e " + dezena + " dezena.");
        }else if (centena != 1 && centena != 0 && dezena == 0 && unidade != 1 && unidade != 0) {
            System.out.println(centena + " centenas e " + unidade + " unidades.");
        }else if (centena != 1 && centena != 0 && dezena == 0 && unidade != 0) {
            System.out.println(centena + " centenas e " + unidade + " unidades.");
        }else if (centena == 1 && dezena == 0 && unidade == 1) {
            System.out.println(centena + " centena e " + unidade + " unidade.");
        }else if (centena == 0 && dezena != 0 && dezena != 1 && unidade == 0) {
            System.out.println(dezena + " dezenas.");
        }else if (centena == 0 && dezena == 1 && unidade == 0) {
            System.out.println(dezena + " dezena.");
        }else if (centena == 0 && dezena == 0 && unidade == 0) {
            System.out.println(unidade + " unidades");
        }
        sc.close();
    }
}
