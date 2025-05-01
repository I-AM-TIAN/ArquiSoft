package com.example.mvvm.sale;

import com.example.mvvm.client.Client;
import com.example.mvvm.paymentmethods.PaymentMethod;
import com.example.mvvm.product.Product;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sales")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double discount;
    private double totalPrice;
    private String date;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "payment_method_id", nullable = false)
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
}
