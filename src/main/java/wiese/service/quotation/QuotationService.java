package wiese.service.quotation;

import wiese.domain.quotation.Quotation;
import wiese.service.IService;

import java.util.Set;

public interface QuotationService extends IService<Quotation, String> {
    Set<Quotation> getAll();
}
