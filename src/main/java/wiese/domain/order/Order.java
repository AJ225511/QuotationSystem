package wiese.domain.order;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderId;
    private String productId;
    private String orderDate;
    private String orderDesc;

    public Order(String s){}

    private Order(Builder builder){
        this.orderId = builder.orderId;
        this.productId = builder.productId;
        this.orderDate = builder.orderDate;
        this.orderDesc = builder.orderDesc;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public static class Builder{
        private String orderId;
        private String productId;
        private String orderDate;
        private String orderDesc;

        public Builder(){}

        public Builder orderId(String orderId){
            this.orderId = orderId;
            return this;
        }

        public Builder productId(String productId){
            this.productId = productId;
            return this;
        }

        public Builder orderDate(String orderDate){
            this.orderDate = orderDate;
            return this;
        }

        public Builder orderDesc(String orderDesc){
            this.orderDesc = orderDesc;
            return this;
        }

        public Builder copy(Order employee){
            this.orderId(employee.getOrderId());
            this.productId(employee.getProductId());
            this.orderDate(employee.getOrderDate());
            this.orderDesc(employee.getOrderDesc());
            return this;
        }

        @Override
        public String toString(){
            return "Builder{" +
                    "orderId=" +orderId+
                    ", productId='" + productId + '\'' +
                    ", orderDate='" + orderDate + '\'' +
                    ", orderDesc='" + orderDesc + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o){
            if(this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder that = (Builder) o;
            return Objects.equals(orderId, that.orderId) &&
                    Objects.equals(productId, that.productId)&&
                    Objects.equals(orderDate, that.orderDate)&&
                    Objects.equals(orderDesc, that.orderDesc);
        }

        @Override
        public int hashCode(){
            return Objects.hash(orderId, productId, orderDate, orderDesc);
        }

        public Order build() {
            return new Order(this);
        }
    }
}
