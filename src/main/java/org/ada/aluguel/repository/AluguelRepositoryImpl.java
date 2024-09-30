package org.ada.aluguel.repository;

import org.ada.aluguel.models.Aluguel;
import org.ada.cliente.models.Cliente;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AluguelRepositoryImpl implements AluguelRepository {

    private Map<Cliente, Aluguel> aluguelDatabase = new HashMap<>();


    @Override
    public Aluguel inserir(Aluguel aluguel) {
        return aluguelDatabase.put(aluguel.getCliente(),aluguel);
    }

    @Override
    public Aluguel alterar(Aluguel aluguel) {
        return aluguelDatabase.replace(aluguel.getCliente(),aluguel);
    }

    @Override
    public Aluguel buscaPorId(String id) {
        return null;
    }

    @Override
    public Aluguel deletar(String id) {
        Aluguel aluguelParaDeletar = aluguelDatabase.values().stream().filter(aluguel -> aluguel.getUuid().equals(id)).findFirst().orElse(null);
        return aluguelDatabase.remove(aluguelParaDeletar.getCliente());
    }

    @Override
    public Aluguel buscarAluguelPorCliente(Cliente cliente) {
        return aluguelDatabase.get(cliente);
    }

    @Override
    public List<Aluguel> buscarTodosAlugueis() {
        return aluguelDatabase.values().stream().toList();
    }
}
