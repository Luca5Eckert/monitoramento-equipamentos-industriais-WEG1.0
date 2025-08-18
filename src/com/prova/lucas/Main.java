package com.prova.lucas;

import com.prova.lucas.view.Leitor;
import com.prova.lucas.view.MenuManager;
import com.prova.lucas.view.MenuProvider;
import com.prova.lucas.view.menu.MenuPrincipal;

public class Main {

    public static void main(String[] args) {

        MenuManager menuManager = new MenuManager(new MenuProvider(new MenuPrincipal(new Leitor())));
        menuManager.executarFluxoMenu();
    }

}