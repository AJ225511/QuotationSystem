package wiese.repository.quotation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wiese.domain.quotation.Quotation;

@Repository
public interface QuotationRepository extends JpaRepository<Quotation, String> {
}
