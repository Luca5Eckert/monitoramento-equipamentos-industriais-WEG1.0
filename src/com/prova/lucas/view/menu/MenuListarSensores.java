package com.prova.lucas.view.menu;

import com.prova.lucas.controller.SensorController;
import com.prova.lucas.view.Leitor;

public class MenuListarSensores extends Menu<String>{

    private final SensorController sensorController;

    public MenuListarSensores(Leitor leitor, SensorController sensorController) {
        super(leitor);
        this.sensorController = sensorController;
    }

    @Override
    public void chamarMenu() {
        System.out.println("===========================================");
        System.out.println("            Listar Sensores ");
        System.out.println("===========================================");


    }

    @Override
    public void executarMenu() {

    }
}
