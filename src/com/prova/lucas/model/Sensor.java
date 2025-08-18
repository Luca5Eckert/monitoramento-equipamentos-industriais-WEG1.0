package com.prova.lucas.model;

import com.prova.lucas.exception.SensorException;
import com.prova.lucas.model.enumerator.TipoSensor;

import java.util.ArrayList;
import java.util.List;

public abstract class Sensor {

    private String codigo;
    private String nomeEquipamento;
    private List<Medicao> medicoes = new ArrayList<>();

    public Sensor() {
    }

    public Sensor(String codigo, String nomeEquipamento) {
        this.codigo = codigo;
        this.nomeEquipamento = nomeEquipamento;
    }

    public void adicionarMedicao(Medicao medicao){
        if(medicao == null) {
            throw new SensorException("Não é possível adicionar medição vazia");
        }
        medicoes.add(medicao);
    }

    public abstract double pegarLimiteParaAlerta();

    public abstract TipoSensor pegarTipoSensor();

    boolean verificarAlerta(Medicao medicao){
        return medicao.getValor() < pegarLimiteParaAlerta();
    }

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

    public List<Medicao> getMedicoes() {
        return medicoes;
    }

    @Override
    public String toString(){
        return " Codigo: " + codigo
                + " Nome do equipamento: " + nomeEquipamento
                + " Tipo Sensor: " + pegarTipoSensor();
    }
}
