package wiese.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import wiese.domain.user.Client;
import wiese.service.user.impl.ClientServiceImpl;

import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/quotationsystem/lookup/client")
public class ClientController {
    @Autowired
    @Qualifier("ClientServiceImpl")
    private ClientServiceImpl clientService;

    @PostMapping("/new")
    public Client create(@RequestBody Client client){

        return clientService.create(client);
    }

    @GetMapping(path = "/find/{id}")
    public Client findById(@PathVariable String id){

        Client account = clientService.read(id);
        return account;
    }

    @PutMapping("/update")
    public void update(@RequestBody Client account){

        clientService.update(account);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        clientService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Client> getAll(){
        return clientService.getAll();
    }


}
