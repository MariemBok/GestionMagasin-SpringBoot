package tn.esprit.spring.service.rayon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.repository.RayonRepository;

import java.util.List;

@Service
public class RayonServiceImpl implements RayonService{

    @Autowired
    RayonRepository rayonRepository;

    public List<Rayon> retrieveAllRayons(){
        return (List<Rayon>) rayonRepository.findAll();
    }

    public Rayon addRayon(Rayon r){

      return rayonRepository.save(r);
    }

    public void deleteRayon(Long id){

        rayonRepository.deleteById(id);
    }

    public Rayon updateRayon(Rayon u){

      return   rayonRepository.save(u);
    }

    public Rayon retrieveRayon(Long id){

        return rayonRepository.findRayonById(id);
    }

}
