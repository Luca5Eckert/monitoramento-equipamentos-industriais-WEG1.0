package com.prova.lucas.modal;

import com.prova.lucas.exception.SensorLimiteMedicaoException;
import com.prova.lucas.modal.enumerator.TipoSensor;

import java.util.List;

public class SensorTemperatura extends Sensor{


    public SensorTemperatura(String codigo, String nomeEquipamento, List<Medicao> medicoes) {
        super(codigo, nomeEquipamento, medicoes);
    }

    @Override
    TipoSensor pegarTipoSensor() {
        return TipoSensor.TEMPERATURA;
    }

    @Override
    boolean verificarAlerta(Medicao medicao) {
        return medicao.getValor() < 80;
    }
}
