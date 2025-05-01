package com.example.mvvm.shipping;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "envios")  // Puedes cambiar el nombre de la tabla si lo deseas
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Envio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String direccion;  // Dirección de envío

    // Si necesitas más información, como fecha o información de contacto, puedes añadir más campos aquí
}
