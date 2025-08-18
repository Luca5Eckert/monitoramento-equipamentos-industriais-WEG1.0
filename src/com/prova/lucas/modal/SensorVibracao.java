package com.prova.lucas.modal;

import com.prova.lucas.modal.enumerator.TipoSensor;

public class SensorVibracao extends Sensor{


    @Override
    public TipoSensor pegarTipoSensor() {
        return TipoSensor.VIBRACAO;
    }

    @Override
    public boolean verificarAlerta(Medicao medicao) {
        return medicao.getValor() != 60;
    }

}
