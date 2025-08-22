package com.prova.lucas.dto.medicao;

import com.prova.lucas.model.enumerator.TipoSensor;

public record MedicaoResponse(double valor, String data, TipoSensor tipoSensor, boolean alerta) {


    @Override
    public String toString() {
        String mensagem = "";
        if(alerta) mensagem = " ALERTA";

        return "Valor: " + valor + " | " + "Data: " + data + mensagem;
    }
}
