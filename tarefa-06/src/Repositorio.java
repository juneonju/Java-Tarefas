import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    List<Funcionario> funcionarios;

    public Repositorio() {
        this.funcionarios = new ArrayList<>();
    }

    public void criarFuncionario(String nome) {
        Funcionario funcionario = new Funcionario(nome);
        this.funcionarios.add(funcionario);
    }

    public List<Funcionario> buscarListaDeFuncionarios(){
        return this.funcionarios;
    }
    
    public Funcionario buscarFuncionarioPelaMatricula(String matricula){
        for (Funcionario funcionario : this.funcionarios) {
            if(funcionario.matricula.equals(matricula)){
                return funcionario;
            }
        }
    }

    public void alterarFuncionarioPelaMatricula(String matricula, String nome){
        Funcionario funcionario = buscarFuncionarioPelaMatricula(matricula);
        if(funcionario == null){
            return;
        }
        funcionario.nome = nome;
    }

    public void deletaFuncionarioPelaMatricula(){
    
    }

    private integer buscaIndexPelaMatricula(String matricula){
        for (int i = 0; i < funcionarios.size(); i++) {
            if(funcionarios.get(i).matricula.equals(matricula)){
                return i;
            }
        }
    }
}
