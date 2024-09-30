package org.ada.comprovante.service;

import org.ada.comprovante.models.Comprovante;
import org.ada.comprovante.models.ComprovanteGeneratable;
import org.ada.comprovante.repository.ComprovanteRepository;

import java.time.LocalDateTime;
import java.util.List;

public abstract class ComprovanteService<T extends ComprovanteGeneratable> {

    protected final ComprovanteRepository<T> comprovanteRepository;

    public ComprovanteService(ComprovanteRepository<T> comprovanteRepository) {
        this.comprovanteRepository = comprovanteRepository;
    }

    public Comprovante<T> criarComprovante(Comprovante<T> comprovante) {
        return comprovanteRepository.inserir(comprovante);
    }

    public Comprovante<T> buscarComprovantePorId(String id) {
        return comprovanteRepository.buscaPorId(id);
    }

    public List<Comprovante<T>> buscarComprovantesPorData(LocalDateTime dataEmissao) {
        return comprovanteRepository.buscarComprovantesPorData(dataEmissao);
    }

    public List<Comprovante<T>> buscarTodosComprovantes() {
        return comprovanteRepository.buscarTodosComprovantes();
    }

    public Comprovante<T> atualizarComprovante(Comprovante<T> comprovante) {
        return comprovanteRepository.alterar(comprovante);
    }

    public Comprovante<T> deletarComprovante(Comprovante<T> comprovante) {
        return comprovanteRepository.deletar(comprovante);
    }
}
