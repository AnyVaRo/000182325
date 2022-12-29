package com.example._000182325final.application.controllers;

import com.example._000182325final.domain.models.Cliente;
import com.example._000182325final.domain.services.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "clientes")
@AllArgsConstructor
public class ClienteController {
    private ClienteService clienteService;
    @PostMapping
    ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        Cliente clienteCre = this.clienteService.create(cliente);
        return new ResponseEntity<>(clienteCre, HttpStatus.CREATED);
    }

    @GetMapping(path = "by-dni/{dni}")
    ResponseEntity<Cliente> getByDni(@PathVariable("dni") String dni){
        Cliente obtenido = this.clienteService.getByDni(dni);
        return new ResponseEntity<>(obtenido, HttpStatus.CREATED);
    }
}
