package com.prova.lucas.infra.persistencia;

public class GeradorCodigo {
    public static int contagem = 0;

    public synchronized String gerarCodigo(String sigla){
        contagem++;
        return "" + sigla + contagem;
    }
}
