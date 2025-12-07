package com.relevos;

import com.relevos.dominio.Equipo;

public class Main {
    public static void main(String[] args) {
        Equipo Rojo = new Equipo("Rojo");
        Equipo Azul = new Equipo("Azul");
        Rojo.comenzarCarrera();
        Azul.comenzarCarrera();
        
    }
}