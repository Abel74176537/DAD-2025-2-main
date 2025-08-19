package com.example.ms_cliente.Service.Impl;

import com.example.ms_cliente.Entity.Cliente;
import com.example.ms_cliente.Repository.ClienteRepository;
import com.example.ms_cliente.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listar() {return clienteRepository.findAll();}

    @Override
    public Optional<Cliente> buscarPorId(Integer id) {return clienteRepository.findById(id);}

    @Override
    public Cliente guardar(Cliente cliente) {return clienteRepository.save(cliente);}

    @Override
    public Cliente actualizar(Cliente cliente) {return clienteRepository.save(cliente);}

    @Override
    public void borrarPorId(Integer id) {clienteRepository.deleteById(id);}
}