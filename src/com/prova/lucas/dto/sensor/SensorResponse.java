package com.prova.lucas.dto.sensor;

import com.prova.lucas.model.enumerator.TipoSensor;

public record SensorResponse(String codigo, String nomeEquipamento, TipoSensor tipoSensor) {

    @Override
    public String toString(){
        return "Código: " + codigo + " | " + "Tipo: " + tipoSensor + " | " + "Equipamento: " + nomeEquipamento;
    }

}
