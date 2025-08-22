package com.prova.lucas.infra.persistencia.mapper;

import com.prova.lucas.dto.medicao.MedicaoRequest;
import com.prova.lucas.dto.medicao.MedicaoResponse;
import com.prova.lucas.model.Medicao;
import com.prova.lucas.model.enumerator.TipoSensor;

import java.time.LocalDateTime;

public class MedicaoMapper {

    public Medicao toEntity(MedicaoRequest medicaoRequest){
        return new Medicao(medicaoRequest.valor(), LocalDateTime.now());
    }

    public MedicaoResponse toResponse(Medicao medicao, TipoSensor tipoSensor, boolean alerta){
        return new MedicaoResponse(medicao.getValor(), medicao.pegarHorarioFormatado(), tipoSensor, alerta);
    }

}
