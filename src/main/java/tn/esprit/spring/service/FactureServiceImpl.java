package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.repository.FactureRepository;

import java.util.List;

@Service
public class FactureServiceImpl implements FactureService{

    @Autowired
    FactureRepository factureRepository;

    public List<Facture> retrieveAllFactures(){
        return factureRepository.findAll();
    }

    public void cancelFacture(Long id){
        Facture f= factureRepository.findFactureById(id);
        f.setActive(false);
    }

    public Facture retrieveFacture(Long id){
        return factureRepository.findFactureById(id);
    }

}
