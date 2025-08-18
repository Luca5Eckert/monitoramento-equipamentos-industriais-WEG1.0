package com.prova.lucas.modal;

import com.prova.lucas.modal.enumerator.TipoSensor;

import java.util.List;

public class SensorVibracao extends Sensor{

    public SensorVibracao(String codigo, String nomeEquipamento, List<Medicao> medicoes) {
        super(codigo, nomeEquipamento, medicoes);
    }

    @Override
    public TipoSensor pegarTipoSensor() {
        return TipoSensor.VIBRACAO;
    }

    @Override
    public boolean verificarAlerta(Medicao medicao) {
        return medicao.getValor() == 60;
    }

}
