package com.example.mvvm.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorViewModel {

    private final ProveedorRepository proveedorRepository;

    @Autowired
    public ProveedorViewModel(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public Proveedor agregarProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public List<Proveedor> obtenerTodosProveedores() {
        return proveedorRepository.findAll();
    }

    public void eliminarProveedor(Long id) {
        proveedorRepository.deleteById(id);
    }
    
    public Proveedor actualizarProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }
}
