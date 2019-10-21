package wiese.controller.quotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import wiese.domain.quotation.Quotation;
import wiese.service.quotation.impl.QuotationServiceImpl;

import java.util.List;
import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/quotationsystem/lookup/quotation")
public class QuotationController {
    @Autowired
    @Qualifier("QuotationServiceImpl")
    private QuotationServiceImpl quotationService;

    @PostMapping("/new")
    public Quotation create(@RequestBody Quotation quotation){

        return quotationService.create(quotation);
    }

    @GetMapping(path = "/find/{id}")
    public Quotation findById(@PathVariable String id){

        Quotation account = quotationService.read(id);
        return account;
    }

    @PutMapping("/update")
    public void update(@RequestBody Quotation account){

        quotationService.update(account);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        quotationService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Quotation> getAll(){
        return quotationService.getAll();
    }


}
