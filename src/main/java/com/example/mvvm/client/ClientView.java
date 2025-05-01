package com.example.mvvm.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClientView {
    @Autowired
    private ClienteViewModel clientViewModel;

    @GetMapping
    public List<Client> getAllClients() {
        return clientViewModel.getAllClients();
    }

    @PostMapping
    public Client saveClient(@RequestBody Client client) {
        return clientViewModel.saveClient(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientViewModel.deleteClient(id);
    }

    @PutMapping("/{id}")
    public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
        client.setId(id); // Forzamos el id recibido por URL
        return clientViewModel.updateClient(client);
    }

}
