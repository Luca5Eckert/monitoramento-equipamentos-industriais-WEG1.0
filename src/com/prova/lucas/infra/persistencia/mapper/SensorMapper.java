package com.prova.lucas.infra.persistencia.mapper;

import com.prova.lucas.dto.SensorRequest;
import com.prova.lucas.dto.SensorResponse;
import com.prova.lucas.model.Sensor;

public interface SensorMapper {

    Sensor toEntity(SensorRequest sensorRequest);

    SensorResponse toResponse(Sensor sensor);
}
