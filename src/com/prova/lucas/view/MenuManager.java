package com.prova.lucas.view;

public class MenuManager {

    private final MenuProvider menuProvider;

    public MenuManager(MenuProvider menuProvider) {
        this.menuProvider = menuProvider;
    }

    public void executarFluxoMenu(){

        while(menuProvider.continuarFluxo()){
            menuProvider.executarMenu();
        }

    }

}
