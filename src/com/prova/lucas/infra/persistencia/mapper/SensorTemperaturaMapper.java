package com.prova.lucas.infra.persistencia.mapper;

import com.prova.lucas.dto.sensor.SensorRequest;
import com.prova.lucas.dto.sensor.SensorResponse;
import com.prova.lucas.model.Sensor;
import com.prova.lucas.model.SensorTemperatura;
import com.prova.lucas.util.BeansUtil;

import java.util.List;

public class SensorTemperaturaMapper implements SensorMapper{
    @Override
    public Sensor toEntity(SensorRequest sensorRequest) {
        return new SensorTemperatura(BeansUtil.instanceGeradorCodigo().gerarCodigo("ST"), sensorRequest.nomeEquipamento());
    }

    @Override
    public SensorResponse toResponse(Sensor sensor) {
        return new SensorResponse(sensor.getCodigo(), sensor.getNomeEquipamento(), sensor.pegarTipoSensor());
    }
}
