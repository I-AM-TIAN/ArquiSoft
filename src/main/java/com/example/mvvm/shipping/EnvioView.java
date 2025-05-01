package com.example.mvvm.shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/envios")
@CrossOrigin(origins = "*")
public class EnvioView {

    @Autowired
    private EnvioViewModel envioViewModel;

    @GetMapping
    public List<Envio> getAllEnvios() {
        return envioViewModel.getAllEnvios();
    }

    @PostMapping
    public Envio saveEnvio(@RequestBody Envio envio) {
        return envioViewModel.saveEnvio(envio);
    }

    @DeleteMapping("/{id}")
    public void deleteEnvio(@PathVariable Long id) {
        envioViewModel.deleteEnvio(id);
    }

    @PutMapping("/{id}")
    public Envio updateEnvio(@PathVariable Long id, @RequestBody Envio envio) {
        envio.setId(id); // Forzamos el id recibido por URL
        return envioViewModel.updateEnvio(envio);
    }
    
}
