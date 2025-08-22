package com.prova.lucas.dto.sensor;

import com.prova.lucas.model.enumerator.TipoSensor;

public record SensorAlertasResponse(String codigo, TipoSensor tipoSensor, String nomeEquipamento, int numeroAlertas) {

    @Override
    public String toString() {
        return " Código: " + codigo + " | Tipo: " + tipoSensor + " | Equipamento: " + nomeEquipamento + " | Alertas: " + numeroAlertas;
    }

    public String exibirAlertaSensor(){
        String mensagem =  numeroAlertas == 0 ? "Nenhum alerta" : numeroAlertas + " Alerta(s) detectado(s) ";
        return " Sensor " + codigo + " (" + tipoSensor + ") - " + nomeEquipamento + ": \n " + mensagem;
    }
}
