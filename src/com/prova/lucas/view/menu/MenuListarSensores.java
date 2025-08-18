package com.prova.lucas.view.menu;

import com.prova.lucas.controller.SensorController;
import com.prova.lucas.dto.sensor.SensorResponse;
import com.prova.lucas.view.Leitor;

import java.util.List;

public class MenuListarSensores extends Menu<String>{

    private final SensorController sensorController;

    public MenuListarSensores(Leitor leitor, SensorController sensorController) {
        super(leitor);
        this.sensorController = sensorController;
    }

    @Override
    public void chamarMenu() {
        List<SensorResponse> sensores = sensorController.pegarSensores();
        System.out.println("===========================================");
        System.out.println("            Listar Sensores ");
        System.out.println("===========================================");
        int i = 0;
        sensores.forEach(System.out::println);

        System.out.println("-------------------------------------------");

        System.out.println(" S- Sair");
        System.out.println(" A- Atualizar");

        System.out.println("===========================================");

        setAcao(getLeitor().lerLinha().trim().toUpperCase());
    }

    @Override
    public void executarMenu() {
        setProximoMenu(
                switch (getAcao()){
                    case "S" -> new MenuPrincipal(getLeitor());
                    default -> this;
                }
        );
    }
}
