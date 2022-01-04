package tn.esprit.spring.service.fournisseur;

import tn.esprit.spring.entity.Fournisseur;

import java.util.List;

public interface FournisseurService {

    List<Fournisseur> retrieveAllFournisseurs();

    Fournisseur addFournisseur(Fournisseur f);

    void deleteFournisseur(Long id);

    Fournisseur updateFournisseur(Fournisseur f);

    Fournisseur retrieveFournisseur(Long id);

}
