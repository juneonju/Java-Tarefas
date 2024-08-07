import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatos;
    
    public Agenda(){
        contatos = new ArrayList<>();
    }

    public void criarContato(String nome, String telefone){
        Contato contato = new Contato(nome, telefone);
        this.contatos.add(contato);
    }

    public List<Contato> buscarListaContatos() {
        return this.contatos;
    }
}
