package com.prova.lucas.modal;

import com.prova.lucas.exception.SensorException;
import com.prova.lucas.modal.enumerator.TipoSensor;

import java.util.ArrayList;
import java.util.List;

public abstract class Sensor {

    private String codigo;
    private String nomeEquipamento;
    private List<Medicao> medicoes = new ArrayList<>();

    public Sensor(String codigo, String nomeEquipamento, List<Medicao> medicoes) {
        this.codigo = codigo;
        this.nomeEquipamento = nomeEquipamento;
        this.medicoes = medicoes;
    }

    public void adicionarMedicao(Medicao medicao){
        if(medicao == null) {
            throw new SensorException("Não é possível adicionar medição vazia");
        }
        medicoes.add(medicao);
    }

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
