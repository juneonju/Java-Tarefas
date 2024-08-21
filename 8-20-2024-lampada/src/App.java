import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LigarDesligar ligarEdesligar = new LigarDesligar();
        boolean ligado = true;
        while (ligado) {

                System.out.println("1)parar");
                System.out.println("2)continuar");
                System.out.print("Escolha: ");
                int escolha = sc.nextInt();

                if(escolha == 1){
                    ligado = false;
                }else{
                    System.out.println("Irei continuar.");
                }
                
                if (ligarEdesligar.ativo == true) {    
                    System.out.println("Lampada acesa.");
                }else{
                    System.out.println("Lampada apagada.");
                }

            System.out.println("1) Ligar a lampada");
            System.out.println("2) Desligar a lampada");
            System.out.print("Escolha: ");
            int decisao = sc.nextInt();
            sc.nextLine();

            if (decisao == 1) {
                ligarEdesligar.ligar();
            }else if(decisao == 2){
                ligarEdesligar.desligar();
            }else{
                System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}
