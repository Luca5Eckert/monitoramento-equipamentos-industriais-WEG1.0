package com.prova.lucas.infra.persistencia.mapper;

import com.prova.lucas.dto.sensor.SensorRequest;
import com.prova.lucas.dto.sensor.SensorResponse;
import com.prova.lucas.model.Sensor;

public interface SensorMapper {

    Sensor toEntity(SensorRequest sensorRequest);

    SensorResponse toResponse(Sensor sensor);
}
