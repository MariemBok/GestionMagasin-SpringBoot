package tn.esprit.spring.service.detailfacture;

import tn.esprit.spring.entity.DetailFacture;

import java.util.List;

public interface DetailFactureService {


    List<DetailFacture> retrieveAllDetailFacture();

    DetailFacture addDetailFacture(DetailFacture df);

    void deleteDetailFacture(Long id);
}
