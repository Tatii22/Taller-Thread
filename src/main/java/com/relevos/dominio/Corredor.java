package com.relevos.dominio;

import java.util.Random;

public class Corredor extends Thread {
    private String nombre;
    private Corredor anterior; // Referencia al compañero que corre antes

    public Corredor(String nombre, Corredor anterior) {
        this.nombre = nombre;
        this.anterior = anterior;
    }

    @Override
    public void run() {
        try {
            // RELEVO
            if (anterior != null) {
                System.out.println(this.nombre + " esperando el testigo de " + anterior.getNombre());
                anterior.join(); 
            } else {
                System.out.println(this.nombre + " inicia la carrera... 🏁");
                System.out.println("🏁 ¡¡YAAAAA!! 🏁");
            }

            // CORRER
            System.out.println(this.nombre + " comenzo a correr 🏃");
            int tiempoCorrida = new Random().nextInt(2000) + 1000; 
            Thread.sleep(tiempoCorrida);

            // FIN DEL TRAMO
            System.out.println(this.nombre + " termino su tramo y pasa el testigo ✋");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public String getNombre() { return nombre; }
}   