package wiese.service.order.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wiese.domain.order.Product;
import wiese.repository.order.ProductRepository;
import wiese.service.order.ProductService;

import java.util.List;
import java.util.Optional;

@Service("ProductServiceImpl")
public class ProductServiceImpl implements ProductService {
    private static ProductService productService = null;

    @Autowired
    private ProductRepository productRepository;

    private ProductServiceImpl(){

    }

    public static ProductService getProductService(){
        if(productService == null) productService = new ProductServiceImpl();
        return productService;
    }


    @Override
    public Product create(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Product read(String s) {
        Optional<Product> optionalProduct = this.productRepository.findById(s);
        return optionalProduct.orElse(null);
    }

    @Override
    public Product update(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public void delete(String s) {
        this.productRepository.deleteById(s);
    }

    @Override
    public Product retrieveByDesc(String productDesc) {
        List<Product> products = getAll();
        for(Product product: products){
            if(product.getProductDesc().equalsIgnoreCase(productDesc)) return product;
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        return this.productRepository.findAll();
    }
}
