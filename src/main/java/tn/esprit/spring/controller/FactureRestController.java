package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.service.FactureService;

import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureRestController {
    @Autowired
    FactureService factureService;

    //http://localhost:8081/SpringMVC/facture/retrieve-all-factures

    @GetMapping("/retrieve-all-factures")
    @ResponseBody
    public List<Facture> getFactures(){
        return factureService.retrieveAllFactures();
    }

    //http://localhost:8081/SpringMVC/facture/retrieve-facture/8

    @GetMapping("/retrieve-facture/{facture-id}")
    @ResponseBody
    public Facture getFacture(@PathVariable("facture-id") Long FactureId){
        return factureService.retrieveFacture(FactureId);
    }

    //http://localhost:8081/SpringMVC/facture/cancel-facture/8

    @PutMapping("/cancel-facture/{facture-id}")
    @ResponseBody
    public void CancelFacture(@PathVariable("facture-id") Long FactureId){
        factureService.cancelFacture(FactureId);
    }

}
