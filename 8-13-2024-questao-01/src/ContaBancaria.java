public class ContaBancaria {
    int numero = 0;
    double saldo = 0;
    String titular;
    Repositorio repositorio;

    public ContaBancaria(int numero, double saldo, String titular, Repositorio repositorio) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.repositorio = repositorio;
    }

    public void sacar(double dinheiro){
        if (dinheiro <= saldo) {
            saldo = saldo - dinheiro;
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double dinheiro){
        if (dinheiro > 0) {
            saldo = dinheiro + saldo;
        }
    }

    public void transferir(int numero, int valorTransferir){
        if (repositorio.buscarConta(numero) != null) {
            this.sacar(valorTransferir);
            repositorio.buscarConta(numero).depositar(valorTransferir);
        }else{
            System.out.println("fodeu");
        }
    }
}
