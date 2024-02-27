package Entity;

public class Product {
    public String Code;
    public String name;
    public String description;
    public double price;

    public Product(String code, String name, String description, double price) {
        Code = code;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
