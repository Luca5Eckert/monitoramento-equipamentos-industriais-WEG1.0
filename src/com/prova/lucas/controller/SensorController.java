package com.prova.lucas.controller;

import com.prova.lucas.controller.port.SensorService;
import com.prova.lucas.dto.SensorRequest;
import com.prova.lucas.dto.SensorResponse;

public class SensorController {

    private final SensorService sensorService;

    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    public SensorResponse adicionarSensor(SensorRequest sensorRequest){
        return sensorService.adicionaSensor(sensorRequest);
    }
}
