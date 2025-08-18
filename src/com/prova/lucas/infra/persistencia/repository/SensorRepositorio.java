package com.prova.lucas.infra.persistencia.repository;

import com.prova.lucas.model.Sensor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SensorRepositorio {

    private List<Sensor> sensores = new ArrayList<>();

    public void adicionar(Sensor sensor){
        sensores.add(sensor);
    }

    public Optional<Sensor> pegar(String codigo){
        for(Sensor sensor : sensores){
            if(sensor.getCodigo().equals(codigo)){
                return Optional.of(sensor);
            }
        }
        return Optional.empty();
    }

    public List<Sensor> pegarTodos(){
        return sensores;
    }

}
