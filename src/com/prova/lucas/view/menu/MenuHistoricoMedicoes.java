package com.prova.lucas.view.menu;

import com.prova.lucas.controller.SensorController;
import com.prova.lucas.dto.medicao.MedicaoResponse;
import com.prova.lucas.view.Leitor;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MenuHistoricoMedicoes extends Menu<String> {

    private final SensorController sensorController;

    public MenuHistoricoMedicoes(Leitor leitor, SensorController sensorController) {
        super(leitor);
        this.sensorController = sensorController;
    }

    @Override
    public void chamarMenu() {
        System.out.println("===========================================");
        System.out.println("              Historico Sensor             ");
        System.out.println("===========================================");
        System.out.println(" S- Sair");
        System.out.println("-------------------------------------------");
        System.out.println(" Código do sensor: ");
        String codigoEquipamento = getLeitor().lerLinha();

        System.out.println("===========================================");
        setAcao(codigoEquipamento);
    }

    @Override
    public void executarMenu() {
        if(veficarSaida()) return;

        List<MedicaoResponse> medicoes = sensorController.pegarHistoricoMedicoes(getAcao());

        mostrarHistorico(medicoes);

        if(veficarSaida()) return;

        setProximoMenu(this);
    }

    private boolean veficarSaida() {
        if (getAcao().equalsIgnoreCase("S")) {
            setProximoMenu(new MenuPrincipal(getLeitor()));
            return true;
        }
        return false;
    }

    private void mostrarHistorico(List<MedicaoResponse> medicoes) {
        System.out.println("===========================================");
        System.out.println("              Historico Sensor             ");
        System.out.println("===========================================");
        System.out.println(" S- Sair");
        System.out.println("-------------------------------------------");
        System.out.println(" Histórico de Medições do sensor " + getAcao() + "\n" );

        AtomicInteger i = new AtomicInteger(1);
        medicoes.forEach(medicaoResponse -> System.out.println(" " + i.getAndIncrement() + ". " + medicaoResponse));

        System.out.println("===========================================");

        setAcao(getLeitor().lerLinha());

    }
}
