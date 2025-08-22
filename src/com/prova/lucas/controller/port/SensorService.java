package com.prova.lucas.controller.port;

import com.prova.lucas.dto.medicao.MedicaoRequest;
import com.prova.lucas.dto.medicao.MedicaoResponse;
import com.prova.lucas.dto.sensor.SensorAlertasResponse;
import com.prova.lucas.dto.sensor.SensorRequest;
import com.prova.lucas.dto.sensor.SensorResponse;

import java.util.List;

public interface SensorService {

    SensorResponse adicionaSensor(SensorRequest sensorRequest);

    List<SensorResponse> pegarSensores();

    MedicaoResponse registrarMedicao(MedicaoRequest medicaoRequest);

    List<MedicaoResponse> pegarHistoricoMedicoes(String codigo);

    List<SensorAlertasResponse> pegarAlertasSensores();

    List<SensorAlertasResponse> pegarAlertasCriticosSensores();
}
