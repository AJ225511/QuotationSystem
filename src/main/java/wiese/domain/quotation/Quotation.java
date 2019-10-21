package wiese.domain.quotation;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Quotation {

    @Id
    private String quotationId;
    private String productId;
    private String orderId;
    private String clientId;
    private String employeeId;


    public Quotation(String quotationId, String productId,String orderId,String clientId,String employeeId) {
        this.quotationId = quotationId;
        this.productId = productId;
        this.orderId = orderId;
        this.clientId = clientId;
        this.employeeId = employeeId;
    }

    public String getQuotationId() {
        return quotationId;
    }

    public String getProductId() {
        return productId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getClientId() {
        return clientId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setQuotationId(String quotationId) {
        this.quotationId = quotationId;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quotation that = (Quotation) o;
        return Objects.equals(quotationId, that.quotationId) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(orderId, that.orderId)&&
                Objects.equals(clientId, that.clientId)&&
                Objects.equals(employeeId, that.employeeId);

    }

    @Override
    public int hashCode() {
        return Objects.hash(quotationId, productId, orderId, clientId, employeeId);
    }

    @Override
    public String toString() {
        return "Quotation{" +
                "quotationId='" + quotationId + '\'' +
                ", productId='" + productId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", clientId='" + clientId + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
