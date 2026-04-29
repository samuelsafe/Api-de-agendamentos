package com.apideagendamento.api_de_agendamento.service;

import com.apideagendamento.api_de_agendamento.model.Agendamento;
import com.apideagendamento.api_de_agendamento.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;

    public AgendamentoService(AgendamentoRepository repository) {
        this.repository = repository;
    }

    public Agendamento criar(Agendamento agendamento) {
        return repository.save(agendamento);
    }

    public List<Agendamento> listarTodos() {
        return repository.findAll();
    }

    public Agendamento buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agendamento não encontrado! ID: " + id));
    }

    public Agendamento cancelar(Long id) {
        Agendamento agendamento = buscarPorId(id);
        agendamento.setStatus(Agendamento.Status.CANCELADO);
        return repository.save(agendamento);
    }
}
