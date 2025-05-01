package com.example.mvvm.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*")
public class CategoryView {

    @Autowired
    private CategoryViewModel categoryViewModel;

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryViewModel.getAllCategories();
    }

    @PostMapping
    public Category saveCategory(@RequestBody Category category) {
        return categoryViewModel.saveCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryViewModel.deleteCategory(id);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
        category.setId(id); // Forzamos el id recibido por URL
        return categoryViewModel.updateCategory(category);
    }    
    
}
