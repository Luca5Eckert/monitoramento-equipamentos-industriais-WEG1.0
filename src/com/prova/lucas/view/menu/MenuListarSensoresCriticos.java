package com.prova.lucas.view.menu;

import com.prova.lucas.controller.SensorController;
import com.prova.lucas.dto.sensor.SensorAlertasResponse;
import com.prova.lucas.view.Leitor;

import java.util.List;

public class MenuListarSensoresCriticos extends Menu<String>{

    private final SensorController sensorController;

    public MenuListarSensoresCriticos(Leitor leitor, SensorController sensorController) {
        super(leitor);
        this.sensorController = sensorController;
    }

    @Override
    public void chamarMenu() {
        List<SensorAlertasResponse> sensorAlertasResponseList = sensorController.pegarAlertasCriticosSensores();
        String mensagem = sensorAlertasResponseList.isEmpty() ? " Nenhum sensor em estado critico" : " ATENÇÃO: Inspeção imediata recomendada!";
        System.out.println("===========================================");
        System.out.println("              ALERTAS CRITICOS             ");
        System.out.println("===========================================");
        System.out.println(" S - Sair");
        System.out.println("-------------------------------------------");
        System.out.println(" Sensores com mais de 3 alertas: \n");

        sensorAlertasResponseList.forEach(sensorAlertasResponse -> System.out.println(sensorAlertasResponse.exibirAlertaSensor()));

        System.out.println(mensagem);
        System.out.println("===========================================");

        setAcao(getLeitor().lerLinha());
    }

    @Override
    public void executarMenu() {
        if(getAcao().equalsIgnoreCase("S")){
            setProximoMenu(new MenuPrincipal(getLeitor()));
            return;
        }
        setProximoMenu(this);
    }
}
