package com.relevos.dominio;


public class Equipo {
    String nombreEquipo;
    Corredor c1;
    Corredor c2;
    Corredor c3;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void iniciarCarrera() {
        System.out.println("Iniciando carrera del equipo: " + nombreEquipo);
        c1 = new Corredor("Corredor 1 de " + nombreEquipo, null);
        c2 = new Corredor("Corredor 2 de " + nombreEquipo, c1);
        c3 = new Corredor("Corredor 3 de " + nombreEquipo, c2);
        c1.start();
        c2.start();
        c3.start();
    } 
    
}
