package com.prova.lucas.util;

import com.prova.lucas.controller.SensorController;
import com.prova.lucas.controller.port.SensorService;
import com.prova.lucas.infra.persistencia.GeradorCodigo;
import com.prova.lucas.infra.persistencia.repository.SensorRepositorio;
import com.prova.lucas.service.SensorServiceImpl;

public class BeansUtil {
    private static final GeradorCodigo GERADOR_CODIGO = new GeradorCodigo();
    private static final SensorRepositorio SENSOR_REPOSITORIO = new SensorRepositorio();
    private static final SensorService SENSOR_SERVICE = new SensorServiceImpl(SENSOR_REPOSITORIO);
    private static final SensorController SENSOR_CONTROLLER = new SensorController(SENSOR_SERVICE);

    public static GeradorCodigo instanceGeradorCodigo(){
        return GERADOR_CODIGO;
    }

    public static SensorService instanceSensorService(){
        return SENSOR_SERVICE;
    }

    public static SensorController instanceSensorController(){
        return SENSOR_CONTROLLER;
    }



}
