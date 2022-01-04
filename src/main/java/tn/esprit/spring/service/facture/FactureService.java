package tn.esprit.spring.service.facture;

import tn.esprit.spring.entity.Facture;

import java.util.List;

public interface FactureService {

    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);
    List<Facture> getFacturesByClient(Long idClient);
    Facture addFacture(Facture f, Long idClient);


}
