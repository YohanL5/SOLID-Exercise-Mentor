import Entity.Product;
import SOLID.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Product> products= new ArrayList<>();
        products.add(new Product("C5#2","Detergente","detergente para ropa",25255.555D));
        products.add(new Product("C5#4","Jabon","jabon para ropa",6055D));
        products.add(new Product("C5#5","Jabon laba","jabon para loza",45235D));
        products.add(new Product("C5#6","Tenis","tenis",35235D));
        products.add(new Product("C5#7","Crema","Crema dental",25235.222D));


        //S of SOLID
        SingleResponsibilityPrinciple functionMax= new SingleResponsibilityPrinciple();
        Optional<Product> product= functionMax.maxProduct(products);
        System.out.println("Producto con precio maximo: "+product.toString());


        //O of SOLID
        OpenClosedPrincipeFigureCircle circle= new OpenClosedPrincipeFigureCircle(25);
        double respCircle= circle.CalculateArea();
        System.out.println("Area del Circulo= "+respCircle);

        //L of SOLID
        LiskovSubstitutionPrincipleRectangle rectangle= new LiskovSubstitutionPrincipleRectangle(12,10);
        double respRectangle=rectangle.CalculateArea();
        System.out.println("Area del Rectangulo= "+respRectangle);

        //I of SOLID
        InterfaceSegregationPrincipleAnimal animal=new InterfaceSegregationPrincipleAnimal();
        System.out.println(animal.Run());

        //D of SOLID
        DependencyInversionPrincipleProduct dependency= new DependencyInversionPrincipleProduct();
        List<String> resp=dependency.GetProduct(products);
        System.out.println(resp);
    }
}