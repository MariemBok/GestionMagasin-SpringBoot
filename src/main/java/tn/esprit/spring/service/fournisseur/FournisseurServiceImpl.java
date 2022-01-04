package tn.esprit.spring.service.fournisseur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.repository.FournisseurRepository;
import tn.esprit.spring.service.fournisseur.FournisseurService;

import java.util.List;

@Service
public class FournisseurServiceImpl implements FournisseurService {

    @Autowired
    FournisseurRepository fournisseurRepository;

   public List<Fournisseur> retrieveAllFournisseurs(){

       return (List<Fournisseur>) fournisseurRepository.findAll();
   }

   public Fournisseur addFournisseur(Fournisseur f){
        return fournisseurRepository.save(f);
   }

   public void deleteFournisseur(Long id){
        fournisseurRepository.deleteById(id);
   }

   public Fournisseur updateFournisseur(Fournisseur f){
        return fournisseurRepository.save(f);
   }

   public Fournisseur retrieveFournisseur(Long id){
        return fournisseurRepository.findFournisseurById(id);
   }
}

