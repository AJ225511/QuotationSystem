package wiese.factory.order;

import wiese.domain.order.Order;
import wiese.helper.IDGenerator;

public class OrderFactory {

    public static Order createOrder(String orderId, String orderDate, String productId, String orderDesc){
        return new Order.Builder()
                .orderId(IDGenerator.generateId())
                .productId(productId)
                .orderDate(orderDate)
                .orderDesc(orderDesc)
                .build();
    }
}
