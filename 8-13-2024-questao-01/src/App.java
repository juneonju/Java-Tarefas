public class App {
    public static void main(String[] args) throws Exception {

        Repositorio repositorio = new Repositorio();
        ContaBancaria c1 = new ContaBancaria(1, 0, "juninho", repositorio);
        ContaBancaria c2 = new ContaBancaria(2, 0, "Salis", repositorio);
        repositorio.adicionarConta(c1);
        repositorio.adicionarConta(c2);

        c1.depositar(200);
        System.out.println(c1.saldo);
        c1.sacar(100);
        System.out.println(c1.saldo);

        

        c1.transferir(2, 100);
        System.out.println(c2.saldo);
    }
}
