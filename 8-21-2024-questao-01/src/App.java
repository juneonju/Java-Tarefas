import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma lista de números separados por virgula: ");
        String lista = sc.nextLine();
        String[] array = lista.split(",");
        Integer[] numsInt = transformarArray(array);
        List<Integer> numsLista = new ArrayList<>();
        Collections.addAll(numsLista, numsInt);

        System.out.println("Lista original " + numsLista.toString());

        removeDuplicados(numsLista);
        Collections.sort(numsLista);
    
        System.out.println("Lista corrigida " +  numsLista.toString());

        sc.close();
    }

    public static Integer[] transformarArray(String[] array){
        Integer[] nums = new Integer[array.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(array[i]);
        }
        return nums;
    }

    public static void removeDuplicados(List<Integer> lista) {
        
        for (int i = 0; i < lista.size(); i++) {
            Integer elementoAtual = lista.get(i);
            
            for (int j = i + 1; j < lista.size(); j++) {
                if (elementoAtual.equals(lista.get(j))) {
                    lista.remove(j);

                    j--;
                }
            }
        }
    }
}
