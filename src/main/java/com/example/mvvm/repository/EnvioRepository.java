package com.example.mvvm.repository;

import com.example.mvvm.models.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EnvioRepository extends JpaRepository<Envio, Long> {
    
}
