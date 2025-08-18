package com.prova.lucas.dto.sensor;

import com.prova.lucas.model.enumerator.TipoSensor;

public record SensorRequest(String nomeEquipamento, TipoSensor tipoSensor) {
}
