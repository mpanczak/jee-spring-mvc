package pl.coderslab.shop;

public class Product {
    String name;
    double price;
    long id;

    public Product(Product product) {
    }

    public Product(String name, double price, long id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }
}
