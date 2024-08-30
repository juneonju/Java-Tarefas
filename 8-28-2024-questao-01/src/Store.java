import java.util.List;

public class Store {
    List<Product> products;
    List<Request> requests;

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void createRequest(String id){
        
    }

    public void addProductToRequest(Strind idRequest, Product product){

    }

    public Double calculateTotalRequest(String idRequest){

    }

    public List<Request> listRequests(){
        return requests;
    }
}
