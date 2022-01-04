package tn.esprit.spring.service;

import tn.esprit.spring.entity.Facture;

import java.util.List;

public interface FactureService {

    List<Facture> retrieveAllFactures();

    List<Facture> getFacturesByClient(Long
                                              idClient);

    Facture addFacture(Facture
                               f, Long idClient);

    void cancelFacture(Long
                               id);

    Facture retrieveFacture(Long
                                    id);


}
