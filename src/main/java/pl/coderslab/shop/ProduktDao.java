package pl.coderslab.shop;

import java.util.List;

public class ProduktDao {
    List<Product> getList(){
        List<Product> productList = List.of(
                new Product("chleb", 3.00, 10009),
                new Product("cola", 7.00, 10026),
                new Product("kalafior", 3.00, 10010),
                new Product("cebula", 2.00, 10090),
                new Product("pomidor", 5.00, 10011),
                new Product("jabłko", 3.00, 13012),
                new Product("pomarancza", 3.00, 20012),
                new Product("gruszka", 3.00, 10212),
                new Product("marchew", 3.00, 10612),
                new Product("cukier", 8.00, 10332),
                new Product("kawa", 8.00, 10339));
        return productList;
    }

    public Product getProductById (long id) {
        Product product = null;
        List<Product> products = getList();

        for (Product p : products) {
            if (p.getId() == id){
                product = p;
            }
        }
        return product;
    }
}
