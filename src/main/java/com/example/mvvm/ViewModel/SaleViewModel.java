package com.example.mvvm.ViewModel;

import com.example.mvvm.models.Product;
import com.example.mvvm.models.Sale;
import com.example.mvvm.repository.ProductRepository;
import com.example.mvvm.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleViewModel {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private ProductRepository productRepository;

    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    public Sale saveSale(Sale sale) {
        calculateTotal(sale);
        return saleRepository.save(sale);
    }

    public void deleteSale(Long id) {
        saleRepository.deleteById(id);
    }

    public Sale updateSale(Sale sale) {
        calculateTotal(sale);
        return saleRepository.save(sale);
    }

    private void calculateTotal(Sale sale) {
        if (sale.getProduct() != null) {
            Product product = productRepository.findById(sale.getProduct().getId()).orElse(null);
            if (product != null) {
                double discount = sale.getDiscount() / 100.0;
                double total = product.getPrice() * (1 - discount);
                sale.setTotalPrice(total);
            }
        }
    }
}
