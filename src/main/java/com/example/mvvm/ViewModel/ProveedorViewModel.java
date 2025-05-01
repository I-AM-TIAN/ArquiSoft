package com.example.mvvm.ViewModel;

import com.example.mvvm.models.Product;
import com.example.mvvm.models.Proveedor;
import com.example.mvvm.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
