package tn.esprit.spring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.service.stock.StockService;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockServiceImplTest {
    @Autowired
    StockService stockService;

    @Test
    public void testAddStock(){
        Stock s= new Stock();
        s.setLibellestock("stock stock");
        s.setQte(28);
        s.setQteMin(20);
        Stock savedStock= stockService.addStock(s);
        assertNotNull(stockService.retrieveStock(savedStock.getId()));
    }
}
