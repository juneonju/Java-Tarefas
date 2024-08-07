import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    List<Funcionario> funcionarios;

    public Repositorio() {
        this.funcionarios = new ArrayList<>();
    }

    // Create
    public void criarFuncionario(String nome) {
        Funcionario funcionario = new Funcionario(nome);
        this.funcionarios.add(funcionario);
    }
    // Read
    public List<Funcionario> buscarListaDeFuncionarios(){
        return this.funcionarios;
    } 

    public Funcionario buscaFuncionarioPelaMatricula(String matricula){
        for (Funcionario funcionario : this.funcionarios) {
            if(funcionario.matricula.equals(matricula)){
                return funcionario;
            }
        }
        return null;
    }
    // Update
    public void alterarFuncionarioPelaMatricula(String matricula, String nome){
        if(buscaIndexPelaMatricula(matricula) == -1){return;}
        int index = buscaIndexPelaMatricula(matricula);
        funcionarios.get(index).nome = nome;
    }
    // Delete
    public void deletaFuncionarioPelaMatricula(String matricula){
        if(buscaIndexPelaMatricula(matricula) == -1){return;}
        int index = buscaIndexPelaMatricula(matricula);
        funcionarios.remove(index);
    }

    private Integer buscaIndexPelaMatricula(String matricula){
        for (int i = 0; i < funcionarios.size(); i++) {
            if(funcionarios.get(i).matricula.equals(matricula)){
                return i;
            }
        }
        return -1;
    }
}
