package wiese.controller.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import wiese.domain.order.Order;
import wiese.service.order.impl.OrderServiceImpl;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/quotationsystem/lookup/order")
public class OrderController {

    @Autowired
    @Qualifier("OrderServiceImpl")
    private OrderServiceImpl orderService;

    @PostMapping("/new")
    public Order create(@RequestBody Order order){

        return orderService.create(order);
    }

    @GetMapping(path = "/find/{id}")
    public Order findById(@PathVariable String id){

        Order account = orderService.read(id);
        return account;
    }

    @PutMapping("/update")
    public void update(@RequestBody Order account){

        orderService.update(account);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        orderService.delete(id);
    }

    @GetMapping("/getall")
    public List<Order> getAll(){
        return orderService.getAll();
    }


}
