import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> products;
    List<Request> requests;

    public Store() {
        products = new ArrayList<>();
        requests = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void createRequest(Request request){
        requests.add(request);
    }

    public void addProductToRequest(Product product, String id){
        if (findRequestById(id) != null) {
            findRequestById(id).products.add(product);
        }
    }

    public Double calculateTotalRequest(String idRequest){
        Double priceRequest = 0.0;
            if (findRequestById(idRequest) != null) {
                for (int i = 0; i < products.size(); i++) {
                    priceRequest += products.get(i).price;
                }
            }
        return priceRequest;
    }

    public List<Request> listRequests(){
        return requests;
    }

    public Request findRequestById(String id){
        for (Request request : requests) {
            if (request.id.equals(id)) {
                return request;
            }
        }
        return null;
    }
}
