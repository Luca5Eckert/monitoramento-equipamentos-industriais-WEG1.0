package com.prova.lucas.modal;

import com.prova.lucas.modal.enumerator.TipoSensor;

public abstract class Sensor {

    private String codigo;
    private String nomeEquipamento;

    abstract TipoSensor pegarTipoSensor();

    abstract boolean verificarAlerta(Medicao medicao);

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }
}
