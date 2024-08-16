import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome;
    Integer matricula;
    List<Double> notas;

    public Aluno(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(Double nota){
        if ((nota > 0.0) && (nota < 10.0)) {
            this.notas.add(nota);
        }
    }

    public Double calcularMedia(){
        Double media = 0.0;
        for (Double nota : notas) {
            media += nota;
        }
        return media / 3;
    }

    public void verificarAprovacao(){
        if (calcularMedia() < 6.0) {
            System.out.println("Reprovado");
        }else{
            System.out.println("Aprovado");
        }
    }
}