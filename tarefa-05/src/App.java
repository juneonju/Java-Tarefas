import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        boolean ativo = true;

        System.out.print("Qual a temperatura você deseja inserir? ");
        double temperatura = sc.nextDouble();
        sc.nextLine();

        System.out.println("1) Celsius");
        System.out.println("2) Fahrenheit");
        System.out.println("3) Kelvin");
        System.out.print("Escolha uma opção de temperatura: ");
        int tipoTemperatura = sc.nextInt();
        sc.nextLine();

        while (ativo) {

            System.out.print("Prosseguir com esse temperatura(sim)(não)? ");
            String confirmar = sc.nextLine();

            if (confirmar.equals("sim")) {

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
    
                            double antigoValor = temperatura;
                            double novoValor = temperatura + 273.15;
                            System.out.println("O antigo valor era " + antigoValor + "°C" +" e o novo valor é " + novoValor + "°K");
                            System.out.print("você quer continuar(sim)(não): ");
                            String prosseguir = sc.nextLine();
    
                            if (prosseguir.equals("sim")) {
                                
                                temperatura = novoValor;
                                tipoTemperatura = 3;    
    
                            }else{
    
                                ativo = false;
    
                            }
                            
    
                        }else if(opcao == 2){
    
                            double antigoValor = temperatura;
                            double novoValor = (temperatura * 9/5) + 32;
                            System.out.println("O antigo valor era " + antigoValor + "°C" +" e o novo valor é " + novoValor + "°F");
                            System.out.print("você quer continuar(sim)(não): ");
                            String prosseguir = sc.nextLine();
    
                            if (prosseguir.equals("sim")) {
    
                                temperatura = novoValor;
                                tipoTemperatura = 2;    
    
                            }else{
    
                                ativo = false;
    
                            }
                            
                        }else{
    
                            System.out.println("opção inválida.");
    
                        }
    
                    }else {
    
                        System.out.println("erro.");
    
                    }
                    
                }else if(tipoTemperatura == 2){
    
                    System.out.println("A temperatura atual é " + temperatura + "°F");
                    System.out.print("você quer converter a temperatura?(sim)(não) ");
                    String resposta = sc.nextLine();
    
                    if (resposta.equals("sim")) {
    
                        System.out.println("1)Celsius");
                        System.out.println("2)Kelvin");
                        System.out.print("Escolha uma opção:");
                        int opcao = sc.nextInt();
                        sc.nextLine();
                    
                        if (opcao == 1) {
    
                            double antigoValor = temperatura;
                            double novoValor = (temperatura - 32) * 5/9;
                            System.out.println("O antigo valor era " + antigoValor + "°F" +" e o novo valor é " + novoValor + "°C");
                            System.out.print("você quer continuar(sim)(não): ");
                            String prosseguir = sc.nextLine();
    
                            if (prosseguir.equals("sim")) {
    
                                temperatura = novoValor;
                                tipoTemperatura = 1;    
    
                            }else{
    
                                ativo = false;
    
                            }
    
                        }else if(opcao == 2){
    
                            double antigoValor = temperatura;
                            double novoValor = (temperatura - 32) * 5/9 + 273.15;
                            System.out.println("O antigo valor era " + antigoValor + "°F" +" e o novo valor é " + novoValor + "°K");
                            System.out.print("você quer continuar(sim)(não): ");
                            String prosseguir = sc.nextLine();
    
                            if (prosseguir.equals("sim")) {
    
                                temperatura = novoValor;
                                tipoTemperatura = 3;   
    
                            }else{
    
                                ativo = false;
    
                            }
    
                        }else{
    
                            System.out.println("opção inválida.");
    
                        }
                    }
    
                }else if(tipoTemperatura == 3){
    
                    System.out.println("A temperatura atual é " + temperatura + "°K");
                    System.out.print("você quer converter a temperatura?(sim)(não) ");
                    String resposta2 = sc.nextLine();
    
                    if (resposta2.equals("sim")) {
    
                        System.out.println("1)Celsius");
                        System.out.println("2)Fahrenheit");
                        System.out.print("Escolha uma opção:");
                        int opcao = sc.nextInt();
                        sc.nextLine();
    
                        if (opcao == 1) {
    
                            double antigoValor = temperatura;
                            double novoValor = temperatura - 273.15;
                            System.out.println("O antigo valor era " + antigoValor + "°K" +" e o novo valor é " + novoValor + "°C");
                            System.out.print("você quer continuar(sim)(não): ");
                            String prosseguir = sc.nextLine();
    
                            if (prosseguir.equals("sim")) {
    
                                temperatura = novoValor;
                                tipoTemperatura = 1;   
    
                            }else{
    
                                ativo = false;
    
                            }
    
                        }else if(opcao == 2){
    
                            double antigoValor = temperatura;
                            double novoValor = (temperatura - 273.15) * 9/5 + 32;
                            System.out.println("O antigo valor era " + antigoValor + "°K" +" e o novo valor é " + novoValor + "°F");
                            System.out.print("você quer continuar(sim)(não): ");
                            String prosseguir = sc.nextLine();
    
                            if (prosseguir.equals("sim")) {
    
                                temperatura = novoValor;
                                tipoTemperatura = 2;   
    
                            }else{
    
                                ativo = false;
    
                            }
    
                        }else{
    
                            System.out.println("opção inválida.");
    
                        }
    
                }else{
    
                    System.out.println("Erro.");
    
                }
                
            }
                
            }else{

                System.out.print("Qual a temperatura você deseja inserir? ");
                temperatura = sc.nextDouble();
                sc.nextLine();

                System.out.println("1) Celsius");
                System.out.println("2) Fahrenheit");
                System.out.println("3) Kelvin");
                System.out.print("Escolha uma opção de temperatura: ");
                tipoTemperatura = sc.nextInt();
                sc.nextLine();
            } 
}

sc.close();

}
}