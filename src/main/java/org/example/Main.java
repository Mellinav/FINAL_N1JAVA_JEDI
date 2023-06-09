package org.example;

import org.example.domain.Equipo;
import org.example.domain.Jugador;
import org.example.servicios.AppServicio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Equipo>equipos=new ArrayList<>();
        AppServicio appServicio=new AppServicio();
        appServicio.cargarEquipo(equipos);

        for (Equipo equipo: equipos ){
            System.out.println(equipo);
        }


    }
}