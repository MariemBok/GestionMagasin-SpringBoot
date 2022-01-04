package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.service.rayon.RayonService;

import java.util.List;

@RestController
@RequestMapping("/rayon")
public class RayonRestController {

    @Autowired
    RayonService rayonService;

    @GetMapping("/retrieve-all-rayons")
    @ResponseBody
    List<Rayon> getAllRayons(){
        return rayonService.retrieveAllRayons();
    }

    @GetMapping("/retrieve-rayon/{rayon-id}")
    @ResponseBody
    Rayon getRayon(@PathVariable("rayon-id") Long id){
        return rayonService.retrieveRayon(id);
    }

    @PostMapping("/add-rayon")
    @ResponseBody
    Rayon addRayon(@RequestBody Rayon rayon){
        return rayonService.addRayon(rayon);
    }

    @PutMapping("/modify-rayon")
    @ResponseBody
    Rayon updateRayon(@RequestBody Rayon r){
        return rayonService.updateRayon(r);
    }

    @DeleteMapping("/remove-rayon/{rayon-id}")
    @ResponseBody
    void removeRayon(@PathVariable("rayon-id") Long id){
        rayonService.deleteRayon(id);
    }
}
