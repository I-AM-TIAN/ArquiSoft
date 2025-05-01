package com.example.mvvm.paymentmethods;

import lombok.*;
import jakarta.persistence.*;


@Entity
@Table(name = "payment_methods")
@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
