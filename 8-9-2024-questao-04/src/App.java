import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite números: ");
        String numeros = sc.nextLine();
        String[] array = numeros.split(",");
        Integer[] numsInt = transformarArray(array);
        System.out.println(Arrays.toString(numsInt));
        Arrays.sort(numsInt);
        sc.close();
    }

    public static Integer[] transformarArray(String[] array){
        Integer[] nums = new Integer[array.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(array[i]);
        }
            
    }
}