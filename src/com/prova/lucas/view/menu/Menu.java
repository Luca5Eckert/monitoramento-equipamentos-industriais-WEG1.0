package com.prova.lucas.view.menu;

import com.prova.lucas.view.Leitor;

public abstract class Menu<TipoDado> {
    private TipoDado acao;
    private Menu<?> proximoMenu;
    private Leitor leitor;

    public Menu(Leitor leitor) {
        this.leitor = leitor;
    }

    public abstract void chamarMenu();

    public abstract void executarMenu();

    public Menu<?> proximoMenu(){
        return proximoMenu;
    }

    public TipoDado getAcao() {
        return acao;
    }

    public void setAcao(TipoDado acao) {
        this.acao = acao;
    }

    public Menu<?> getProximoMenu() {
        return proximoMenu;
    }

    public void setProximoMenu(Menu<?> proximoMenu) {
        if(proximoMenu == null){
            System.out.println("Encerrando sistema... Obrigado por usar o Monitoramento WEG!");
        }
        this.proximoMenu = proximoMenu;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }
}
