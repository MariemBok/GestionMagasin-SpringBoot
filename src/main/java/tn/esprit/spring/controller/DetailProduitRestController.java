package tn.esprit.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.service.detailproduit.DetailProduitService;

@RestController
@RequestMapping("/detailproduit")
public class DetailProduitRestController {

    @Autowired
    DetailProduitService detailProduitService;

    @PostMapping("/add-detailproduit")
    @ResponseBody
    DetailProduit addDetailProduit(@RequestBody DetailProduit dp){
        return detailProduitService.addDetailProduit(dp);
    }

    @PutMapping("/modify-detailproduit")
    @ResponseBody
    DetailProduit modifyDetailProduit(@RequestBody DetailProduit dp){
        return detailProduitService.updateDetailProduit(dp);
    }
}
