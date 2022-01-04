package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.CategorieClient;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.service.client.ClientService;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientRestController {
    @Autowired
    ClientService clientService;

    // http://localhost:8081/SpringMVC/client/retrieve-all-clients

    @GetMapping("/retrieve-all-clients")
    @ResponseBody
    public List<Client> getClients() {
        List<Client> listClients = clientService.retrieveAllClients();
        return listClients;
    }

    // http://localhost:8081/SpringMVC/client/retrieve-client/8

    @GetMapping("retrieve-client/{client-id}")
    @ResponseBody
    public Client getClient(@PathVariable("client-id") Long clientId) {
        return clientService.retrieveClient(clientId);
    }

    // http://localhost:8081/SpringMVC/get-clients/categ

    @GetMapping("get-clients/{Categ}")
    @ResponseBody
    public List<Client> getClientsByCateg(@PathVariable("Categ")CategorieClient categorieClient){
        return clientService.getClientParCategorieClient(categorieClient);
    }

    // http://localhost:8081/SpringMVC/client/add-client

    @PostMapping("/add-client")
    @ResponseBody
    public Client addClient(@RequestBody Client c) {
        Client client = clientService.addClient(c);
        return client;
    }

    // http://localhost:8081/SpringMVC/client/remove-client/{client-id}
    @DeleteMapping("/remove-client/{client-id}")
    @ResponseBody
    public void removeClient(@PathVariable("client-id") Long clientId) {
        clientService.deleteClient(clientId);
    }

    // http://localhost:8081/SpringMVC/client/modify-client/{id}
    @PutMapping("/modify-client/{id}")
    @ResponseBody
    public Client modifyClient(@RequestBody Client client,@PathVariable("id") Long id) {
        return clientService.updateClient(client,id);
    }
}
