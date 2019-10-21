package wiese.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wiese.domain.order.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
}
