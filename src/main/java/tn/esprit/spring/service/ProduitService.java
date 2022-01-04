package tn.esprit.spring.service;

import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.entity.Stock;

import java.util.List;

public interface ProduitService {

    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p);

    Produit retrieveProduit(Long id);

    void deleteProduit(Long id);

    Produit updateProduit(Produit u);
}
