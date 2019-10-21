package wiese.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wiese.domain.order.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
