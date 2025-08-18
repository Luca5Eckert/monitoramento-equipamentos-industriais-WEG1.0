package com.prova.lucas.modal;

import com.prova.lucas.exception.SensorLimiteMedicaoException;
import com.prova.lucas.modal.enumerator.TipoSensor;

public class SensorTemperatura extends Sensor{


    @Override
    TipoSensor pegarTipoSensor() {
        return TipoSensor.TEMPERATURA;
    }

    @Override
    boolean verificarAlerta(Medicao medicao) {
        return medicao.getValor() > 80;
    }
}
