package wiese.service.user;

import wiese.domain.user.Client;
import wiese.service.IService;

import java.util.Set;

public interface ClientService extends IService<Client, String> {
    Set<Client> getAll();
}
