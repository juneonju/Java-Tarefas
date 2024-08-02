import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        boolean parar = false;

        while (parar == false) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número de 1 a 7: ");

            int numero = scanner.nextInt();
            scanner.nextLine();

            switch (numero) {

                case 1:
                    System.out.println("Hoje é Segunda");
                    break;

                case 2:
                    System.out.println("Hoje é Terça");
                    break;

                case 3:
                    System.out.println("Hoje é Quarta");
                    break;

                case 4:
                    System.out.println("Hoje é Quinta");
                    break;

                case 5:
                    System.out.println("Hoje é Sexta");
                    break;

                case 6:
                    System.out.println("Hoje é Sabado");
                    break;

                case 7:
                    System.out.println("Hoje é Domingo");
                    break;

                default:
                    System.out.println("O mundo acabou");
                    break;
                }

            System.out.print("Você quer parar (sim)/(não)? ");
            String resposta = scanner.nextLine();

            if(resposta.equals("sim")){
                System.out.println("Foi bom falar com você.");
                scanner.close();
                parar = true;
            }else{
                System.out.println("Vou perguntar novamente.");
            }
            
        }
    }
}