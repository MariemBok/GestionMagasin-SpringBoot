package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.service.StockService;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockRestController {

    @Autowired
    StockService stockService;

    //http://localhost:8081/SpringMVC/stock/retrieve-all-stocks

    @GetMapping("/retrieve-all-stocks")
    @ResponseBody
    List<Stock> getStocks(){
        return stockService.retrieveAllStocks();
    }

    //http://localhost:8081/SpringMVC/stock/retrieve-stock/8

    @GetMapping("/retrieve-stock/{stock-id}")
    @ResponseBody
    Stock getStock(@PathVariable("stock-id") Long StockId){
        return stockService.retrieveStock(StockId);
    }

    //http://localhost:8081/SpringMVC/stock/add-stock

    @PostMapping("/add-stock")
    @ResponseBody
    Stock addStock(@RequestBody Stock stock){
        return stockService.addStock(stock);
    }

    //http://localhost:8081/SpringMVC/stock/update-stock

    @PutMapping("/update-stock")
    @ResponseBody
    Stock modifyStock(@RequestBody Stock stock){
        return stockService.updateStock(stock);
    }

    //http://localhost:8081/SpringMVC/stock/delete-stock/8

    @DeleteMapping("/delete-stock/{stock-id}")
    @ResponseBody
    void deleteStock(@PathVariable("stock-id")Long StockId){
        stockService.deleteStock(StockId);
    }
}
