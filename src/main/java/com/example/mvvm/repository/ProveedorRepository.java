package com.example.mvvm.repository;

import com.example.mvvm.models.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
    // Aquí puedes agregar consultas personalizadas si es necesario
}