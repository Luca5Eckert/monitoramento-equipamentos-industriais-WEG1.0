package com.prova.lucas.model;

import com.prova.lucas.model.enumerator.TipoSensor;

import java.util.List;

public class SensorTemperatura extends Sensor{


    public SensorTemperatura(String codigo, String nomeEquipamento, List<Medicao> medicoes) {
        super(codigo, nomeEquipamento, medicoes);
    }

    public SensorTemperatura() {
    }

    @Override
    public double pegarLimiteParaAlerta(){
        return 80;
    }

    @Override
    public TipoSensor pegarTipoSensor() {
        return TipoSensor.TEMPERATURA;
    }

    @Override
    boolean verificarAlerta(Medicao medicao) {
        return medicao.getValor() < pegarLimiteParaAlerta();
    }
}
