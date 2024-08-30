import java.util.ArrayList;
import java.util.List;

public class Loja {
    List<Produto> produtos = new ArrayList<>();


    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public List<Produto> retornarLista(){
        return produtos;
    }

    public Produto buscarPorNome(String nome){
        for (Produto produto : produtos) {
            if (produto.nome.equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public List<Produto> buscarPorCategoria(String categoria){
        List<Produto> listaPorCategoria = new ArrayList<>();

        for (Produto produto : produtos) {
            if (produto.categoria.equals(categoria)) {
                listaPorCategoria.add(produto);
                
            }
        }
        return listaPorCategoria;
    }

}
