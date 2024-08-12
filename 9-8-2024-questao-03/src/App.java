import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra para eu contar vogais: ");
        String palavra = sc.nextLine();

        char[] charArray = palavra.toCharArray();

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int index = 0; index < charArray.length; index++) {
            if (charArray[index] == 'a') {
                a++;
            }else if(charArray[index] == 'e'){
                e++;
            }else if(charArray[index] == 'i'){
                i++;
            }else if(charArray[index] == 'o'){
                o++;
            }else if(charArray[index] == 'u'){
                u++;
            }
        }
        
        System.out.println("a:" + a + "\n" + "e:" + e + "\n" + "i:" + i + "\n" + "o:" + o + "\n" + "u:" + u);
        sc.close();
    }
}
