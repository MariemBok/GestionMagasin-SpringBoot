package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.service.fournisseur.FournisseurService;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurRestController {

    @Autowired
    FournisseurService fournisseurService;

    //http://localhost:8081/SpringMVC/fournisseur/retrieve-all-fournisseurs

    @GetMapping("/retrieve-all-fournisseurs")
    @ResponseBody
    List<Fournisseur> getAllFournisseurs(){
        return fournisseurService.retrieveAllFournisseurs();
    }

    //http://localhost:8081/SpringMVC/fournisseur/retrieve-fournisseur/id

    @GetMapping("/retrieve-fournisseur/{fournisseur-id}")
    @ResponseBody
    Fournisseur getFournisseur(@PathVariable("fournisseur-id") Long Id){
        return fournisseurService.retrieveFournisseur(Id);
    }

    //http://localhost:8081/SpringMVC/fournisseur/add-fournisseur

    @PostMapping ("/add-fournisseur")
    @ResponseBody
    Fournisseur AddFournisseur(@RequestBody Fournisseur f){
        return fournisseurService.addFournisseur(f);
    }

    //http://localhost:8081/SpringMVC/fournisseur/delete-fournisseur/id

    @DeleteMapping("/delete-fournisseur/{fournisseur-id}")
    @ResponseBody
    void DeleteFournisseur(@PathVariable("fournisseur-id")Long id){
        fournisseurService.deleteFournisseur(id);
    }

    //http://localhost:8081/SpringMVC/fournisseur/modify-fournisseur

    @PutMapping("/modify-fournisseur")
    @ResponseBody
    Fournisseur UpdateFournisseur(@RequestBody Fournisseur f){
        return fournisseurService.updateFournisseur(f);
    }



}
