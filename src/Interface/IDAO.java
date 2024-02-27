package Interface;

import Entity.Product;

import java.util.List;
import java.util.Objects;

public interface IDAO {
    public List<String> GetProduct(List<Product> products);
}
