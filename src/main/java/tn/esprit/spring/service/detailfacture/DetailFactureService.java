package tn.esprit.spring.service.detailfacture;

import tn.esprit.spring.entity.DetailFacture;

public interface DetailFactureService {


    DetailFacture addDetailFacture(DetailFacture df);

    void deleteDetailFacture(Long id);
}
