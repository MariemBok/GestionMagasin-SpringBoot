package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.Rayon;

@Repository
public interface RayonRepository extends CrudRepository<Rayon,Long> {

    @Query("select r from Rayon r where r.id=:id")
    Rayon findRayonById(@Param("id") Long id);
}
