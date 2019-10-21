package wiese.service.order;

import wiese.domain.order.Product;
import wiese.service.IService;

import java.util.List;

public interface ProductService extends IService<Product, String> {
    Product retrieveByDesc(String productDesc);
    List<Product> getAll();
}
