package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.Stock;

import java.util.List;

@Repository
public interface StockRepository extends CrudRepository<Stock,Long>{

    /*List<Stock> findAll();

    Stock save(Stock stock);

    @Query("select s from Stock s where s.id=:id")
    Stock findStockById(@Param("id") Long id);

    @Modifying
    @Query("update Stock s SET s.qte=:quantite where s.id=:id")
    Stock updateStock(@Param("quantite") Integer quantite, @Param("id") Long id);

    void delete(Stock stock);*/

}
