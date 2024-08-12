public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario("junin");
        System.out.println(f1.nome);
        System.out.println(f1.matricula);
        f1.baterPonto();
        System.out.println(f1.pontosEntrada);
        f1.baterPonto();
        System.out.println(f1.pontosEntrada);
    }
}
