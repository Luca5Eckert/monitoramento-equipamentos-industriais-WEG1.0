package com.prova.lucas.controller;

import com.prova.lucas.controller.port.SensorService;
import com.prova.lucas.dto.medicao.MedicaoRequest;
import com.prova.lucas.dto.medicao.MedicaoResponse;
import com.prova.lucas.dto.sensor.SensorAlertasResponse;
import com.prova.lucas.dto.sensor.SensorRequest;
import com.prova.lucas.dto.sensor.SensorResponse;

import java.util.List;

public class SensorController {

    private final SensorService sensorService;

    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    public SensorResponse adicionarSensor(SensorRequest sensorRequest){
        return sensorService.adicionaSensor(sensorRequest);
    }

    public List<SensorResponse> pegarSensores(){
        return sensorService.pegarSensores();
    }

    public MedicaoResponse registrarMedicao(MedicaoRequest medicaoRequest){
        return sensorService.registrarMedicao(medicaoRequest);
    }

    public List<MedicaoResponse> pegarHistoricoMedicoes(String codigo){
        return sensorService.pegarHistoricoMedicoes(codigo);
    }


    public List<SensorAlertasResponse> pegarAlertasSensores() {
        return sensorService.pegarAlertasSensores();
    }
}
