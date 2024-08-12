import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();
        String tarefa;
        boolean ativo = true;

        System.out.print("Você quer começar uma lista de tarefas(sim)(não): ");
        String resposta = sc.nextLine();

        if(resposta.equals("sim")){
            while(ativo){

                System.out.println("1) Mostrar lista.");
                System.out.println("2) Digite para adicionar uma tarefa.");
                System.out.println("3) Remover tarefa.");
                System.out.println("4) Alterar atividade.");
                System.out.println("5) Saír.");
                System.out.print("Digite uma opção: ");
                int opcao = sc.nextInt();
                sc.nextLine();
                
                switch (opcao) {

                    case 1:
                        int contagem = 1;
                        for (String string : tarefas) {
                            System.out.println(contagem + "- " + string);
                            contagem += contagem;
                        }
                        break;
                    case 2:
                        System.out.print("Qual tarefa você quer adicionar? ");
                        tarefa = sc.nextLine();
                        tarefas.add(tarefa);
                        break;
                    case 3:
                        System.out.print("Você quer remover um item da lista? ");
                        int itemRemocao = sc.nextInt();
                        sc.nextLine();
                        if (itemRemocao > 0) {
                            tarefas.remove(itemRemocao - 1);
                            break;
                        }else{
                            System.out.println("Posição inválida.");
                            break;
                        }
                    case 4:
                        System.out.print("Qual item da lista você quer alterar? ");
                        int itemAlterar = sc.nextInt();
                        sc.nextLine();
                        if (itemAlterar > 1) {
                            System.out.print("Qual alteração você quer colocar? ");
                            String itemAlterado = sc.nextLine();
                            tarefas.set(itemAlterar - 1, itemAlterado);
                            break;
                        }else{
                            System.out.println("posição inválida.");
                            break;
                        }
                    case 5:
                        ativo = false;
                        break;

                    default:
                        break;
                }

            }
        }else{
            System.out.println("Até.");
        }

        sc.close();
    }
}
