package com.prova.lucas.service;

import com.prova.lucas.controller.port.SensorService;
import com.prova.lucas.dto.medicao.MedicaoRequest;
import com.prova.lucas.dto.medicao.MedicaoResponse;
import com.prova.lucas.dto.sensor.SensorRequest;
import com.prova.lucas.dto.sensor.SensorResponse;
import com.prova.lucas.exception.SensorException;
import com.prova.lucas.infra.persistencia.mapper.SensorMapper;
import com.prova.lucas.infra.persistencia.repository.SensorRepositorio;
import com.prova.lucas.model.Medicao;
import com.prova.lucas.model.Sensor;
import com.prova.lucas.model.SensorFactory;

import java.time.LocalDateTime;
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

    @Override
    public MedicaoResponse registrarMedicao(MedicaoRequest medicaoRequest) {
        Medicao medicao = new Medicao(medicaoRequest.valor(), LocalDateTime.now());
        Sensor sensor = sensorRepositorio.pegar(medicaoRequest.codigoAssociado()).orElseThrow(() -> new SensorException("Código não correponde a nenhum sensor"));

        sensor.adicionarMedicao(medicao);

        return new MedicaoResponse(medicao.getValor(), medicao.pegarHorarioFormatado(), sensor.pegarTipoSensor());
    }

    private SensorResponse pegarResponse(Sensor sensor){
        SensorMapper sensorMapper = SensorFactory.instanceOf(sensor.pegarTipoSensor());
        return sensorMapper.toResponse(sensor);
    }
}
