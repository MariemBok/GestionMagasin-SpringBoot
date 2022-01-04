package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Facture;

import java.util.List;

@Repository
public interface FactureRepository extends CrudRepository<Facture,Long> {

    List<Facture> findAll();

    @Query("select f from Facture f where f.id=:id")
    Facture findFactureById(@Param("id") Long id);

    @Query("select f from Facture f where f.client.id=:clientId")
    List<Facture> findFactureByClient(@Param("clientId") Long clientId);
}
