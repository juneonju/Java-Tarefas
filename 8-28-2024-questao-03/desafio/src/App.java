public class App {
    
    public static void main(String[] args) {
       Loja loja = new Loja();

       loja.adicionarProduto(new Produto("Celular", 1000.0, "Eletronicos"));
       loja.adicionarProduto(new Produto("Pc", 2000.0, "Eletronicos"));
       loja.adicionarProduto(new Produto("Sabonete", 2.0, "Higiene"));
       loja.adicionarProduto(new Produto("Buxa", 10.0, "Higiene"));

       System.out.println("LISTA: " + loja.retornarLista());
       System.out.println('\n');
       System.out.println("BUSCA POR NOME: " + loja.buscarPorNome("Celular").toString());
       System.out.println('\n');
       System.out.println( "BUSCA POR CATEGORIA: " +loja.buscarPorCategoria("Higiene").toString());
    }
}
