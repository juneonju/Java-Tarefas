public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("junior", 1);
        aluno.adicionarNota(5.0);
        aluno.adicionarNota(9.0);
        aluno.adicionarNota(3.0);
        aluno.calcularMedia();
        aluno.verificarAprovacao();
    }
}
