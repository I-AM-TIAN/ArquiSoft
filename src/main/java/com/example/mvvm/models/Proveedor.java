package com.example.mvvm.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "proveedores")  // Puedes cambiar el nombre de la tabla si lo deseas
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;  // Nombre del proveedor

    // Si se requiere alguna otra propiedad, como dirección o contacto, se podría añadir aquí
}
