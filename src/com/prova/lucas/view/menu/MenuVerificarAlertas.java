package com.prova.lucas.view.menu;

import com.prova.lucas.controller.SensorController;
import com.prova.lucas.dto.sensor.SensorAlertasResponse;
import com.prova.lucas.view.Leitor;

import java.util.List;

public class MenuVerificarAlertas extends Menu<String> {

    private final SensorController sensorController;

    public MenuVerificarAlertas(Leitor leitor, SensorController sensorController) {
        super(leitor);
        this.sensorController = sensorController;
    }


    @Override
    public void chamarMenu() {
        List<SensorAlertasResponse> sensorAlertasResponseList = sensorController.pegarAlertasSensores();
        String mensagem = sensorAlertasResponseList.isEmpty() ? " Nenhuma sensor adiciona " : "";
        System.out.println("===========================================");
        System.out.println("                  ALERTAS                  ");
        System.out.println("===========================================");
        System.out.println(" S - Sair");
        System.out.println("-------------------------------------------");
        System.out.println(" Verificando Alertas: \n");

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
