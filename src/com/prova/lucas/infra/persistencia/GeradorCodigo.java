package com.prova.lucas.infra.persistencia;

public class GeradorCodigo {
    public static int contagem = 0;

    public static String gerarCodigo(char character){
        return "" + character + contagem;
    }
}
