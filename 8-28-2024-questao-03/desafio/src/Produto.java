public class Produto {
    String nome;
    Double preco;
    String categoria;
    
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", categoria=" + categoria + "]";
    }

    public Produto(String nome, Double preco, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

}
