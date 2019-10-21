package wiese.service.order;

import wiese.domain.order.Order;
import wiese.service.IService;

import java.util.List;

public interface OrderService extends IService<Order, String> {
    Order retrieveByDesc(String orderDesc);
    List<Order> getAll();
}
