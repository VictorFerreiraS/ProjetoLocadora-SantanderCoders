package org.ada.agencia.repository;

import org.ada.agencia.models.Agencia;

import java.util.HashMap;
import java.util.Map;

public class AgenciaRepositoryInMemoryImpl implements AgenciaRepository {

    private final Map<String, Agencia> agenciaDatabase = new HashMap<>();

    @Override
    public Agencia buscaPorNome(String nome) {
        return agenciaDatabase.values().stream().filter(agencia -> agencia.getNome().equals(nome)).findFirst().orElse(null);
    }

    @Override
    public Agencia inserir(Agencia agencia) {
        agenciaDatabase.put(agencia.getUuid(),agencia);
        return agencia;
    }

    @Override
    public Agencia alterar(Agencia agencia) {
        agenciaDatabase.put(agencia.getUuid(),agencia);
        return agencia;
    }

    @Override
    public Agencia deletar(Agencia agencia) {
        agenciaDatabase.remove(agencia.getUuid());
        return agencia;
    }

    @Override
    public Agencia buscaPorId(String id) {
        return agenciaDatabase.values().stream().filter(agencia -> agencia.getUuid().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Agencia deletarPorId(String id) {
        Agencia tempAgencia = buscaPorId(id);
        agenciaDatabase.remove(id);
        return tempAgencia;
    }
}
