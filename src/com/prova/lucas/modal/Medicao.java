package com.prova.lucas.modal;

import com.prova.lucas.util.DateUtil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Medicao {

    private double valor;
    private LocalDateTime dataHora;

    public Medicao(double valor, LocalDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public double getValor() {
        return valor;
    }

    public String pegarHorarioFormatado(){
        return dataHora.format(DateUtil.pegarFormatacaoData());
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString(){
        return " Valor: " + valor
                + " | Data: " + pegarHorarioFormatado();
    }

}
