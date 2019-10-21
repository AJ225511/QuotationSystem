package wiese.service.quotation.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wiese.domain.quotation.Quotation;
import wiese.repository.quotation.QuotationRepository;
import wiese.service.quotation.QuotationService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("QuotationServiceImpl")
public class QuotationServiceImpl implements QuotationService {

    private QuotationServiceImpl service = null;
    @Autowired
    private QuotationRepository repository;

    public QuotationServiceImpl getService(){

        if(service == null){
            return new QuotationServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Quotation> getAll(){
        List<Quotation> list = (List<Quotation>) repository.findAll();
        return new HashSet<>(list);
    }

    @Override
    public Quotation create(Quotation quotation){
        return repository.save(quotation);
    }

    @Override
    public Quotation read(String s){
        return repository.findById(s).orElse(null);
    }

    @Override
    public Quotation update(Quotation quotation){
        return repository.save(quotation);
    }

    @Override
    public void delete(String s){
        repository.deleteById(s);
    }
}
