package SOLID;

import Entity.Product;
import Interface.IDAO;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DependencyInversionPrincipleProduct implements IDAO {

    @Override
    public List<String> GetProduct(List<Product> products) {
        Function<Product,String> productString=p->"Codigo: "+p.getCode()+" Nombre: "+p.getName()+" Descripcion: "+p.getDescription()+"Precio: "+p.getPrice();
        return products.stream().map(productString).toList();
    }
}
