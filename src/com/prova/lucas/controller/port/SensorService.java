package com.prova.lucas.controller.port;

import com.prova.lucas.dto.SensorRequest;
import com.prova.lucas.dto.SensorResponse;

public interface SensorService {

    SensorResponse adicionaSensor(SensorRequest sensorRequest);
}
