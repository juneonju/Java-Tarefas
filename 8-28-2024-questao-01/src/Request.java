import java.util.ArrayList;
import java.util.List;

public class Request {
    String id;
    List<Product> products;

    public Request(String id) {
        this.id = id;
        this.products = new ArrayList<>();
    }
}
