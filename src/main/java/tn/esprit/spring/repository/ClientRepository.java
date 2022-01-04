package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.CategorieClient;
import tn.esprit.spring.entity.Client;

import java.util.Date;
import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {

    List<Client> findAll();

    Client save(Client client);

    void delete(Client entity);

    @Query("select c from Client c where c.id=:id")
    Client findClientById(@Param("id") Long id);

   /* @Modifying
    @Query("UPDATE Client c SET c.categ=: categorie where c.id=: id ")
    void updateClient(@Param("categorie") CategorieClient categorie, @Param("id")Long id);*/

    @Query("select c from Client c where c.categ=:categ")
    List<Client> findClientByCateg(@Param("categ") CategorieClient categ);
}
