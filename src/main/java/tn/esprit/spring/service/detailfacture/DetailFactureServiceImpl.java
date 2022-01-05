package tn.esprit.spring.service.detailfacture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.repository.DetailFactureRepository;

import java.util.List;

@Service
public class DetailFactureServiceImpl implements DetailFactureService{

    @Autowired
    DetailFactureRepository detailFactureRepository;


    public DetailFacture addDetailFacture(DetailFacture df){
        return detailFactureRepository.save(df);
    }


    public void deleteDetailFacture(Long id){
        detailFactureRepository.deleteById(id);
    }

    public List<DetailFacture> retrieveAllDetailFacture(){
        return (List<DetailFacture>) detailFactureRepository.findAll();
    }

}
