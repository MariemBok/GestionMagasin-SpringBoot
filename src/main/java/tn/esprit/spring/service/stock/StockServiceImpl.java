package tn.esprit.spring.service.stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.repository.StockRepository;
import tn.esprit.spring.service.stock.StockService;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    StockRepository stockRepository;

     public List<Stock> retrieveAllStocks(){
         return (List<Stock>)stockRepository.findAll();
     }

     public Stock addStock(Stock stock){
         stockRepository.save(stock);
         return stock;
     }

     public Stock updateStock(Stock s){

        return stockRepository.save(s);
     }

     public Stock retrieveStock(Long id){
        return stockRepository.findById(id).orElse(null);
     }

     public void deleteStock(Long StockID){
         stockRepository.deleteById(StockID);
     }
}
