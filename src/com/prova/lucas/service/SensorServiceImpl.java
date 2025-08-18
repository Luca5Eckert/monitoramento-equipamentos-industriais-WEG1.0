package com.prova.lucas.service;

import com.prova.lucas.controller.port.SensorService;
import com.prova.lucas.dto.sensor.SensorRequest;
import com.prova.lucas.dto.sensor.SensorResponse;
import com.prova.lucas.infra.persistencia.mapper.SensorMapper;
import com.prova.lucas.infra.persistencia.repository.SensorRepositorio;
import com.prova.lucas.model.Sensor;
import com.prova.lucas.model.SensorFactory;

import java.util.ArrayList;
import java.util.List;

public class SensorServiceImpl implements SensorService {

    private final SensorRepositorio sensorRepositorio;

    public SensorServiceImpl(SensorRepositorio sensorRepositorio) {
        this.sensorRepositorio = sensorRepositorio;
    }

    @Override
    public SensorResponse adicionaSensor(SensorRequest sensorRequest) {
        SensorMapper sensorMapper = SensorFactory.instanceOf(sensorRequest.tipoSensor());

        Sensor sensor = sensorMapper.toEntity(sensorRequest);
        sensorRepositorio.adicionar(sensor);

        return sensorMapper.toResponse(sensor);
    }

    @Override
    public List<SensorResponse> pegarSensores() {
        List<SensorResponse> sensoresResponses = new ArrayList<>();

        for(Sensor sensor : sensorRepositorio.pegarTodos()){
            sensoresResponses.add(pegarResponse(sensor));
        }
        return sensoresResponses;
    }

    private SensorResponse pegarResponse(Sensor sensor){
        SensorMapper sensorMapper = SensorFactory.instanceOf(sensor.pegarTipoSensor());
        return sensorMapper.toResponse(sensor);
    }
}
