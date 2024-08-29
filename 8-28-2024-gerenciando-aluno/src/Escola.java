import java.util.ArrayList;
import java.util.List;
// import Aluno;

public class Escola {
    List<Aluno> alunos;

    public Escola() {
        this.alunos = new ArrayList<>();
    }
    
    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void registrarNota(String matricula, String disciplina, List<Double> notas){
        
    }

    public Double calcularMedia(String matricula, String disciplina){
        return null;
    }

    public List<Aluno> listarAluno(){
        return alunos;
    }

    private Aluno encontrarAlunoPelaMatricula(String matricula){
        for (Aluno aluno : alunos) {
            if (aluno.matricula.equals(matricula)) {
                return aluno;
            }           
        }
        return null;
    }
}
