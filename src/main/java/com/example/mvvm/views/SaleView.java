package com.example.mvvm.views;

import com.example.mvvm.ViewModel.SaleViewModel;
import com.example.mvvm.models.Product;
import com.example.mvvm.models.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
@CrossOrigin(origins = "*")
public class SaleView {
    @Autowired
    private SaleViewModel saleViewModel;

    @GetMapping
    public List<Sale> getAllSales() {
        return saleViewModel.getAllSales();
    }

    @PostMapping
    public Sale saveSale(@RequestBody Sale sale) {
        return saleViewModel.saveSale(sale);
    }

     @DeleteMapping("/{id}")
    public void deleteSale(@PathVariable Long id) {
        saleViewModel.deleteSale(id);
    }

    @PutMapping("/{id}")
    public Sale updateSale(@PathVariable Long id, @RequestBody Sale sale) {
        sale.setId(id); // Forzamos el id recibido por URL
        return saleViewModel.updateSale(sale);
    }
    
    
}
