package com.prova.lucas.controller.port;

import com.prova.lucas.dto.SensorRequest;
import com.prova.lucas.dto.SensorResponse;

import java.util.List;

public interface SensorService {

    SensorResponse adicionaSensor(SensorRequest sensorRequest);

    List<SensorResponse> pegarSensores();
}
