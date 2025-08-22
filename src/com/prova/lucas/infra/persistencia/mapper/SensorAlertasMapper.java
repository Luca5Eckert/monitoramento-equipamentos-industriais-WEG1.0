package com.prova.lucas.infra.persistencia.mapper;

import com.prova.lucas.dto.sensor.SensorAlertasResponse;
import com.prova.lucas.model.Sensor;

public class SensorAlertasMapper {

    public SensorAlertasResponse toResponse(Sensor sensor){
        return new SensorAlertasResponse(sensor.getCodigo(), sensor.pegarTipoSensor(), sensor.getNomeEquipamento(), sensor.pegarQuantidadeAlertas());
    }

}
