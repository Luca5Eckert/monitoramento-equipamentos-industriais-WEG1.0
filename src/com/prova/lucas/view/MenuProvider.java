package com.prova.lucas.view;

import com.prova.lucas.view.menu.Menu;

public class MenuProvider {

    private Menu<?> menu;

    public MenuProvider(Menu<?> menu) {
        this.menu = menu;
    }

    public boolean continuarFluxo() {
        return menu != null;
    }

    public void executarMenu() {
        try {
            menu.chamarMenu();
            menu.executarMenu();
            menu = menu.proximoMenu();
        } catch (RuntimeException runtimeException){
            System.out.println(runtimeException.getMessage());
        }
    }
}
