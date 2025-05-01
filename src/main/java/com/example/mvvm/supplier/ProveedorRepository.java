package com.example.mvvm.supplier;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
    // Aquí puedes agregar consultas personalizadas si es necesario
}