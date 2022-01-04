package tn.esprit.spring.service.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.CategorieClient;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.repository.ClientRepository;

import java.util.List;

@Service
public class ClienServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> retrieveAllClients(){
        return clientRepository.findAll();
    }

    public Client addClient(Client c){
        clientRepository.save(c);
        return c;
    }

    public void deleteClient(Long id){
        clientRepository.deleteById(id);
    }

    public Client updateClient(Client c, Long id){
       return clientRepository.save(c);
    }
    public Client retrieveClient(Long id){
        return clientRepository.findClientById(id);
    }

    public List<Client> getClientParCategorieClient(CategorieClient categorieClient){
        return clientRepository.findClientByCateg(categorieClient);
    }

}
