package tn.esprit.spring.service.facture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.repository.ClientRepository;
import tn.esprit.spring.repository.FactureRepository;
import tn.esprit.spring.service.facture.FactureService;

import java.util.List;

@Service
public class FactureServiceImpl implements FactureService {

    @Autowired
    FactureRepository factureRepository;

    @Autowired
    ClientRepository clientRepository;

    public List<Facture> retrieveAllFactures(){
        return factureRepository.findAll();
    }

    public void cancelFacture(Long id){
        Facture f=factureRepository.findFactureById(id);
        f.setActive(false);
        factureRepository.save(f);
    }

    public Facture retrieveFacture(Long id){
        return factureRepository.findFactureById(id);
    }

    public List<Facture> getFacturesByClient(Long idClient){
        return factureRepository.findFactureByClient(idClient);
    }

    @Override
    public Facture addFacture(Facture f, Long idClient) {
        Client client= clientRepository.findClientById(idClient);
        f.setClient(client);
        return factureRepository.save(f);
    }
}
