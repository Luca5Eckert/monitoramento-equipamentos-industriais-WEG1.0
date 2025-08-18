package com.prova.lucas.view.menu;

import com.prova.lucas.controller.SensorController;
import com.prova.lucas.dto.medicao.MedicaoRequest;
import com.prova.lucas.dto.medicao.MedicaoResponse;
import com.prova.lucas.dto.sensor.SensorResponse;
import com.prova.lucas.view.Leitor;

public class MenuRegistrarMedicao extends Menu<MedicaoRequest>{

    private final SensorController sensorController;

    public MenuRegistrarMedicao(Leitor leitor, SensorController sensorController) {
        super(leitor);
        this.sensorController = sensorController;
    }

    @Override
    public void chamarMenu() {
        System.out.println("===========================================");
        System.out.println("            Registrar Medições ");
        System.out.println("===========================================");
        System.out.println(" S - Sair");

        System.out.println(" Digite o código do sensor: ");
        String codigoSensor = getLeitor().lerLinha();

        if(codigoSensor.trim().equalsIgnoreCase("S")){
            setProximoMenu(new MenuPrincipal(getLeitor()));
            return;
        }

        System.out.println(" Digite o valor da medição: ");
        double valorMedicao = getLeitor().lerNumeroDouble();

        System.out.println("\n===========================================");


        setAcao(new MedicaoRequest(codigoSensor, valorMedicao));

    }

    @Override
    public void executarMenu() {
        if(getProximoMenu() != null){
            return;
        }

        MedicaoResponse medicaoResponse = sensorController.registrarMedicao(getAcao());
        System.out.println("\n Medição registrada com sucesso!");

        if(!medicaoResponse.alerta()){
            System.out.println("\n AlERTA: Medição fora do limite técnico! ( " + getAcao().valor() + " " + medicaoResponse.tipoSensor().getSimbolo() + " " + medicaoResponse.tipoSensor().getLimiteAlerta() + " )" );
        }

        setProximoMenu(new MenuPrincipal(getLeitor()));
    }
}
