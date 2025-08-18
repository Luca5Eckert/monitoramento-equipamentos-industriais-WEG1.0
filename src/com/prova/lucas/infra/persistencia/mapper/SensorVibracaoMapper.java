package com.prova.lucas.infra.persistencia.mapper;

import com.prova.lucas.dto.sensor.SensorRequest;
import com.prova.lucas.dto.sensor.SensorResponse;
import com.prova.lucas.model.Sensor;
import com.prova.lucas.model.SensorVibracao;
import com.prova.lucas.util.BeansUtil;

import java.util.List;

public class SensorVibracaoMapper implements SensorMapper{

    @Override
    public Sensor toEntity(SensorRequest sensorRequest) {
        return new SensorVibracao(BeansUtil.instanceGeradorCodigo().gerarCodigo("SV"), sensorRequest.nomeEquipamento());
    }

    @Override
    public SensorResponse toResponse(Sensor sensor) {
        return new SensorResponse(sensor.getCodigo(), sensor.getNomeEquipamento(), sensor.pegarTipoSensor());
    }
}
