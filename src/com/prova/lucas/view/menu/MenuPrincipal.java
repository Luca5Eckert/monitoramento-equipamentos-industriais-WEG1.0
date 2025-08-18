package com.prova.lucas.view.menu;

import com.prova.lucas.view.Leitor;

public class MenuPrincipal extends Menu<String> {

    public MenuPrincipal(String acao, Menu<?> proximoMenu, Leitor leitor) {
        super(acao, proximoMenu, leitor);
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
    }

    @Override
    public void executarMenu() {

    }
}
