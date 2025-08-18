package com.prova.lucas.model.enumerator;

import com.prova.lucas.exception.SensorException;
import com.prova.lucas.model.SensorTemperatura;
import com.prova.lucas.model.SensorVibracao;

public enum TipoSensor {

    TEMPERATURA(new SensorTemperatura().pegarLimiteParaAlerta()),
    VIBRACAO(new SensorVibracao().pegarLimiteParaAlerta());

    private double limiteAlerta;

    TipoSensor(double limiteAlerta){
        this.limiteAlerta = limiteAlerta;
    }

    public double getLimiteAlerta() {
        return limiteAlerta;
    }

    public static void listarSensores() {
        for(int i = 0; i < TipoSensor.values().length; i++){
            System.out.println(" " + i + " - " + TipoSensor.values()[i] );
        }
    }

    public static TipoSensor pegarTipoSensor(int i){
        if( i > TipoSensor.values().length-1 || i < 0){
            throw new SensorException(" Tipo não existe\n Digite um número de 0 a " + (TipoSensor.values().length-1));
        }
        return TipoSensor.values()[i];
    }

}
