package wiese.factory.user;

import wiese.domain.user.Client;
import wiese.helper.IDGenerator;

public class ClientFactory {

    public static Client buildClient(String fname, String lname, String address, String clientId){
        return  new Client.Builder()
                .fname(fname)
                .lname(lname)
                .address(address)
                .clientId(IDGenerator.generateId())
                .build();
    }
}
