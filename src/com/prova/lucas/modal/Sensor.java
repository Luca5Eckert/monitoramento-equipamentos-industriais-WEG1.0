package com.prova.lucas.modal;

import com.prova.lucas.modal.enumerator.TipoSensor;

public abstract class Sensor {

    private String codigo;
    private String nome;

    abstract TipoSensor pegarTipoSensor();

    abstract boolean verificarAlerta(Medicao medicao);

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
