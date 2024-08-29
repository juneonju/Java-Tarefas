import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Aluno {
    String nome;
    String matricula;
    Map<String,List<Double>> notas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new HashMap<>();
    }
}
