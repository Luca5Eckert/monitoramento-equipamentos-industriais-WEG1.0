package com.prova.lucas.model;

import com.prova.lucas.dto.SensorRequest;
import com.prova.lucas.infra.persistencia.mapper.SensorMapper;
import com.prova.lucas.infra.persistencia.mapper.SensorTemperaturaMapper;
import com.prova.lucas.infra.persistencia.mapper.SensorVibracaoMapper;
import com.prova.lucas.model.enumerator.TipoSensor;

public class SensorFactory {

    private final static SensorMapper SENSOR_MAPPER_VIBRACAO = new SensorVibracaoMapper();
    private final static SensorMapper SENSOR_MAPPER_TEMPERATURA = new SensorTemperaturaMapper();


    public static SensorMapper instanceOf(TipoSensor tipoSensor){
        return switch(tipoSensor){
            case TEMPERATURA -> SENSOR_MAPPER_TEMPERATURA;
            case VIBRACAO -> SENSOR_MAPPER_VIBRACAO;
        };
    }

}
