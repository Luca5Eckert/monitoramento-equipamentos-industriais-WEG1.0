package com.prova.lucas.model;

import com.prova.lucas.model.enumerator.TipoSensor;

import java.util.List;

public class SensorVibracao extends Sensor{

    public SensorVibracao(String codigo, String nomeEquipamento) {
        super(codigo, nomeEquipamento);
    }

    public SensorVibracao() {
        super();
    }

    @Override
    public double pegarLimiteParaAlerta() {
        return 60;
    }

    @Override
    public TipoSensor pegarTipoSensor() {
        return TipoSensor.VIBRACAO;
    }

    @Override
    public boolean verificarAlerta(Medicao medicao) {
        return medicao.getValor() == pegarLimiteParaAlerta();
    }

}
