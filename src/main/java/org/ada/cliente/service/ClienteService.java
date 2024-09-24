package org.ada.cliente.service;

import org.ada.cliente.models.Cliente;
import org.ada.cliente.repository.ClienteRepository;

public abstract class ClienteService {

    protected final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente criarCliente(Cliente cliente) {
       return clienteRepository.inserir(cliente);
    }
    public Cliente alterarCliente(Cliente cliente) {
        return clienteRepository.alterar(cliente);
    }

    public Cliente removerCliente(Cliente cliente) {
        return clienteRepository.deletar(cliente);
    }

    public Cliente removerCliente(String id) {
        return clienteRepository.deletarPorId(id);
    }

    public Cliente buscarCliente(String id) {
        return clienteRepository.buscaPorId(id);
    }
}

