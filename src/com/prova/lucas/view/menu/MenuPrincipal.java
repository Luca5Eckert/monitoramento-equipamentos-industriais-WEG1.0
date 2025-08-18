package com.prova.lucas.view.menu;

import com.prova.lucas.util.BeansUtil;
import com.prova.lucas.view.Leitor;

public class MenuPrincipal extends Menu<String> {

    public MenuPrincipal(Leitor leitor) {
        super(leitor);
    }

    @Override
    public void chamarMenu() {
        System.out.println("===========================================");
        System.out.println(" Sistema de Monitoramento WEG – Versão 1.0");
        System.out.println("===========================================");

        System.out.println(" 1- Cadastrar Sensor");
        System.out.println(" 2- Listar Sensores");
        System.out.println(" 3- Registrar Medição");
        System.out.println("\n 4- Exibir Historico de medições");
        System.out.println(" 5- Verificar Alertar");
        System.out.println(" 6- Listar Sensores Críticos");
        System.out.println("\n 0- Sair");

        System.out.println("===========================================");


        setAcao(getLeitor().lerLinha().trim().toUpperCase());
    }

    @Override
    public void executarMenu() {
        Menu<?> menu = switch (getAcao()){
            case "1" -> new MenuCadastrarSensor(getLeitor(), BeansUtil.instanceSensorController());
            case "2" -> new MenuListarSensores(getLeitor(), BeansUtil.instanceSensorController());
            case "3" -> new MenuRegistrarMedicao(getLeitor(), BeansUtil.instanceSensorController());
            case "0" -> null;
            default -> this;
        };
        setProximoMenu(menu);
    }
}
