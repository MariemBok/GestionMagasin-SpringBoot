package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.*;
import tn.esprit.spring.service.ProduitService;

import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitRestController {

    @Autowired
    ProduitService produitService;

    // http://localhost:8081/SpringMVC/produit/retrieve-all-produits

    @GetMapping("/retrieve-all-produits")
    @ResponseBody
    public List<Produit> getProduits(){
        List<Produit> listProduit = produitService.retrieveAllProduits();

        return listProduit;
    }

    // http://localhost:8081/SpringMVC/produit/retrieve-produit/8

    @GetMapping("/retrieve-produit/{produit-id}")
    @ResponseBody
    public Produit getProduit(@PathVariable("produit-id")Long ProduitId){
        return produitService.retrieveProduit(ProduitId);
    }

    // http://localhost:8081/SpringMVC/produit/add-produit

    @PostMapping("/add-produit")
    @ResponseBody
    public Produit addProduit(@RequestBody Produit produit){
        return produitService.addProduit(produit);
    }

    // http://localhost:8081/SpringMVC/produit/delete-produit/13

    @DeleteMapping("/delete-produit/{produit-id}")
    @ResponseBody
    public void removeProduit(@PathVariable("produit-id") Long id){
        produitService.deleteProduit(id);
    }

    // http://localhost:8081/SpringMVC/produit/update-produit/14

    @PutMapping("/update-produit")
    @ResponseBody
    public Produit updateProduit(@RequestBody Produit produit){
        return produitService.updateProduit(produit);
    }
}
