package com.example.mvvm.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*")
public class ProductView {
    @Autowired
    private ProductViewModel productViewModel;

    @GetMapping
    public List<Product> getAllProducts() {
        return productViewModel.getAllProducts();
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productViewModel.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productViewModel.deleteProduct(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id); // Forzamos el id recibido por URL
        return productViewModel.updateProduct(product);
    }
}
