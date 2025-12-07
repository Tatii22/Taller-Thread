package com.relevos.dominio;

import java.util.Random;

public class Corredor implements Runnable {
    private String nombre;

    public Corredor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.nombre + " recibe el testigo y comienza a correr :)");
            
            // Esfuerzo
            int tiempo = new Random().nextInt(2000) + 1000;
            Thread.sleep(tiempo);
            
            System.out.println(this.nombre + " terminó su tramo y pasa el testigo :D");
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}