import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda();

        agenda.criarContato("junior", "82996016299");
        List<Contato> teste = agenda.buscarListaContatos();
        System.out.println(teste.get(0).nome + " " + teste.get(0).telefone);
    }
}
