package com.prova.lucas.infra.persistencia;

public class GeradorCodigo {
    public static int contagem = 0;

    public String gerarCodigo(String sigla){
        return "" + sigla + contagem;
    }
}
