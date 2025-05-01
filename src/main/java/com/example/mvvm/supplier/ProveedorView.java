package com.example.mvvm.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedores")
@CrossOrigin(origins = "*")
public class ProveedorView {

    @Autowired
    private ProveedorViewModel proveedorViewModel;

    // Crear un nuevo proveedor
    @PostMapping
    public ResponseEntity<Proveedor> agregarProveedor(@RequestBody Proveedor proveedor) {
        Proveedor nuevoProveedor = proveedorViewModel.agregarProveedor(proveedor);
        return ResponseEntity.ok(nuevoProveedor);
    }

    // Obtener todos los proveedores
    @GetMapping
    public ResponseEntity<List<Proveedor>> obtenerTodosProveedores() {
        List<Proveedor> proveedores = proveedorViewModel.obtenerTodosProveedores();
        return ResponseEntity.ok(proveedores);
    }

    
    @PutMapping("/{id}")
    public Proveedor actualizarProveedor(@PathVariable Long id, @RequestBody Proveedor proveedor) {
        proveedor.setId(id);
        return proveedorViewModel.actualizarProveedor(proveedor);
    }
    

    // Eliminar un proveedor por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProveedor(@PathVariable Long id) {
        proveedorViewModel.eliminarProveedor(id);
        return ResponseEntity.noContent().build();
    }
}

