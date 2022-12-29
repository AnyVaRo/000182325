package com.example._000182325final.infrastructure.repositories;

import com.example._000182325final.domain.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteJpaRepository extends JpaRepository<Cliente, Long> {
    Cliente getByDni(String dni);
}
