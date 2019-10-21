package wiese.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wiese.domain.user.Client;
import wiese.repository.user.ClientRepository;
import wiese.service.user.ClientService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("ClientServiceImpl")
public class ClientServiceImpl implements ClientService {

    private ClientServiceImpl service = null;
    @Autowired
    private ClientRepository repository;

    public ClientServiceImpl getService(){

        if(service == null){
            return new ClientServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Client> getAll(){
        List<Client> list = (List<Client>) repository.findAll();
        return new HashSet<>(list);
    }

    @Override
    public Client create(Client client){
        return repository.save(client);
    }

    @Override
    public Client read(String s){
        return repository.findById(s).orElse(null);
    }

    @Override
    public Client update(Client client){
        return repository.save(client);
    }

    @Override
    public void delete(String s){
        repository.deleteById(s);
    }
}

