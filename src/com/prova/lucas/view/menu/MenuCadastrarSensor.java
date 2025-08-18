package com.prova.lucas.view.menu;

import com.prova.lucas.dto.SensorDto;
import com.prova.lucas.dto.SensorRequest;
import com.prova.lucas.view.Leitor;

public class MenuCadastrarSensor extends Menu<SensorRequest>{

    public MenuCadastrarSensor(SensorRequest acao, Menu<?> proximoMenu, Leitor leitor) {
        super(acao, proximoMenu, leitor);
    }

    @Override
    public void chamarMenu() {
        System.out.println("===========================================");
        System.out.println("              Cadastro Sensor");
        System.out.println("===========================================");
        System.out.println(" Nome do equipamento: ");
        String nomeEquipamento = getLeitor().lerLinha();

        System.out.println();

    }

    @Override
    public void executarMenu() {

    }
}
