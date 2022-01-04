package tn.esprit.spring.service.rayon;

import tn.esprit.spring.entity.Rayon;

import java.util.List;

public interface RayonService {

    List<Rayon> retrieveAllRayons();

    Rayon addRayon(Rayon r);

    void deleteRayon(Long id);

    Rayon updateRayon(Rayon u);

    Rayon retrieveRayon(Long id);

}
