package com.example._000182325final.domain.services;


import com.example._000182325final.domain.models.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente create(Cliente cliente);
    List<Cliente> getAll();
    Cliente getByDni(String dni);
    Cliente update(Cliente cliente);
}
