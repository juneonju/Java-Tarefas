import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    List<ContaBancaria> contasBancaria;

    public Repositorio() {
       this.contasBancaria = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta){
        this.contasBancaria.add(conta);
    }

    public ContaBancaria buscarConta(int numero){
        for (ContaBancaria conta : contasBancaria) {
            if (numero == conta.numero) {
                return conta;
            }
        }
        return null;
    }
}
