package com.example.ms_cliente.Service;

import com.example.ms_cliente.Entity.Cliente;


import java.util.List;
import java.util.Optional;

public interface ClienteService {
    List<Cliente> listar();
    Optional<Cliente> buscarPorId(Integer id);
    Cliente guardar(Cliente cliente);
    Cliente actualizar(Cliente cliente);
    void borrarPorId(Integer id);
}
