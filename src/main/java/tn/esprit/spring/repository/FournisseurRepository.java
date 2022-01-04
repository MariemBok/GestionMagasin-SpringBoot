package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.Fournisseur;

@Repository
public interface FournisseurRepository extends CrudRepository <Fournisseur,Long>{

    @Query("select f from Fournisseur f where f.id=:id")
    Fournisseur findFournisseurById(@Param("id") Long id);
}
