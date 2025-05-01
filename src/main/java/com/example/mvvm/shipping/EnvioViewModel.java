package com.example.mvvm.shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvioViewModel {
    @Autowired
    private EnvioRepository envioRepository;

    public List<Envio> getAllEnvios() {
        return envioRepository.findAll();
    }

    public Envio saveEnvio(Envio envio) {
        return envioRepository.save(envio);
    }

    public void deleteEnvio(Long id) {
        envioRepository.deleteById(id);
    }

    public Envio updateEnvio(Envio envio) {
        return envioRepository.save(envio);
    }
}
