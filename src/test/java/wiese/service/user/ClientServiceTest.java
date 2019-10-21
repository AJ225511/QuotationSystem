//package wiese.service.user;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import wiese.domain.user.Client;
//import wiese.factory.user.ClientFactory;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ClientServiceTest {
//
//    @Autowired
//    private ClientService clientService;
//
//    @Test
//    public void create() {
//
//        Client client = ClientFactory.buildClient("Aj", "13 Bratton Way", "ajwiese@gnail.com", "123");
//        clientService.create(client);
//        System.out.println(client);
//        Assert.assertNotNull(clientService.getAll());
//
//    }
//
//    @Test
//    public void read(){
//        Client client = ClientFactory.buildClient("Aj", "13 Bratton Way", "ajwiese@gnail.com", null);
//        clientService.create(client);
//        Assert.assertNotNull(clientService.getAll());
//
//        Client client1 = clientService.read(client.getClientId());
//        Assert.assertEquals(client,client1);
//    }
//
//    @Test
//    public void update(){
//        Client client = ClientFactory.buildClient("Aj", "13 Bratton Way", "ajwiese@gnail.com", "123");
//        clientService.create(client);
//        Assert.assertNotNull(clientService.getAll());
//
//        Client clientUpdate = ClientFactory.buildClient("JJ", "15 Bratton Way", "jjwiese@gnail.com", "123");
//        clientUpdate.setClientId(client.getClientId());
//        clientService.update(clientUpdate);
//
//        Client updated = clientService.read(clientUpdate.getClientId());
//        Assert.assertEquals(clientUpdate,updated);
//    }
//
//    @Test
//    public void delete() {
//        Client client = ClientFactory.buildClient("Aj", "13 Bratton Way", "ajwiese@gnail.com", "123");
//        clientService.create(client);
//        Assert.assertNotNull(clientService.getAll());
//        clientService.delete(client.getClientId());
//
//        Client deleted = clientService.read(client.getClientId());
//        Assert.assertNull(deleted);
//
//    }
//}