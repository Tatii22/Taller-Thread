package com.relevos.dominio;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Equipo {
    private String nombreEquipo;
    private ExecutorService organizador;
    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.organizador = Executors.newSingleThreadExecutor();
    }

    public void comenzarCarrera() {
        System.out.println("El equipo " + nombreEquipo + " esta listo en la línea de salida.");

        Corredor c1 = new Corredor("Corredor 1 del equipo "+ nombreEquipo);
        Corredor c2 = new Corredor("Corredor 2 del equipo "+ nombreEquipo);
        Corredor c3 = new Corredor("Corredor 3 del equipo "+ nombreEquipo );

        organizador.execute(c1);
        organizador.execute(c2);
        organizador.execute(c3);


        organizador.shutdown();
    }
    
}