package com.testemagalu.agendamento_notificacao_api.infrastructure.repositories;

import com.testemagalu.agendamento_notificacao_api.infrastructure.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
