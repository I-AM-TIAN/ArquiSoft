package com.example.mvvm.views;

import com.example.mvvm.ViewModel.PaymentMethodViewModel;
import com.example.mvvm.models.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metodos-pago")
@CrossOrigin(origins = "*")
public class PaymentMethodsView {

    @Autowired
    private PaymentMethodViewModel paymentMethodViewModel;

    @GetMapping
    public List<PaymentMethod> getAllPaymentMethods() {
        return paymentMethodViewModel.getAllPaymentMethods();
    }

    @PostMapping
    public PaymentMethod savePaymentMethod(@RequestBody PaymentMethod paymentMethod) {
        return paymentMethodViewModel.savePaymentMethod(paymentMethod);
    }

    @DeleteMapping("/{id}")
    public void deletePaymentMethod(@PathVariable Long id) {
        paymentMethodViewModel.deletePaymentMethod(id);
    }

    @PutMapping("/{id}")
    public PaymentMethod updatePaymentMethod(@PathVariable Long id, @RequestBody PaymentMethod paymentMethod) {
        paymentMethod.setId(id); // Forzamos el id recibido por URL
        return paymentMethodViewModel.updatePaymentMethod(paymentMethod);
    }
    
}
