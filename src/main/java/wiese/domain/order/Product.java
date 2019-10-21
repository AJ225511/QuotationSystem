package wiese.domain.order;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Product {

    @Id
    private String productId;
    private String productDesc;

    public Product(String productId, String productDesc) {
        this.productId = productId;
        this.productDesc = productDesc;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return Objects.equals(productId, that.productId) &&
                Objects.equals(productDesc, that.productDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productDesc);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }
}
