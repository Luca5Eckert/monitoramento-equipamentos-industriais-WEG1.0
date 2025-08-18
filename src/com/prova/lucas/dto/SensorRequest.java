package com.prova.lucas.dto;

import com.prova.lucas.modal.enumerator.TipoSensor;

public record SensorRequest(String nomeEquipamento, TipoSensor tipoSensor) {
}
