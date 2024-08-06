import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Funcionario {
    String nome;
    String matricula;
    List<LocalDateTime> pontosEntrada;
    List<LocalDateTime> pontoSaida;
    boolean entrou = false;

    public Funcionario(String name) {
        this.nome = name;
        this.pontosEntrada = new ArrayList<>();
        this.pontoSaida = new ArrayList<>();
        this.matricula = gerarMatricula();
    }

    public void baterPonto(){
        if(this.entrou){
            this.pontoSaida.add(LocalDateTime.now());
        }else{
            this.pontosEntrada.add(LocalDateTime.now());
            this.entrou = true;
        }
        
    }

    private String gerarMatricula(){
        Random rand = new Random();
        return Integer.toString(rand.nextInt(10000, 1000000000));
    }
}