package tn.esprit.spring.service.client;

import tn.esprit.spring.entity.CategorieClient;
import tn.esprit.spring.entity.Client;
import java.util.Date;
import java.util.List;

public interface ClientService {

    List<Client> retrieveAllClients();
    Client addClient(Client c);
    void deleteClient(Long id);
    Client updateClient(Client c, Long id);
    Client retrieveClient(Long id);
    List<Client> getClientParCategorieClient(CategorieClient categorieClient);
}
