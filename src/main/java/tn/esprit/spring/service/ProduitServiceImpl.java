package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.repository.ProduitRepository;

import java.util.List;
@Service
public class ProduitServiceImpl implements ProduitService{

    @Autowired
    ProduitRepository produitRepository;

    public List<Produit> retrieveAllProduits(){
        return produitRepository.findAll();
    }

    public Produit addProduit(Produit p){
        produitRepository.save(p);
        return  p;
    }

    public Produit retrieveProduit(Long id){
        return produitRepository.findProduitById(id);
    }

    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);
    }

    public Produit updateProduit(Produit u){
        return produitRepository.save(u);
    }
}
