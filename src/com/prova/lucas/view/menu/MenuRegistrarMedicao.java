package com.prova.lucas.view.menu;

import com.prova.lucas.dto.medicao.MedicaoRequest;
import com.prova.lucas.view.Leitor;

public class MenuRegistrarMedicao extends Menu<MedicaoRequest>{


    public MenuRegistrarMedicao(Leitor leitor) {
        super(leitor);
    }

    @Override
    public void chamarMenu() {
        System.out.println("===========================================");
        System.out.println("            Registrar Medições ");
        System.out.println("===========================================");

        System.out.println(" Digite o código do sensor: ");
        String codigoSensor = getLeitor().lerLinha();

        System.out.println(" Digite o valor da medição: ");
        double valorMedicao = getLeitor().lerNumeroDouble();

        System.out.println("\n===========================================");

        setAcao(new MedicaoRequest(codigoSensor, valorMedicao));

    }

    @Override
    public void executarMenu() {

    }
}
