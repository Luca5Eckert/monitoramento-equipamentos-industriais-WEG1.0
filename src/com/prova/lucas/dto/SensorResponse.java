package com.prova.lucas.dto;

import com.prova.lucas.model.enumerator.TipoSensor;

public record SensorResponse(String codigo, String nomeEquipamento, TipoSensor tipoSensor) {
}
