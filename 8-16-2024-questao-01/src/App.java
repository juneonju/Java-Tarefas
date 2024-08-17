import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora? ");
        Double ganhoHora = sc.nextDouble();
        sc.nextLine();
        System.out.print("Quantas horas você trabalhou essa semana? ");
        Integer horasTrabalhadas = sc.nextInt();
        Double salarioBruto = 0.0;
        for (int i = 0; i < horasTrabalhadas; i++) {
            salarioBruto += ganhoHora;    
        }
        
        Double impostoDeRenda = (11.0 * salarioBruto) / 100.0;
        Double inss = (8.0 * salarioBruto) / 100.0;
        Double sindicato = (5.0 * salarioBruto) / 100.0;
        Double salarioLiquido = salarioBruto - (impostoDeRenda + inss + sindicato);

        System.out.println("Salario bruto:" + salarioBruto + "\n" + "Imposto de renda:" + impostoDeRenda + "\n" + "INSS:" + inss + "\n" + "sindicato:" + sindicato + "\n" + "Salario liquido:" + salarioLiquido);

        sc.close();
    }
}
