import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        boolean ativo = true;

        System.out.print("Qual a temperatura atual? ");
        float temperatura = sc.nextFloat();
        sc.nextLine();

        System.out.println("1) Celsius");
        System.out.println("2) Fahrenheit");
        System.out.println("3) Kelvin");
        System.out.println("Escolha uma opção de temperatura:");
        int tipoTemperatura = sc.nextInt();
        sc.nextLine();

        while (ativo) {

            if (tipoTemperatura == 1) {

                System.out.println("A temperatura atual é " + temperatura + "°C");
                System.out.print("você quer converter a temperatura?(sim)(não) ");
                String resposta = sc.nextLine();

                if (resposta.equals("sim")) {

                    System.out.println("1)Kelvin");
                    System.out.println("2)Fahrenheit");
                    System.out.print("Escolha uma opção:");
                    int opcao = sc.nextInt();
                    sc.nextLine();

                    if (opcao == 1) {

                        Float antigoValor = temperatura;
                        float novoValor = temperatura + 273;
                        System.out.println("O antigo valor era " + antigoValor + "°C" +" e o novo valor é " + novoValor + "°K");
                        temperatura = novoValor;
                        tipoTemperatura = 3;

                    }else if(opcao == 2){

                    }else{
                        System.out.println("opção inválida.");
                    }

                }else {

                }
                
            }else if(tipoTemperatura == 2){

                System.out.println("A temperatura atual é " + temperatura + "°F");
                System.out.print("você quer converter a temperatura?(sim)(não) ");
                String resposta = sc.nextLine();

            }else if(tipoTemperatura == 3){

                System.out.println("A temperatura atual é " + temperatura + "°K");
                System.out.print("você quer converter a temperatura?(sim)(não) ");
                String resposta = sc.nextLine();

                if (resposta.equals("sim")) {

                    System.out.println("1)Celsius");
                    System.out.println("2)Fahrenheit");
                    System.out.print("Escolha uma opção:");
                    int opcao = sc.nextInt();
                    sc.nextLine();

                    if (opcao == 1) {

                        Float antigoValor = temperatura;
                        float novoValor = temperatura - 273;
                        System.out.println("O antigo valor era " + antigoValor + "°K" +" e o novo valor é " + novoValor + "°C");
                        temperatura = novoValor;
                        tipoTemperatura = 1;

                    }else if(opcao == 2){

                    }else{
                        System.out.println("opção inválida.");
                    }

            }else{
                System.out.println("Erro.");
            }
            
        } 
    }

    sc.close();
    
}
}
