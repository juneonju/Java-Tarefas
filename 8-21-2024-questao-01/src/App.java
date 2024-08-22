import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma lista de números separados por virgula: ");
        String lista = sc.nextLine();
        String[] array = lista.split(",");
        Integer[] numsInt = transformarArray(array);
        System.out.println(Arrays.toString(numsInt));

        Integer[] novaLista = new Integer[numsInt.length];

        for (int i = 0; i < numsInt.length; i++) {
            
            if (numsInt[i] == numsInt[i + 1]) {
                novaLista[i] = numsInt[i + 1];
                i = i + 2;
            }else{
                novaLista[i] = numsInt[i];
            }
        }

        System.out.println(Arrays.toString(novaLista));

        sc.close();
    }

    public static Integer[] transformarArray(String[] array){
        Integer[] nums = new Integer[array.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(array[i]);
        }
        return nums;
    }
}
