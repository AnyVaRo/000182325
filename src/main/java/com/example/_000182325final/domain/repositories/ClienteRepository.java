package com.example._000182325final.domain.repositories;


import com.example._000182325final.domain.models.Cliente;

import java.util.List;

public interface ClienteRepository {
    Cliente save(Cliente cliente);
    List<Cliente> getAll();
    Cliente getOne(Long id);
    Cliente getByDni(String dni);
    void delete(Long id);
}
