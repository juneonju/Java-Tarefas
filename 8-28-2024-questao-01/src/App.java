public class App {
    public static void main(String[] args) throws Exception {
        Store loja = new Store();
        Product produto1 = new Product("Camisa", 50.0);
        Product produto2 = new Product("Calça", 100.0);
        Request pedido1 = new Request("01");
        loja.addProduct(produto1);
        System.out.println(produto1.name);
        System.out.println(produto1.price);
        loja.addProduct(produto2);
        System.out.println(produto2.name);
        System.out.println(produto2.price);
        loja.createRequest(pedido1);
        System.out.println(pedido1.id);
        loja.addProductToRequest(produto1, "01");
        System.out.println(loja.listRequests());
        System.out.println(loja.calculateTotalRequest("01"));
    }
}
