package org.example.servicios;

import org.example.domain.Entrenador;

public class EntrenadorServicio {

    public Entrenador crearEntrenador(String nombre,String apellido,Integer edad){
        Entrenador nuevoEntrenador = new Entrenador(nombre, apellido, edad);
        return nuevoEntrenador;
    }
}
