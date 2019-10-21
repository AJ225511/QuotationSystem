package wiese.controller.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import wiese.domain.order.Product;
import wiese.service.order.impl.ProductServiceImpl;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/quotationsystem/lookup/product")
public class ProductController {
    @Autowired
    @Qualifier("ProductServiceImpl")
    private ProductServiceImpl productService;

    @PostMapping("/new")
    public Product create(@RequestBody Product product){

        return productService.create(product);
    }

    @GetMapping(path = "/find/{id}")
    public Product findById(@PathVariable String id){

        Product account = productService.read(id);
        return account;
    }

    @PutMapping("/update")
    public void update(@RequestBody Product account){

        productService.update(account);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        productService.delete(id);
    }

    @GetMapping("/getall")
    public List<Product> getAll(){
        return productService.getAll();
    }


}

