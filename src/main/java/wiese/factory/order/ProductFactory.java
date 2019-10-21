package wiese.factory.order;

import wiese.domain.order.Product;

public class ProductFactory {

    public static Product buildProduct(String productId, String productDesc){
        return new Product(productId, productDesc);
    }
}
