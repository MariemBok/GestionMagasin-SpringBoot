package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.Produit;

import java.util.List;

@Repository
public interface ProduitRepository extends CrudRepository<Produit,Long> {

    List<Produit> findAll();

    Produit save(Produit produit);

    @Query("select p from Produit p where p.id=:id")
    Produit findProduitById(@Param("id") Long id);




}
