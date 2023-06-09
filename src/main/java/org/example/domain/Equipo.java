package org.example.domain;

import java.time.LocalDate;

import java.util.List;

public class Equipo {

    private String nombreDelEquipo;
    private  LocalDate fechaCreacion;
    private List<Jugador> listaDeJugadores;
    private Entrenador entrenador;

    public Equipo(String nombreDelEquipo,  LocalDate fechaCreacion, List<Jugador> listaDeJugadores, Entrenador entrenador) {
        this.nombreDelEquipo = nombreDelEquipo;
        this.fechaCreacion = fechaCreacion;
        this.listaDeJugadores = listaDeJugadores;
        this.entrenador = entrenador;
    }

    public String getNombreDelEquipo() {
        return nombreDelEquipo;
    }

    public void setNombreDelEquipo(String nombreDelEquipo) {
        this.nombreDelEquipo = nombreDelEquipo;
    }

    public LocalDate  getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate  fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<Jugador> getListaDeJugadores() {
        return listaDeJugadores;
    }

    public void setListaDeJugadores(List<Jugador> listaDeJugadores) {
        this.listaDeJugadores = listaDeJugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombreDelEquipo='" + nombreDelEquipo + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", listaDeJugadores=" + listaDeJugadores +
                ", entrenador=" + entrenador +
                '}';
    }

}

