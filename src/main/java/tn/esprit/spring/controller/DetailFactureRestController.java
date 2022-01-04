package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.service.detailfacture.DetailFactureService;

@RestController
@RequestMapping("/detailfacture")
public class DetailFactureRestController {

    @Autowired
    DetailFactureService detailFactureService;

    @PostMapping("/add")
    @ResponseBody
    DetailFacture addDetailFacture(@RequestBody DetailFacture df){
        return detailFactureService.addDetailFacture(df);
    }

    @DeleteMapping("/remove/{id}")
    @ResponseBody
    void deleteDetailFacture(@PathVariable("id") Long id){
        detailFactureService.deleteDetailFacture(id);
    }
}
