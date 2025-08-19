package com.example.ms_cliente.Repository;


import com.example.ms_cliente.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
