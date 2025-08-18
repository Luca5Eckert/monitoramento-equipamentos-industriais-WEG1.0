package com.prova.lucas.view.menu;

import com.prova.lucas.controller.SensorController;
import com.prova.lucas.dto.sensor.SensorRequest;
import com.prova.lucas.dto.sensor.SensorResponse;
import com.prova.lucas.model.enumerator.TipoSensor;
import com.prova.lucas.view.Leitor;

public class MenuCadastrarSensor extends Menu<SensorRequest>{

    private final SensorController sensorController;

    public MenuCadastrarSensor(Leitor leitor, SensorController sensorController) {
        super(leitor);
        this.sensorController = sensorController;
    }

    @Override
    public void chamarMenu() {
        System.out.println("===========================================");
        System.out.println("              Cadastro Sensor");
        System.out.println("===========================================");
        System.out.println(" Nome do equipamento: ");
        String nomeEquipamento = getLeitor().lerLinha();

        System.out.println(" Tipo do sensor: ");
        TipoSensor.listarSensores();
        TipoSensor tipoSensor = TipoSensor.pegarTipoSensor(getLeitor().lerNumeroInteiro());

        System.out.println("===========================================");
        SensorRequest sensorRequest = new SensorRequest(nomeEquipamento, tipoSensor);
        setAcao(sensorRequest);
    }

    @Override
    public void executarMenu() {
        SensorResponse sensorResponse = sensorController.adicionarSensor(getAcao());
        System.out.println("Sensor cadastrado com sucesso!");
        System.out.println("Tipo: " + sensorResponse.tipoSensor() + " | Limite de alerta: " + sensorResponse.tipoSensor().getLimiteAlerta() );
        setProximoMenu(new MenuPrincipal(getLeitor()));
    }
}
