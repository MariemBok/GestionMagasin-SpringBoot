package tn.esprit.spring.service;

import tn.esprit.spring.entity.Stock;

import java.util.List;

public interface StockService {

    List<Stock> retrieveAllStocks();
    Stock addStock(Stock stock);
    Stock updateStock(Stock s);
    Stock retrieveStock(Long id);
    void deleteStock(Long StockID);
}
