package com.testemagalu.agendamento_notificacao_api.business.mapper;

import com.testemagalu.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.testemagalu.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.testemagalu.agendamento_notificacao_api.infrastructure.entities.Agendamento;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.web.bind.annotation.Mapping;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    Agendamento paraEntity(AgendamentoRecord agendamento);

    AgendamentoRecordOut paraOut(Agendamento agendamento);

    @Mapping(target = "dataHoraModificacao", expression = "java(LocalDateTime.now()")
    @Mapping(target = "statusNotificacao", expression = "java(StatusNotificacaoEnum.CANCELADO)")
    Agendamento paraEntityCancelamento(@MappingTarget Agendamento agendamento);
}
