package SOLID;

import Entity.Product;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SingleResponsibilityPrinciple {

    public Optional<Product> maxProduct(List<Product> products){
        return products.stream()
                .max(Comparator.comparingDouble(Product::getPrice));
    }
}
