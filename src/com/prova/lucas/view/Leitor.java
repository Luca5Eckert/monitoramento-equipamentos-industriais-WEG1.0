package com.prova.lucas.view;

import java.util.Scanner;

public class Leitor {

    private Scanner scanner = new Scanner(System.in);

    public String lerLinha(){
        try{
            return scanner.nextLine();
        } catch (RuntimeException e) {
            lidarErro(e);
            return lerLinha();
        }
    }

    public int lerNumeroInteiro(){
        try{
            int numero = scanner.nextInt();
            scanner.nextLine();
            return numero;
        } catch (RuntimeException e) {
            lidarErro(e);
            return lerNumeroInteiro();
        }
    }

    public double lerNumeroDouble(){
        try{
            double numero = scanner.nextDouble();
            scanner.nextLine();
            return numero;
        } catch (RuntimeException e) {
            lidarErro(e);
            return lerNumeroDouble();
        }
    }

    private void lidarErro(RuntimeException e) {
        System.out.println(" Erro em input!\n Tente novamente");
        scanner.nextLine();
    }

}
