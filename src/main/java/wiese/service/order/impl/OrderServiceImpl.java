package wiese.service.order.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wiese.domain.order.Order;
import wiese.repository.order.OrderRepository;
import wiese.service.order.OrderService;

import java.util.List;
import java.util.Optional;

@Service("OrderServiceImpl")
public class OrderServiceImpl implements OrderService {

    private static OrderService orderService = null;

    @Autowired
    private OrderRepository orderRepository;
    private OrderServiceImpl(){

    }

    public static OrderService getOrderService(){
        if(orderService == null) orderService = new OrderServiceImpl();
        return orderService;
    }


    @Override
    public Order create(Order order) {
        return this.orderRepository.save(order);
    }

    @Override
    public Order read(String s) {
        Optional<Order> optionalOrder = this.orderRepository.findById(s);
        return optionalOrder.orElse(null);
    }

    @Override
    public Order update(Order order) {
        return this.orderRepository.save(order);
    }

    @Override
    public void delete(String s) {
        this.orderRepository.deleteById(s);
    }

    @Override
    public Order retrieveByDesc(String orderDesc) {
        List<Order> orders = getAll();
        for(Order order: orders){
            if(order.getOrderDesc().equalsIgnoreCase(orderDesc)) return order;
        }
        return null;
    }

    @Override
    public List<Order> getAll() {
        return this.orderRepository.findAll();
    }
}
