package tn.esprit.spring.service.detailproduit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.repository.DetailProduitRepository;

@Service
public class DetailProduitServiceImpl implements DetailProduitService{

    @Autowired
    DetailProduitRepository detailProduitRepository;

    public DetailProduit addDetailProduit(DetailProduit dp){
        return detailProduitRepository.save(dp);
    }


    public DetailProduit updateDetailProduit(DetailProduit dp){
        return detailProduitRepository.save(dp);
    }
}
